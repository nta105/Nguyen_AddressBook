package address;

import address.data.AddressBook;
import address.data.AddressEntry;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

/**
 * Tests for the {@link Menu} class.
 */
public class MenuTest {

    @Mock
    private AddressBook mockAddressBook;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private Menu menu;

    /**
     * Sets up common test objects and configurations before each test.
     */
    @Before
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        System.setOut(new PrintStream(outContent));
    }

    /**
     * Prepares the {@link Menu} object with simulated user input.
     *
     * @param inputData The simulated sequence of inputs for a given test.
     */
    private void prepareMenu(String inputData) {
        ByteArrayInputStream inContent = new ByteArrayInputStream(inputData.getBytes());
        Scanner scanner = new Scanner(inContent);
        menu = new Menu(mockAddressBook, scanner, System.out);
    }

    /**
     * Tests adding an entry through the menu.
     */
    @Test
    public void testAddEntry() {
        String input = "b\nJohn\nDoe\n123 Main St\nTownsville\nState\n12345\n555-1234\njohn.doe@example.com\nf\n";
        prepareMenu(input);
        menu.displayMenu();

        verify(mockAddressBook, times(1)).add(any(AddressEntry.class));
        assertTrue(outContent.toString().contains("Entry added."));
    }

    /**
     * Tests removing an entry through the menu.
     */
    @Test
    public void testRemoveEntry() {
        String input = "c\nDoe\nf\n";
        prepareMenu(input);
        menu.displayMenu();

        verify(mockAddressBook, times(1)).remove("Doe");
        assertTrue(outContent.toString().contains("Entry removed."));
    }

    /**
     * Tests finding entries through the menu.
     */
    @Test
    public void testFindEntries() {
        String input = "d\nDoe\nf\n";
        prepareMenu(input);
        menu.displayMenu();

        verify(mockAddressBook, times(1)).find("Doe");
    }

    /**
     * Tests listing all entries through the menu.
     */
    @Test
    public void testListEntries() {
        String input = "e\nf\n";
        prepareMenu(input);
        menu.displayMenu();

        verify(mockAddressBook, times(1)).list();
    }

    /**
     * Tests the quit option of the menu.
     */
    @Test
    public void testQuitOption() {
        String input = "f\n";
        prepareMenu(input);
        menu.displayMenu();

        assertTrue(outContent.toString().contains("Quitting."));
    }
}
