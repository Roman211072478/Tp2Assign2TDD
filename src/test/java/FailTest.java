/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//import com.roman.tp2testdrivenassign2.java.PersonClass;
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
public class FailTest {
    private PersonClass person;
    
    public FailTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void TestFailing() {
      /*Assert.fail();*/
         
      
        person = null;
        
        if(person!= null)
        {
           fail("No NullPointerException");   // cause the test to fail if we reach this            
        }
        
      
      
     }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        person = new PersonClass("fik", null, true);
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
