package org.acme.graphql.client.typesafe.models;

import org.eclipse.microprofile.graphql.Ignore;
import org.eclipse.microprofile.graphql.Name;

import java.util.Collection;

/**
 * @author mskacelik
 **/
public class EmergencyCallCenter extends Telephone {
    @Name("listOfFireStations")
    Collection<FireStation> fireStations;

    @Name("listOfHospitals")
    Collection<Hospital> hospitals;

    @Name("listOfPoliceStations")
    Collection<PoliceStation> policeStations;

    @Ignore
    String ignoredField;

}

