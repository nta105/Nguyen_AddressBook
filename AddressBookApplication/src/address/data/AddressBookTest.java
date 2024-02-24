package address.data;

import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.TreeSet;
import static org.junit.Assert.*;
/**
 * Unit tests for the AddressBook class.
 */
public class AddressBookTest {

    private AddressBook addressBook;
    private final PrintStream originalOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    /**
     * Sets up the environment before each test. Initializes a new AddressBook instance
     * and captures System.out to verify console output.
     */
    @Before
    public void setUp() {
        addressBook = new AddressBook();
        System.setOut(new PrintStream(outputStreamCaptor)); // Redirect System.out to capture output
    }
    /**
     * Tests the addition of AddressEntry objects to the AddressBook, ensuring they are correctly added.
     */
    @Test
    public void testAdd() {
        AddressEntry entry1 = new AddressEntry("Smith", "John", "123 Main St", "Townsville", "CA", 12345, "555-1234", "john@example.com");
        addressBook.add(entry1);
        assertFalse(addressBook.find("John").isEmpty());

        AddressEntry entry2 = new AddressEntry("Doe", "Jane", "456 Elm St", "Centerville", "TX", 75833, "555-6789", "jane.doe@example.com");
        addressBook.add(entry2);
        assertFalse(addressBook.find("Jane").isEmpty());
    }
    /**
     * Tests the removal of AddressEntry objects from the AddressBook by last name.
     */
    @Test
    public void testRemove() {
        AddressEntry entry1 = new AddressEntry("Smith", "John", "123 Main St", "Townsville", "CA", 12345, "555-1234", "john@example.com");
        addressBook.add(entry1);
        addressBook.remove("John");
        assertTrue(addressBook.find("John").isEmpty());

        AddressEntry entry2 = new AddressEntry("Doe", "Jane", "456 Elm St", "Centerville", "TX", 75833, "555-6789", "jane.doe@example.com");
        addressBook.add(entry2);
        addressBook.remove("Jane");
        assertTrue(addressBook.find("Jane").isEmpty());
    }
    /**
     * Verifies that AddressBook correctly reads entries from a file and adds them to the address book.
     */
    @Test
    public void testReadFromFile() {
        addressBook.readFromFile("Nguyen_AddressBook/entry.txt");
        // Verify each entry based on the content of entry.txt
        TreeSet<AddressEntry> doeEntries = addressBook.find("Doe");
        assertFalse("AddressBook should contain entries for Doe", doeEntries.isEmpty());
        assertEquals("Should find one entry for Doe", 1, doeEntries.size());

        TreeSet<AddressEntry> smithEntries = addressBook.find("Smith");
        assertFalse("AddressBook should contain entries for Smith", smithEntries.isEmpty());
        assertEquals("Should find one entry for Smith", 1, smithEntries.size());

        TreeSet<AddressEntry> jonesEntries = addressBook.find("Jones");
        assertFalse("AddressBook should contain entries for Jones", jonesEntries.isEmpty());
        assertEquals("Should find one entry for Jones", 1, jonesEntries.size());

        TreeSet<AddressEntry> brownEntries = addressBook.find("Brown");
        assertFalse("AddressBook should contain entries for Brown", brownEntries.isEmpty());
        assertEquals("Should find one entry for Brown", 1, brownEntries.size());

        TreeSet<AddressEntry> johnsonEntries = addressBook.find("Johnson");
        assertFalse("AddressBook should contain entries for Johnson", johnsonEntries.isEmpty());
        assertEquals("Should find one entry for Johnson", 1, johnsonEntries.size());
    }
    /**
     * Tests the listing function of AddressBook, ensuring the correct entries are printed to the console.
     */
    @Test
    public void testList() {
        AddressEntry entry1 = new AddressEntry("Smith", "John", "123 Main St", "Townsville", "CA", 12345, "555-1234", "john@example.com");
        addressBook.add(entry1);
        AddressEntry entry2 = new AddressEntry("Doe", "Jane", "456 Elm St", "Centerville", "TX", 75833, "555-6789", "jane.doe@example.com");
        addressBook.add(entry2);

        addressBook.list(); // This method prints to System.out, which we've redirected to outputStreamCaptor

        String output = outputStreamCaptor.toString();
        assertTrue("The output should contain the first name Smith.",output.contains("Smith"));
        assertTrue( "The output should contain the first name Doe.", output.contains("Doe"));
        assertTrue("The output should contain the last name John.",output.contains("John"));
        assertTrue( "The output should contain the last name Jane.",output.contains("Jane"));
    }

    /**
     * Verifies the find functionality of AddressBook, ensuring entries can be found by last name.
     */
    @Test
    public void testFind() {
        AddressEntry entry1 = new AddressEntry("Smith", "John", "123 Main St", "Townsville", "CA", 12345, "555-1234", "john@example.com");
        addressBook.add(entry1);
        TreeSet<AddressEntry> result = addressBook.find("Joh");
        assertEquals("Find should return the correct entry", 1, result.size());
        assertTrue("Result should contain entry1", result.contains(entry1));

        AddressEntry entry2 = new AddressEntry("Doe", "Jane", "456 Elm St", "Centerville", "TX", 75833, "555-6789", "jane.doe@example.com");
        addressBook.add(entry2);
        result = addressBook.find("Ja");
        assertEquals("Find should return the correct entry", 1, result.size());
        assertTrue("Result should contain entry2", result.contains(entry2));
    }

    /**
     * Restores System.out to its original state after each test.
     */
    @org.junit.After
    public void restoreStreams() {
        System.setOut(originalOut);
    }
}
