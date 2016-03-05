/**
 * Created by student on 2016/03/03.
 */
import org.testng.annotations.*;

import java.util.ArrayList;
import java.util.List;


public class TestMe
{
    private PersonClass person;

    private List Numbers;

    @Test(expectedExceptions = IndexOutOfBoundsException.class)
    public void testArray() {

        Numbers.get(1);
    }
    @BeforeClass
    public static void setUpClass() throws Exception {
    }
    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    @BeforeMethod
    public void setUpMethod() throws Exception {
        Numbers = new ArrayList();
    }
    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
