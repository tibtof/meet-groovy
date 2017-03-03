package meetgroovy

import java.time.LocalDate

class Person {

    @Delegate
    Address address = new Address()

    String firstName
    String lastName
    LocalDate birthDate

    String fullName() {
        "$firstName $lastName"
    }

}

class Address {
    String streetName
}