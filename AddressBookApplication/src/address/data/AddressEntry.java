package address.data;

/**
 * Represents an individual entry in an Address Book.
 * This class stores personal information such as name, address, phone number, and email.
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
     * Default constructor. Creates a new instance of AddressEntry with no initialized fields.
     */
    public AddressEntry() {
        // Default constructor for AddressEntry
    }

    /**
     * Constructs a new AddressEntry with specified details.
     *
     * @param firstName The first name of the person.
     * @param lastName  The last name of the person.
     * @param street    The street address.
     * @param city      The city name.
     * @param state     The state name.
     * @param zip       The zip code.
     * @param phone     The phone number.
     * @param email     The email address.
     */
    public AddressEntry(String firstName, String lastName, String street, String city, String state, int zip, String phone, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phone = phone;
        this.email = email;
    }

    // Setters and Getters for each field

    /**
     * Sets the first name of the person.
     * @param firstName The first name to set.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Gets the first name of the person.
     * @return The first name.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the last name of the person.
     * @param lastName The last name to set.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Gets the last name of the person.
     * @return The last name.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the street address.
     * @param street The street address to set.
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * Gets the street address.
     * @return The street address.
     */
    public String getStreet() {
        return street;
    }

    /**
     * Sets the city name.
     * @param city The city name to set.
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Gets the city name.
     * @return The city name.
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the state name.
     * @param state The state name to set.
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * Gets the state name.
     * @return The state name.
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the zip code.
     * @param zip The zip code to set.
     */
    public void setZip(int zip) {
        this.zip = zip;
    }

    /**
     * Gets the zip code.
     * @return The zip code.
     */
    public int getZip() {
        return zip;
    }

    /**
     * Sets the phone number.
     * @param phone The phone number to set.
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * Gets the phone number.
     * @return The phone number.
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the email address.
     * @param email The email address to set.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Gets the email address.
     * @return The email address.
     */
    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        // Converts the AddressEntry information into a formatted string.
        return "Name: " + firstName + " " + lastName +
                "\nStreet: " + street +
                "\nCity: " + city +
                "\nState: " + state +
                "\nZip: " + zip +
                "\nEmail: " + email +
                "\nPhone: " + phone + "\n";
    }
}
