package address;

import address.data.AddressBook;
import address.data.AddressEntry;

import java.util.Scanner;
import java.util.TreeSet;

public class Menu {
    private final AddressBook addressBook;
    private final Scanner scanner = new Scanner(System.in);

    public Menu(AddressBook addressBook) {
        this.addressBook = addressBook;
    }

    public void displayMenu() {
        String choice;
        do {
            System.out.println("\na) Load entries from a file");
            System.out.println("b) Add an entry");
            System.out.println("c) Remove an entry");
            System.out.println("d) Find entries");
            System.out.println("e) List all entries");
            System.out.println("f) Quit");
            System.out.print("Choose an option: ");
            choice = scanner.nextLine();

            switch (choice) {
                case "a":
                    System.out.print("Enter filename to load: ");
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
                    System.out.println("Quitting.");
                    break;
                default:
                    System.out.println("Invalid choice. Please choose again.");
            }
        } while (!choice.equals("f"));
    }

    private void addEntry() {
        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();
        System.out.print("Enter street: ");
        String street = scanner.nextLine();
        System.out.print("Enter city: ");
        String city = scanner.nextLine();
        System.out.print("Enter state: ");
        String state = scanner.nextLine();
        System.out.print("Enter zip: ");
        int zip = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter phone: ");
        String phone = scanner.nextLine();
        System.out.print("Enter email: ");
        String email = scanner.nextLine();

        AddressEntry entry = new AddressEntry(firstName, lastName, street, city, state, zip, phone, email);
        addressBook.add(entry);
        System.out.println("Entry added.");
    }

    private void removeEntry() {
        System.out.print("Enter the last name of the entry to remove: ");
        String lastName = scanner.nextLine();
        addressBook.remove(lastName);
        System.out.println("Entry removed.");
    }

    private void findEntries() {
        System.out.print("Enter the beginning of the last name to search for: ");
        String startOf_lastname = scanner.nextLine();
        TreeSet<AddressEntry> results = addressBook.find(startOf_lastname);
        if (results.isEmpty()) {
            System.out.println("No entries found.");
        } else {
            for (AddressEntry entry : results) {
                System.out.println(entry);
            }
        }
    }
}
