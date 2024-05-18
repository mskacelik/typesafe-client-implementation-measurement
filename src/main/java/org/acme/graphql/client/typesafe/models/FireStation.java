package org.acme.graphql.client.typesafe.models;

import org.eclipse.microprofile.graphql.Name;

import java.util.List;
/**
 * @author mskacelik
 **/
public class FireStation extends Station {
    @Name("list-of-fire-fighters")
    List<FireFighter> fireFighters;
    @Name("list-of-fire-trucks")
    FireTruck[] fireTrucks;

    static class FireTruck {
        @Name("license-plate")
        String licensePlate;
        @Name("fuel-capacity")
        double fuel;
    }
}

