package address.data;

import java.util.ArrayList;
import java.util.List;

/**
 * The AddressBook class represents a collection of AddressEntry objects.
 * It provides functionality to add entries and list all entries.
 */
public class AddressBook {
    private List<AddressEntry> addressEntryList;

    /**
     * Constructs an empty AddressBook.
     */
    public AddressBook() {
        this.addressEntryList = new ArrayList<>();
    }

    /**
     * Adds an AddressEntry to the AddressBook.
     * @param entry The AddressEntry to be added.
     */
    public void addAddressEntry(AddressEntry entry) {
        addressEntryList.add(entry);
    }

    /**
     * Prints all the AddressEntry objects in the AddressBook to the console.
     */
    public void list() {
        for (AddressEntry entry : addressEntryList) {
            System.out.println(entry.toString());
        }
    }
}
