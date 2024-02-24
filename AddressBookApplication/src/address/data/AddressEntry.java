package address.data;

/**
 * Represents an individual entry in an Address Book.
 */
public class AddressEntry {
    private String firstName;
    private String lastName;
    private String street;
    private String city;
    private String state;
    private int zip;
    private String email;
    private String phone;

    /**
     * Default constructor.
     */
    public AddressEntry() {}

    /**
     * Parameterized constructor to create an AddressEntry with full details.
     */
    public AddressEntry(String firstName, String lastName, String street, String city,
                        String state, int zip, String phone, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phone = phone;
        this.email = email;
    }

    /** Sets the first name. */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /** Returns the first name. */
    public String getFirstName() {
        return firstName;
    }

    /** Sets the last name. */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /** Returns the last name. */
    public String getLastName() {
        return lastName;
    }

    /** Sets the street. */
    public void setStreet(String street) {
        this.street = street;
    }

    /** Returns the street. */
    public String getStreet() {
        return street;
    }

    /** Sets the city. */
    public void setCity(String city) {
        this.city = city;
    }

    /** Returns the city. */
    public String getCity() {
        return city;
    }

    /** Sets the state. */
    public void setState(String state) {
        this.state = state;
    }

    /** Returns the state. */
    public String getState() {
        return state;
    }

    /** Sets the zip code. */
    public void setZip(int zip) {
        this.zip = zip;
    }

    /** Returns the zip code. */
    public int getZip() {
        return zip;
    }

    /** Sets the phone number. */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /** Returns the phone number. */
    public String getPhone() {
        return phone;
    }

    /** Sets the email. */
    public void setEmail(String email) {
        this.email = email;
    }

    /** Returns the email. */
    public String getEmail() {
        return email;
    }

    /**
     * Returns a string representation of the AddressEntry.
     * @return Formatted string with all AddressEntry details.
     */
    @Override
    public String toString() {
        return "Name: " + firstName + " " + lastName +
                "\nStreet: " + street +
                "\nCity: " + city +
                "\nState: " + state +
                "\nZip: " + zip +
                "\nEmail: " + email +
                "\nPhone: " + phone;
    }
}
