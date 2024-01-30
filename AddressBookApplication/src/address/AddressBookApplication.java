package address;

import address.data.AddressBook;
import address.data.AddressEntry;

/**
 * The AddressBookApplication class serves as the main entry point for the Address Book application.
 * It contains methods to initialize the Address Book with entries and display them.
 */
public class AddressBookApplication {

    public static void main(String[] args) {
        AddressBook ab = new AddressBook();

        // Initialize AddressBook with predefined entries
        initAddressBookExercise(ab);

        // Display the entries in the AddressBook
        ab.list();
    }

    /**
     * Initializes the AddressBook with sample entries.
     * @param ab The AddressBook to be initialized.
     */
    public static void initAddressBookExercise(AddressBook ab) {
        AddressEntry entry1 = new AddressEntry("Abc", "Def", "123 Main St","San Jose" ,"CA", 12345, "123-456-7890", "abc@example.com");
        AddressEntry entry2 = new AddressEntry("An", "Nguyen", "456 Oak St","Oakland","CA", 56789, "987-654-3210", "an@example.com");

        // Add sample entries to the AddressBook
        ab.addAddressEntry(entry1);
        ab.addAddressEntry(entry2);
    }
}
