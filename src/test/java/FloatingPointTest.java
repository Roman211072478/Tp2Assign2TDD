/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//import com.roman.tp2testdrivenassign2.java.CalculateClass;
import org.testng.Assert;

//import static org.testng.Assert.*;
import org.testng.annotations.Test;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;


/**
 *
 * @author Roman
 */
public class FloatingPointTest {
    private CalculateClass calFloat;
    
    public FloatingPointTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void TestMyfloat() {
   
     Assert.assertEquals(6.2f, calFloat.sum(1.2f, 5f),null);
    //Assert.assertNotEquals(6121f, calFloat.sum(1.2f, 5f),"The 2 objects are equal");
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
