import org.example.PhoneBook;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class PrintStreamTest {
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @Test
    public void givenSystemOutRedirection_whenInvokePrintln_thenOutputIsCaptor() {
        System.setOut(new PrintStream(outputStreamCaptor));
        PhoneBook phoneBook=new PhoneBook();
        phoneBook.add("Alex","1");
        phoneBook.add("Vasya","2");
        phoneBook.add("Piter","");

        Assert.assertEquals(
                "1.Name: Alex - number: 1\n" +
                "2.Name: Piter - number: 3\n" +
                "3.Name: Vasya - number: 2\n", outputStreamCaptor.toString().trim());

    }

}