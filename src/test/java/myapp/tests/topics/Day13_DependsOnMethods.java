package myapp.tests.topics;
import org.testng.Assert;
import org.testng.annotations.Test;
public class Day13_DependsOnMethods {
    @Test
    public void homePageTest(){
        System.out.println("home page");
    }
    @Test
    public void searchTest(){
        System.out.println("search test");
        Assert.assertTrue(true);
    }
    @Test(dependsOnMethods = "searchTest")//checkout is dependent on search.
    public void checkOutTest(){
        System.out.println("checkout test");
    }
}
