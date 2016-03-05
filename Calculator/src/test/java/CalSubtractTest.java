import org.testng.Assert;
import org.testng.annotations.*;

/**
 * Created by Rafiq on 2016-03-05.
 */
public class CalSubtractTest {

    private CalculateClass calc;
    @Test
    public void testArray() {

       Assert.assertEquals(calc.sumSubtrCT(11,5),6,"Error the values werent equal");
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        calc = new CalculateClass();
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
