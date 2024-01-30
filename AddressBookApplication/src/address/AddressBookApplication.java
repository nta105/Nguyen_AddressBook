// AddressBookApplication.java
package address;

import address.data.AddressBook;
import address.data.AddressEntry;

public class AddressBookApplication {

    public static void main(String[] args) {
        AddressBook ab = new AddressBook();

        // Initialize AddressBook with 2 entries
        initAddressBookExercise(ab);

        // List the entries in AddressBook
        ab.list();
    }

    public static void initAddressBookExercise(AddressBook ab) {
        AddressEntry entry1 = new AddressEntry("Abc", "Def", "123 Main St","San Jose" ,"CA", 12345, "123-456-7890", "abc@example.com");
        AddressEntry entry2 = new AddressEntry("An", "Nguyen", "456 Oak St","Oakland","CA", 56789, "987-654-3210", "an@example.com");

        // Add entries to AddressBook
        ab.addAddressEntry(entry1);
        ab.addAddressEntry(entry2);
    }
}
