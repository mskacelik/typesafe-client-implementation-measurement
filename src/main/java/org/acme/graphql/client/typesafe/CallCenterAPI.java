package org.acme.graphql.client.typesafe;

import io.smallrye.graphql.client.typesafe.api.GraphQLClientApi;
import org.acme.graphql.client.typesafe.models.EmergencyCallCenter;
import org.acme.graphql.client.typesafe.models.FireStation;
import org.acme.graphql.client.typesafe.models.Person;
import org.eclipse.microprofile.graphql.Name;
import org.eclipse.microprofile.graphql.Query;

import java.util.List;

/**
 * @author mskacelik
 **/
@GraphQLClientApi(configKey = "call-center")
public interface CallCenterAPI {

    //    query name($name: String) {
    //        name(name: $name)
    //    }
    //
    @Query
    String name(String name);

    //    query Person($person: PersonInput) {
    //        Person(person: $person) {
    //            firstName
    //            lastName
    //        }
    //    }
    //
    @Query
    Person Person(Person person);


    //    query fireStation($fireStation: FireStationInput) {
    //        fireStation(fireStation: $fireStation) {
    //            nameOfTheStation: name-of-the-station
    //            fireFighters: list-of-fire-fighters {
    //                firstName
    //                lastName
    //            }
    //            fireTrucks: list-of-fire-trucks {
    //                licensePlate: license-plate
    //                fuel: fuel-capacity
    //            }
    //        }
    //    }
    @Query
    FireStation fireStation(FireStation fireStation);

    //    query allEmergencyCallCenters($emergencyCallCenters: EmergencyCallCenterInput) {
    //        allEmergencyCallCenters(searchedCallCenter: $emergencyCallCenters) {
    //            number: telephone-number
    //            mobileType: mobile-type
    //            fireStations: listOfFireStations {
    //                nameOfTheStation: name-of-the-station
    //                fireFighters: list-of-fire-fighters {
    //                    firstName
    //                    lastName
    //                }
    //                fireTrucks: list-of-fire-trucks {
    //                    licensePlate: license-plate
    //                    fuel: fuel-capacity
    //                }
    //            }
    //            hospitals: listOfHospitals {
    //                doctors {
    //                    firstName
    //                    lastName
    //                    specialization
    //                }
    //            }
    //            policeStations: listOfPoliceStations {
    //                policemen: list-of-policemen {
    //                    firstName
    //                    lastName
    //                    weapons {
    //                        weight: mass
    //                        yearOfCreation: year
    //                    }
    //                }
    //                prisonRooms: listOfPrisonRooms {
    //                    numberOfTheRoom
    //                    occupied
    //                }
    //            }
    //        }
    //    }
    //
    @Query("allEmergencyCallCenters")
    @Name("listAllEmergencyCallCenters")
    List<EmergencyCallCenter> emergencyCallCenters(@Name("searchedCallCenter") EmergencyCallCenter emergencyCallCenters);



}