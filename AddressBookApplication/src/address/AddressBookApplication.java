package address;

import address.data.AddressBook;

public class AddressBookApplication {

    public static void main(String[] args) {
        AddressBook ab = new AddressBook();
        Menu menu = new Menu(ab);
        menu.displayMenu();
    }
}
