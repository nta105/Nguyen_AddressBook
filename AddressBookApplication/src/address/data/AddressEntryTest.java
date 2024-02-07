package address.data;

public class AddressEntryTest {

    public static void main(String[] args) {
        // Test the constructor with parameters
        System.out.println("Testing constructor with parameters:");
        AddressEntry entryWithParams = new AddressEntry("Jane", "Doe", "456 Elm St", "Othertown", "Otherstate", 67890, "555-6789", "janedoe@example.com");
        checkEntryDetails(entryWithParams, "Jane", "Doe", "456 Elm St", "Othertown", "Otherstate", 67890, "555-6789", "janedoe@example.com");

        // Test the default constructor and setters
        System.out.println("\nTesting default constructor and setters:");
        AddressEntry entryWithDefault = new AddressEntry();
        entryWithDefault.setFirstName("John");
        entryWithDefault.setLastName("Doe");
        entryWithDefault.setStreet("123 Main St");
        entryWithDefault.setCity("Anytown");
        entryWithDefault.setState("Anystate");
        entryWithDefault.setZip(12345);
        entryWithDefault.setEmail("johndoe@example.com");
        entryWithDefault.setPhone("555-1234");
        checkEntryDetails(entryWithDefault, "John", "Doe", "123 Main St", "Anytown", "Anystate", 12345, "555-1234", "johndoe@example.com");
    }

    private static void checkEntryDetails(AddressEntry entry, String firstName, String lastName, String street, String city, String state, int zip, String phone, String email) {
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
