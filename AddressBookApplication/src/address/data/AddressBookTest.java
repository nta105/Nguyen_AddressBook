package address.data;

public class AddressBookTest {

    public static void main(String[] args) {
        testAdd();
        testRemove();
        testReadFromFile("entry.txt");
        testFind();
    }

    private static void testAdd() {
        AddressBook addressBook1 = new AddressBook();
        AddressEntry entry1 = new AddressEntry("Smith", "John", "123 Main St", "Townsville", "CA", 12345, "555-1234", "john@example.com");
        addressBook1.add(entry1);
        AddressEntry entry2 = new AddressEntry("Johnson", "Emily", "789 Oak St", "Springfield", "IL", 67890, "555-6789", "emily@example.com");
        addressBook1.add(entry2);
        boolean test1 = addressBook1.find("John").contains(entry1);
        boolean test2 = addressBook1.find("Emily").contains(entry2);
        System.out.println(test1 && test2 ? "testAdd PASSED" : "testAdd FAILED");
    }

    private static void testRemove() {
        // First test case
        AddressBook addressBook1 = new AddressBook();
        AddressEntry entry1 = new AddressEntry("Doe", "Jane", "456 Elm St", "Villagetown", "NY", 54321, "555-5678", "jane@example.com");
        addressBook1.add(entry1);
        addressBook1.remove("Jane");
        boolean test1 = addressBook1.find("Jane").isEmpty();

        // Second test case
        AddressBook addressBook2 = new AddressBook();
        AddressEntry entry2 = new AddressEntry("Miller", "Chris", "987 Maple St", "Anytown", "AZ", 11223, "555-4321", "chris@example.com");
        addressBook2.add(entry2);
        addressBook2.remove("Chris");
        boolean test2 = addressBook2.find("Chris").isEmpty();

        System.out.println(test1 && test2 ? "testRemove PASSED" : "testRemove FAILED");
    }

    private static void testReadFromFile(String filename) {
        AddressBook addressBook = new AddressBook();
        try {
            addressBook.readFromFile(filename);
            System.out.println("testReadFromFile PASSED - File read successfully.");
        } catch (Exception e) {
            System.out.println("testReadFromFile FAILED - Error reading file: " + e.getMessage());
        }
    }

    private static void testFind() {
        // First test case
        AddressBook addressBook1 = new AddressBook();
        AddressEntry entry1 = new AddressEntry("Smith", "John", "123 Main St", "Townsville", "CA", 12345, "555-1234", "john@example.com");
        addressBook1.add(entry1);
        boolean test1 = !addressBook1.find("Jo").isEmpty();

        // Second test case
        AddressBook addressBook2 = new AddressBook();
        AddressEntry entry2 = new AddressEntry("Johnson", "Emily", "789 Oak St", "Springfield", "IL", 67890, "555-6789", "emily@example.com");
        addressBook2.add(entry2);
        boolean test2 = !addressBook2.find("Emi").isEmpty();

        System.out.println(test1 && test2 ? "testFind PASSED" : "testFind FAILED");
    }
}
