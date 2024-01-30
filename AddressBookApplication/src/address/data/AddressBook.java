// AddressBook.java
package address.data;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    private List<AddressEntry> addressEntryList;

    public AddressBook() {
        this.addressEntryList = new ArrayList<>();
    }

    public void addAddressEntry(AddressEntry entry) {
        addressEntryList.add(entry);
    }

    public void list() {
        for (AddressEntry entry : addressEntryList) {
            System.out.println(entry.toString());
        }
    }
}
