package address.data;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * Manages an address book with capabilities to add, remove, list, and find address entries.
 */
public class AddressBook {
    private final TreeMap<String, TreeSet<AddressEntry>> addressEntryList = new TreeMap<>();

    /**
     * Adds an entry to the address book.
     *
     * @param entry The address entry to add.
     */
    public void add(AddressEntry entry) {
        addressEntryList.putIfAbsent(entry.getLastName(), new TreeSet<>(Comparator.comparing(AddressEntry::getLastName)));
        addressEntryList.get(entry.getLastName()).add(entry);
    }

    /**
     * Prints all address entries to the console, sorted by last name.
     */
    public void list() {
        for (Map.Entry<String, TreeSet<AddressEntry>> entry : addressEntryList.entrySet()) {
            for (AddressEntry ae : entry.getValue()) {
                System.out.println(ae);
            }
        }
    }

    /**
     * Removes entries by the specified last name.
     *
     * @param lastName The last name of the entries to remove.
     */
    public void remove(String lastName) {
        addressEntryList.remove(lastName);
    }

    /**
     * Loads address entries from a specified file.
     *
     * @param filename The file from which to load entries.
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
     * Finds entries with last names starting with the specified prefix.
     *
     * @param startOf_lastname The prefix to search for.
     * @return A sorted set of matching entries.
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
