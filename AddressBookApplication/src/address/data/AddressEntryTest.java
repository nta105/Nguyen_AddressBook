package address.data;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Tests for the AddressEntry class.
 */
public class AddressEntryTest {

    private AddressEntry entry;
    /**
     * Sets up a test environment before each test method.
     * Initializes an AddressEntry object with sample data.
     */
    @Before
    public void setUp() {
        // Initialize AddressEntry with sample data for testing
        entry = new AddressEntry("John", "Doe", "123 Main St", "Townsville",
                "State", 12345, "555-1234", "john.doe@example.com");
    }
    /**
     * Tests the parameterized constructor to ensure it correctly assigns all provided values.
     */
    @Test
    public void testConstructorWithParameters() {
        assertEquals("John", entry.getFirstName());
        assertEquals("Doe", entry.getLastName());
        assertEquals("123 Main St", entry.getStreet());
        assertEquals("Townsville", entry.getCity());
        assertEquals("State", entry.getState());
        assertEquals(12345, entry.getZip());
        assertEquals("555-1234", entry.getPhone());
        assertEquals("john.doe@example.com", entry.getEmail());
    }
    /**
     * Tests each setter and corresponding getter to ensure they accurately set and return values.
     */
    @Test
    public void testSettersAndGetters() {
        entry.setFirstName("Jane");
        assertEquals("Jane", entry.getFirstName());

        entry.setLastName("Smith");
        assertEquals("Smith", entry.getLastName());

        entry.setStreet("456 Elm St");
        assertEquals("456 Elm St", entry.getStreet());

        entry.setCity("Centerville");
        assertEquals("Centerville", entry.getCity());

        entry.setState("AnotherState");
        assertEquals("AnotherState", entry.getState());

        entry.setZip(67890);
        assertEquals(67890, entry.getZip());

        entry.setPhone("555-6789");
        assertEquals("555-6789", entry.getPhone());

        entry.setEmail("jane.smith@example.com");
        assertEquals("jane.smith@example.com", entry.getEmail());
    }
    /**
     * Tests the toString method to ensure it returns a correctly formatted string representing the entry.
     */
    @Test
    public void testToString() {
        String expectedOutput = "Name: John Doe\nStreet: 123 Main St\nCity: Townsville\nState: State\nZip: 12345\nEmail: john.doe@example.com\nPhone: 555-1234";
        String actualOutput = entry.toString().trim(); // trim() to remove trailing newlines if any
        assertEquals(expectedOutput, actualOutput);
    }
}
