// QAP 3.1: Person.java
// Joseph Flores
// May 28, 2024


// This class is used to create a Person object, which has a first name, last name, and an Address object
// The Person object is used in the CreditCard class

public class Person {
    private String lastName;
    private String firstName;
    private Address address;

    public Person(String lastName, String firstName, Address address) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.address = address;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public Address getAddress() {
        return this.address;
    }

    @Override
    public String toString() {
        return String.format("%s %s , %s", this.firstName, this.lastName, this.address);
    }
}