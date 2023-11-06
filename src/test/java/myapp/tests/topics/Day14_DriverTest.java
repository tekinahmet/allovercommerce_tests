package myapp.tests.topics;

import myapp.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Day14_DriverTest {
    @Test
    public void driverTest(){
//        driver.get("https://www.google.com");
//        driver => Driver.getDriver();
        Driver.getDriver().get("https://www.amazon.com");
//        get the page title
        String title = Driver.getDriver().getTitle();
        Assert.assertTrue(title.contains("Amazon"));
//        closing driver
        Driver.closeDriver();
    }
}
