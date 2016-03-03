/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.roman.tp2testdrivenassign2.java.PersonClass;
import org.testng.Assert;
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
public class FalseTest {
    private  PersonClass person;
    
    public FalseTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testFalse() 
    {
        Assert.assertFalse(person.isOfAge(), "the actual vaules shouldnt be true");
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        person =  new PersonClass( false);
        
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
