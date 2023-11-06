package myapp.tests.topics;
import org.testng.Assert;
import org.testng.annotations.Test;
public class Day13_DependsOnGroups {
    @Test(groups = "smoke-test")
    public void homePageTest(){
        System.out.println("home page");
    }
    @Test(groups = "smoke-test")
    public void searchTest(){
        System.out.println("search test");
        Assert.assertTrue(false);
    }
    @Test(groups = "regression-test")
    public void checkOutTest(){
        System.out.println("checkout test");
    }
    @Test(dependsOnGroups = "smoke-test")//logout is dependent on smoke-test. if all smoke-test groups pass then this executes. otherwise this is skipped
    public void logOutTest(){
        System.out.println("logout test");
    }
}