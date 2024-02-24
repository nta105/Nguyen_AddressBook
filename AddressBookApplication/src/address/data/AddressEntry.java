package address.data;

/**
 * Represents an individual entry in an Address Book. This class contains personal
 * and contact information such as name, address (street, city, state, zip), phone number,
 * and email address.
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
     * Constructs a new AddressEntry with no detail initialized.
     * This default constructor is used to create an AddressEntry object before populating its fields.
     */
    public AddressEntry() {}

    /**
     * Constructs a new AddressEntry with specified details.
     *
     * @param firstName the first name of the individual
     * @param lastName  the last name of the individual
     * @param street    the street address
     * @param city      the city of residence
     * @param state     the state of residence
     * @param zip       the ZIP code
     * @param phone     the phone number
     * @param email     the email address
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

    /**
     * Sets the first name of this AddressEntry.
     *
     * @param firstName the first name to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Returns the first name of this AddressEntry.
     *
     * @return the first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the last name of this AddressEntry.
     *
     * @param lastName the last name to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Returns the last name of this AddressEntry.
     *
     * @return the last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the street address of this AddressEntry.
     *
     * @param street the street address to set
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * Returns the street address of this AddressEntry.
     *
     * @return the street address
     */
    public String getStreet() {
        return street;
    }

    /**
     * Sets the city of residence for this AddressEntry.
     *
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Returns the city of residence of this AddressEntry.
     *
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the state of residence for this AddressEntry.
     *
     * @param state the state to set
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * Returns the state of residence of this AddressEntry.
     *
     * @return the state
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the ZIP code for this AddressEntry.
     *
     * @param zip the ZIP code to set
     */
    public void setZip(int zip) {
        this.zip = zip;
    }

    /**
     * Returns the ZIP code of this AddressEntry.
     *
     * @return the ZIP code
     */
    public int getZip() {
        return zip;
    }

    /**
     * Sets the phone number for this AddressEntry.
     *
     * @param phone the phone number to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * Returns the phone number of this AddressEntry.
     *
     * @return the phone number
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the email address for this AddressEntry.
     *
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Returns the email address of this AddressEntry.
     *
     * @return the email address
     */
    public String getEmail() {
        return email;
    }

    /**
     * Returns a string representation of the AddressEntry, including all its fields.
     * This provides a comprehensive view of the AddressEntry's details in a readable format.
     *
     * @return a formatted string representation of the AddressEntry
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
