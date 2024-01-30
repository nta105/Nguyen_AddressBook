// AddressEntry.java
package address.data;

public class AddressEntry {
    private String firstName;
    private String lastName;
    private String street;
    private String city;
    private String state;
    private int zip;
    private String email;
    private String phone;

    // Constructors
    public AddressEntry() {
        // Default constructor
    }

    public AddressEntry(String firstName, String lastName, String street, String city, String state, int zip, String phone, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.street = street;
        this.zip = zip;
        this.city = city;
        this.state = state;
        this.phone = phone;
        this.email = email;
    }

    // Setters and Getters for each field
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getStreet() {
        return street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public int getZip() {
        return zip;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        // Implement the toString method to format the information nicely
        return "Name: " + firstName + " " + lastName +
                "\nStreet: " + street +
                "\nCity: " + city +
                "\nState: " + state +
                "\nZip: " + zip +
                "\nEmail: " + email +
                "\nPhone: " + phone + "\n";
    }
}
