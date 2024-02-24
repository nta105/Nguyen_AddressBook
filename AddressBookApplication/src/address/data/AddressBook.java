package address.data;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * Provides functionalities to manage an address book, including adding, removing,
 * listing, and finding address entries. Entries are organized and sorted by last name.
 */
public class AddressBook {
    private final TreeMap<String, TreeSet<AddressEntry>> addressEntryList = new TreeMap<>();

    /**
     * Adds an address entry to the address book. If the last name does not already exist in the book,
     * a new TreeSet is created. Entries are sorted by last name.
     *
     * @param entry The AddressEntry object to be added to the address book.
     */
    public void add(AddressEntry entry) {
        addressEntryList.putIfAbsent(entry.getLastName(), new TreeSet<>(Comparator.comparing(AddressEntry::getLastName)));
        addressEntryList.get(entry.getLastName()).add(entry);
    }

    /**
     * Lists all address entries in the address book to the console, sorted by last name.
     * Each entry is printed on a new line.
     */
    public void list() {
        for (Map.Entry<String, TreeSet<AddressEntry>> entry : addressEntryList.entrySet()) {
            for (AddressEntry ae : entry.getValue()) {
                System.out.println(ae);
            }
        }
    }

    /**
     * Removes all entries with the specified last name from the address book.
     *
     * @param lastName The last name of the entries to be removed.
     */
    public void remove(String lastName) {
        addressEntryList.remove(lastName);
    }

    /**
     * Loads address entries from a specified file into the address book. The file should contain
     * address entry data in a comma-separated format. This method will parse each line into an
     * AddressEntry object and add it to the address book.
     *
     * @param filename The path of the file from which to load address entries.
     */
    public void readFromFile(String filename) {
        try (Scanner fileScanner = new Scanner(new File(filename))) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] parts = line.split(",");
                AddressEntry entry = new AddressEntry(parts[0], parts[1], parts[2], parts[3], parts[4], Integer.parseInt(parts[5]), parts[6], parts[7]);
                add(entry);
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + filename);
        }
    }

    /**
     * Finds and returns a set of address entries whose last names start with the specified prefix.
     * The returned set is sorted by last name.
     *
     * @param startOf_lastname The prefix of the last name to search for.
     * @return A TreeSet of AddressEntry objects matching the search criteria.
     */
    public TreeSet<AddressEntry> find(String startOf_lastname) {
        TreeSet<AddressEntry> results = new TreeSet<>(Comparator.comparing(AddressEntry::getLastName));
        for (String key : addressEntryList.keySet()) {
            if (key.startsWith(startOf_lastname)) {
                results.addAll(addressEntryList.get(key));
            }
        }
        return results;
    }
}
