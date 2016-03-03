/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.roman.tp2testdrivenassign2.java.PersonClass;
import org.testng.Assert;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Roman
 */
public class ObjectEquality {
    private PersonClass person;
    private PersonClass person2;
    
    public ObjectEquality() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testObjectEquality() {
       
        /* Bottom refers to the object reference, like place in memory*/
        Assert.assertEquals(person, person2, "the objects are not equal to each other");
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        person = new PersonClass("fiki", "roman", true);
        person2 = person;
                
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
