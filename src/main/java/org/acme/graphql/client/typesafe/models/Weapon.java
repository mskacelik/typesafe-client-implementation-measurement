package org.acme.graphql.client.typesafe.models;

import org.eclipse.microprofile.graphql.Name;

/**
 * @author mskacelik
 **/
class Weapon {
    @Name("mass")
    double weight;
    @Name("year")
    long yearOfCreation;
}
