package address.data;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class AddressBook {
    private final TreeMap<String, TreeSet<AddressEntry>> addressEntryList = new TreeMap<>();

    public void add(AddressEntry entry) {
        addressEntryList.putIfAbsent(entry.getLastName(), new TreeSet<>(Comparator.comparing(AddressEntry::getFirstName)));
        addressEntryList.get(entry.getLastName()).add(entry);
    }

    public void list() {
        for (Map.Entry<String, TreeSet<AddressEntry>> entry : addressEntryList.entrySet()) {
            for (AddressEntry ae : entry.getValue()) {
                System.out.println(ae);
            }
        }
    }

    public void remove(String lastName) {
        // This method might need to be more complex to handle multiple people with the same last name
        addressEntryList.remove(lastName);
    }

    public void readFromFile(String filename) {
        try (Scanner fileScanner = new Scanner(new File(filename))) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                // Assuming file format matches constructor order
                String[] parts = line.split(",");
                AddressEntry entry = new AddressEntry(parts[0], parts[1], parts[2], parts[3], parts[4], Integer.parseInt(parts[5]), parts[6], parts[7]);
                add(entry);
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + filename);
        }
    }

    public TreeSet<AddressEntry> find(String startOf_lastname) {
        TreeSet<AddressEntry> results = new TreeSet<>(Comparator.comparing(AddressEntry::getFirstName));
        for (String key : addressEntryList.keySet()) {
            if (key.startsWith(startOf_lastname)) {
                results.addAll(addressEntryList.get(key));
            }
        }
        return results;
    }
}
