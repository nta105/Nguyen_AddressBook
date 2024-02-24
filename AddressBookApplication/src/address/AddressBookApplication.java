package address;

import address.data.AddressBook;
import java.util.Scanner;

/**
 * Main application class for the address book.
 * Initializes the application, setting up the necessary dependencies and starting the user interaction through the menu.
 */
public class AddressBookApplication {

    /**
     * The entry point of the application.
     * Creates an instance of {@link AddressBook}, sets up input handling, and displays the main menu for user interaction.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        AddressBook ab = new AddressBook();
        // Inject the dependencies directly in the main method
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu(ab, scanner, System.out);
        menu.displayMenu();
    }
}
