/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//import com.roman.tp2testdrivenassign2.java.PersonClass;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;
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

import org.testng.annotations.*;
public class TimeOutTest {
    
    public TimeOutTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test ( timeOut = 500 )
     public void testTimeout() throws InterruptedException{
        
        Thread.sleep(400);//it is less than 400 so it passed
       // System.out.println("This should pass");
     }
    
      //This test will past due to it being less then 500ms
     @Test(timeOut = 500)
      public void timeTestTwo() throws InterruptedException {
          
          int time = 100;
        Thread.sleep(time);
        
        
        
        System.out.println("Time test method two");
    }
     
      /*This (expectedExceptions = IndexOutOfBoundsException.class) would mean 
        That we are expecting the test method to through a an IndexOutOfBoundsException
      if this is found then we will pass our test
      */
      
     @Test(expectedExceptions = IndexOutOfBoundsException.class) 
     public void outOfBounds() {
       List nums = new ArrayList();
       
       nums.get(1);//This will throw an exception due to the list having no elements
                   //-the index of 1 does not exist, and is out of the bound of indexes
    }
    
     
    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
