package myapp.tests.smoketest;
import myapp.pages.RentalHomePage;
import myapp.pages.RentalLoginPage;
import myapp.utilities.*;
import org.openqa.selenium.remote.Browser;
import org.testng.Assert;
import org.testng.annotations.Test;
public class Day15_US100201_Admin_Login {
    @Test(groups = "minor_regression_group")
    public void US100201_Admin_Login(){
//        As admin, I should be able to log in the application
//        https://www.bluerentalcars.com/
        //        Given user is on the application home page
        Driver.getDriver().get("https://www.bluerentalcars.com/");
//        Admin email: jack1@gmail.com
//        Admin password: 12345
//        Then clicks on login link
        RentalHomePage rentalHomePage = new RentalHomePage();
        rentalHomePage.loginLink.click();
        WaitUtils.waitFor(2);
//        Then enters admin email, password
        RentalLoginPage rentalLoginPage = new RentalLoginPage();
        rentalLoginPage.username.sendKeys("jack1@gmail.com");
        WaitUtils.waitFor(2);
        rentalLoginPage.password.sendKeys("12345");
        WaitUtils.waitFor(2);
//        Then click on login button
        rentalLoginPage.loginButton.click();
        WaitUtils.waitFor(2);
//        Then verify the login is successful
        Assert.assertTrue(rentalHomePage.userID.isDisplayed());
//        close the browser
        Driver.closeDriver();
    }
    /*
    NOTE: above test case is already good. But we can make it more dynamic using reusable methods
     */
/*
    ADD EXTENT REPORTS CAPABILITY
    1. use createTestReport(String name,String description) first for creating extent report capability
    2. then use any method to mark as pass, info, fail
    3. Then use flush to generate the report
 */
    /*
    ADD LOGGER REPORT CAPABILITY
    1. use any method from LoggerUtils directly.
     */
    @Test
    public void withReusableMethods(){
//        Using logger utils
        LoggerUtils.info("Test case begins .. ");
//        1.......
        ExtentReportUtils.createTestReport("Smoke Test Report","Admin Login Test");
//        2......
        ExtentReportUtils.pass("Starting the admin login test...");
        //        As admin, I should be able to log in the application
//        https://www.bluerentalcars.com/
        //        Given user is on the application home page
//        Driver.getDriver().get("https://www.bluerentalcars.com/");
//        ALTERNATIVELY get the url from config property
        Driver.getDriver().get(ConfigReader.getProperty("app_home_url"));
//        2.....
        ExtentReportUtils.pass("User is on the home page....");
//        Admin email: jack1@gmail.com
//        Admin password: 12345
//        Then clicks on login link
        RentalHomePage rentalHomePage = new RentalHomePage();
//        rentalHomePage.loginLink.click();
//        WaitUtils.waitFor(2)
//        ALTERNATIVELY - use reusable method to click with timeout dynamically
        BrowserUtils.clickWithTimeOut(rentalHomePage.loginLink,5);
//        2......
        ExtentReportUtils.pass("Navigated to the login page....");
//        Then enters admin email, password
        RentalLoginPage rentalLoginPage = new RentalLoginPage();
//        rentalLoginPage.username.sendKeys("jack1@gmail.com");
//        WaitUtils.waitFor(2);
//        rentalLoginPage.password.sendKeys("12345");
//        WaitUtils.waitFor(2);
//        ALTERNATIVELY - use reusable method to type with timeout dynamically
//        2.....
        ExtentReportUtils.info("Entering the username and password...Username : "+ConfigReader.getProperty("admin_username")+".Password : "+ConfigReader.getProperty("admin_password") );
        BrowserUtils.sendKeysWithTimeout(rentalLoginPage.username,ConfigReader.getProperty("admin_username"),5);
        BrowserUtils.sendKeysWithTimeout(rentalLoginPage.password,ConfigReader.getProperty("admin_password"),5);
//        2.....
        ExtentReportUtils.passAndCaptureScreenshot(
                "Username : "+ConfigReader.getProperty("admin_username")
                        +" password : "+ConfigReader.getProperty("admin_password")+" are entered successfully");
//        Then click on login button
//        rentalLoginPage.loginButton.click();
//        WaitUtils.waitFor(2);
//        ALTERNATIVELY - use reusable method to click with timeout dynamically
        BrowserUtils.clickWithTimeOut(rentalLoginPage.loginButton,5);
//        2......
        ExtentReportUtils.pass("Entered Admin credentials, and clicked on the login button successfully");
//        Then verify the login is successful
//        Assert.assertTrue(rentalHomePage.userID.isDisplayed());
//        ALTERNATIVELY - use reusable method to verify with timeout dynamically
        BrowserUtils.verifyElementDisplayed(rentalHomePage.userID);
//        2.....
        ExtentReportUtils.passAndCaptureScreenshot("Login is verified....");
//        close the browser
        Driver.closeDriver();
//        2.....
        ExtentReportUtils.pass("Driver is closed.... Test is completed successfully...");
//        3......
        ExtentReportUtils.flush();
//        Logger utils
        LoggerUtils.info("Test completed...");
    }
}
