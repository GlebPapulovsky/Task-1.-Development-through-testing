import org.example.PhoneBook;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class PrintStreamTest {
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();


    @Test
    public void givenSystemOutRedirection_whenInvokePrintln_thenOutputIsCaptor() {
        System.setOut(new PrintStream(outputStreamCaptor));
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Alex", "1");
        phoneBook.add("Piter", "2");


        phoneBook.printAllNames();

        assertEquals("1.Name: Alex - number: 1\r\n2.Name: Piter - number: 2", outputStreamCaptor.toString().trim());

    }

    @BeforeEach
    public void tearDown() {
        System.setOut(standardOut);
    }


}