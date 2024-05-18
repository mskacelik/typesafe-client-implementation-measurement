package org.acme.graphql.client.typesafe;

import io.quarkus.runtime.Startup;
import io.smallrye.graphql.client.GraphQLClient;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

/**
 * @author mskacelik
 **/
@ApplicationScoped
public class InitialBean {

    @Inject
    @GraphQLClient("call-center")
    CallCenterAPI client;

    // remove multiline comments for testing...
    @Startup
    void init() {
        /*
        try {
            client.name(null);
        } catch(RuntimeException ex){
        }
        */
        /*
        try {
            client.Person(null);
        } catch(RuntimeException ex){
        }
        */
        /*
        try {
            client.fireStation(null);
        } catch(RuntimeException ex){
        }
        */
        /*
        try {
            client.emergencyCallCenters(null);
        } catch(RuntimeException ex){
        }
        */
    }
}
