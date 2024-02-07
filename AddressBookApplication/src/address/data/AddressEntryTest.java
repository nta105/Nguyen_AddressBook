package address.data;

public class AddressEntryTest {

    public static void main(String[] args) {
        // Testing the constructor that accepts parameters to ensure it correctly initializes an AddressEntry object.
        System.out.println("Testing constructor with parameters:");
        AddressEntry entryWithParams = new AddressEntry("Jane", "Doe", "456 Elm St", "Othertown", "Otherstate", 67890, "555-6789", "janedoe@example.com");
        // Verifying that the AddressEntry object created with parameters has the expected values.
        checkEntryDetails(entryWithParams, "Jane", "Doe", "456 Elm St", "Othertown", "Otherstate", 67890, "555-6789", "janedoe@example.com");

        // Testing the default constructor and setter methods to ensure they correctly initialize and modify an AddressEntry object.
        System.out.println("\nTesting default constructor and setters:");
        AddressEntry entryWithDefault = new AddressEntry();
        // Using setter methods to set each field of the AddressEntry object.
        entryWithDefault.setFirstName("John");
        entryWithDefault.setLastName("Doe");
        entryWithDefault.setStreet("123 Main St");
        entryWithDefault.setCity("Anytown");
        entryWithDefault.setState("Anystate");
        entryWithDefault.setZip(12345);
        entryWithDefault.setEmail("johndoe@example.com");
        entryWithDefault.setPhone("555-1234");
        // Verifying that the AddressEntry object modified with setter methods has the expected values.
        checkEntryDetails(entryWithDefault, "John", "Doe", "123 Main St", "Anytown", "Anystate", 12345, "555-1234", "johndoe@example.com");
    }

    /**
     * Checks and prints the test results for each field of an AddressEntry object.
     * Compares expected values with actual values and prints "PASS" if they match or "FAIL" otherwise.
     *
     * @param entry The AddressEntry object to check.
     * @param firstName Expected first name.
     * @param lastName Expected last name.
     * @param street Expected street address.
     * @param city Expected city.
     * @param state Expected state.
     * @param zip Expected zip code.
     * @param phone Expected phone number.
     * @param email Expected email address.
     */
    private static void checkEntryDetails(AddressEntry entry, String firstName, String lastName, String street, String city, String state, int zip, String phone, String email) {
        // Each line checks a specific field of the AddressEntry object, comparing the expected value (parameter) with the actual value (from the object).
        System.out.println("First Name: " + (firstName.equals(entry.getFirstName()) ? "PASS" : "FAIL"));
        System.out.println("Last Name: " + (lastName.equals(entry.getLastName()) ? "PASS" : "FAIL"));
        System.out.println("Street: " + (street.equals(entry.getStreet()) ? "PASS" : "FAIL"));
        System.out.println("City: " + (city.equals(entry.getCity()) ? "PASS" : "FAIL"));
        System.out.println("State: " + (state.equals(entry.getState()) ? "PASS" : "FAIL"));
        System.out.println("Zip: " + (zip == entry.getZip() ? "PASS" : "FAIL"));
        System.out.println("Email: " + (email.equals(entry.getEmail()) ? "PASS" : "FAIL"));
        System.out.println("Phone: " + (phone.equals(entry.getPhone()) ? "PASS" : "FAIL"));
    }
}
