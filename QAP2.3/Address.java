// QAP 3.1: Address.java
// Joseph Flores
// May 28, 2024

// This class is used to create an Address object, which has a street, city, state, and zip code
// The Address object is used in the Person class

public class Address {
    private String street;
    private String city;
    private String state;
    private String zip;

    public Address(String street, String city, String state, String zip) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public String getStreet() {
        return this.street;
    }

    public String getCity() {
        return this.city;
    }

    public String getState() {
        return this.state;
    }

    public String getZip() {
        return this.zip;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %s %s", this.street, this.city, this.state, this.zip);
    }
}