package org.acme.graphql.client.typesafe.models;

import org.eclipse.microprofile.graphql.Name;

/**
 * @author mskacelik
 **/
class Telephone {
    @Name("telephone-number")
    String number;
    @Name("mobile-type")
    MobileType mobileType;
}