/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//import com.roman.tp2testdrivenassign2.java.CalculateClass;



import org.testng.Assert;
import org.testng.annotations.*;

import static org.testng.Assert.*;

/**
 *
 * @author Roman
 */
public class IntegerTest {
    private CalculateClass calFloat;
    public IntegerTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testIntegers() {
      Assert.assertEquals(6, calFloat.sumIntegers(1, 5), null);
    // Assert.assertNotEquals(9, calFloat.sumIntegers(1, 5), "The 2 objects are equal");
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        calFloat = new CalculateClass();
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
