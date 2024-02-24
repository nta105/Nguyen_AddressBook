package address;

import address.data.AddressBook;
import address.data.AddressEntry;

import java.io.PrintStream;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * Manages the user interface for interacting with an AddressBook.
 * Supports adding, removing, finding, and listing address entries.
 */
public class Menu {
    private final AddressBook addressBook;
    private final Scanner scanner;
    private final PrintStream out;

    /**
     * Constructs a Menu with dependencies for interaction.
     *
     * @param addressBook The AddressBook to manage.
     * @param scanner     The Scanner for reading user input.
     * @param out         The PrintStream for outputting text to the user.
     */
    public Menu(AddressBook addressBook, Scanner scanner, PrintStream out) {
        this.addressBook = addressBook;
        this.scanner = scanner;
        this.out = out;
    }

    /**
     * Displays the main menu repeatedly until the user opts to quit.
     */
    public void displayMenu() {
        String choice;
        do {
            out.println("\na) Load entries from a file");
            out.println("b) Add an entry");
            out.println("c) Remove an entry");
            out.println("d) Find entries");
            out.println("e) List all entries");
            out.println("f) Quit");
            out.print("Choose an option: ");
            choice = scanner.nextLine();

            switch (choice) {
                case "a":
                    out.print("Enter filename to load: ");
                    String filename = scanner.nextLine();
                    addressBook.readFromFile(filename);
                    break;
                case "b":
                    addEntry();
                    break;
                case "c":
                    removeEntry();
                    break;
                case "d":
                    findEntries();
                    break;
                case "e":
                    addressBook.list();
                    break;
                case "f":
                    out.println("Quitting.");
                    break;
                default:
                    out.println("Invalid choice. Please choose again.");
            }
        } while (!choice.equals("f"));
    }

    /**
     * Guides the user through adding a new AddressEntry to the AddressBook.
     */
    private void addEntry() {
        out.print("Enter first name: ");
        String firstName = scanner.nextLine();
        out.print("Enter last name: ");
        String lastName = scanner.nextLine();
        out.print("Enter street: ");
        String street = scanner.nextLine();
        out.print("Enter city: ");
        String city = scanner.nextLine();
        out.print("Enter state: ");
        String state = scanner.nextLine();
        out.print("Enter zip: ");
        int zip = Integer.parseInt(scanner.nextLine());
        out.print("Enter phone: ");
        String phone = scanner.nextLine();
        out.print("Enter email: ");
        String email = scanner.nextLine();

        AddressEntry entry = new AddressEntry(firstName, lastName, street, city, state, zip, phone, email);
        addressBook.add(entry);
        out.println("Entry added.");
    }

    /**
     * Prompts the user to remove an AddressEntry based on the last name.
     */
    private void removeEntry() {
        out.print("Enter the last name of the entry to remove: ");
        String lastName = scanner.nextLine();
        addressBook.remove(lastName);
        out.println("Entry removed.");
    }

    /**
     * Allows the user to find entries by a partial match on the last name.
     */
    private void findEntries() {
        out.print("Enter the beginning of the last name to search for: ");
        String startOf_lastname = scanner.nextLine();
        TreeSet<AddressEntry> results = addressBook.find(startOf_lastname);
        if (results.isEmpty()) {
            out.println("No entries found.");
        } else {
            for (AddressEntry entry : results) {
                out.println(entry);
            }
        }
    }
}
