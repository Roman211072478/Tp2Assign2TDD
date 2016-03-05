import org.testng.Assert;
import org.testng.annotations.*;

/**
 * Created by Rafiq on 2016-03-05.
 */
public class AnimalSider {
    private AnimalClass animal;

    @Test
    public void testANimal() {
        Assert.assertEquals(animal.getSpecies(),"dog","Error the values werent equal");
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        animal = new AnimalClass("dog","m");
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
