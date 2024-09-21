import org.example.PhoneBook;
import org.junit.Assert;
import org.junit.Test;

public class PhoneBookTest {

    @Test
    public  void addTest(){
        PhoneBook phoneBook=new PhoneBook();
        Assert.assertEquals(1,phoneBook.add());
    }
}
