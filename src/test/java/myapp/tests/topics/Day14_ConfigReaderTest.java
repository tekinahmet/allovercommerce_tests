package myapp.tests.topics;
import myapp.utilities.ConfigReader;
import myapp.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;
public class Day14_ConfigReaderTest {
    @Test
    public void configReaderTest(){
//        driver.get("https://www.google.com");
//        driver => Driver.getDriver();
//        "https://www.amazon.com"  =>  ConfigReader.getProperty(amazon_url)
//        Driver.getDriver().get("https://www.amazon.com");
        Driver.getDriver().get(ConfigReader.getProperty("amazon_url"));
//        get the page title
        String title = Driver.getDriver().getTitle();

//        Assert.assertTrue(title.contains("Amazon"));
        Assert.assertTrue(title.contains(ConfigReader.getProperty("amazon_title")));

//        closing driver
        Driver.closeDriver();
    }
}
