import org.example.PhoneBook;
import org.junit.Assert;
import org.junit.Test;

public class PhoneBookTest {

    @Test
    public void addTest() {
        PhoneBook phoneBook = new PhoneBook();
        Assert.assertEquals(1, phoneBook.add("alex", "11111111111"));
    }
    @Test
    public void findByNumberTest(){
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("alex", "11111111111");
        Assert.assertEquals("alex",phoneBook.findByNumber("11111111111"));
    }

}
