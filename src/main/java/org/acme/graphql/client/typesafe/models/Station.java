package org.acme.graphql.client.typesafe.models;

import org.eclipse.microprofile.graphql.Name;

/**
 * @author mskacelik
 **/
public class Station {

    @Name("name-of-the-station")
    String nameOfTheStation;
}
