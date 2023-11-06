package myapp.tests.topics;
import myapp.pages.OrangeHRM_DashboardPage;
import myapp.pages.OrangeHRM_LoginPage;
import myapp.utilities.BrowserUtils;
import myapp.utilities.ConfigReader;
import myapp.utilities.Driver;
import myapp.utilities.WaitUtils;
import org.testng.Assert;
import org.testng.annotations.Test;
public class Day15_OrangeHRMLogin {
//    Automate login functionality the https://opensource-demo.orangehrmlive.com/web/index.php/auth/login  using page object model
//    Given user is the application login page
//    Then enter the credentials
//    Then verify the login in successful
//    And logout the application
//    Then verify the logout is successful
    @Test
    public void loginTest(){
//    Given user is the application login page
//        Driver.getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//        ALTERNATIVELY
        Driver.getDriver().get(ConfigReader.getProperty("hrm_page"));
//        ****LOG IN SECTION***
//    Then enter the credentials click on login button
        /*
        NOTE: I need to access the page objects
        To do this, create that page objects
         */
        OrangeHRM_LoginPage orangeHRMLoginPage = new OrangeHRM_LoginPage();
        orangeHRMLoginPage.username.sendKeys("Admin");
        WaitUtils.waitFor(2);
        orangeHRMLoginPage.password.sendKeys("admin123");
        WaitUtils.waitFor(2);
        orangeHRMLoginPage.loginButton.click();
        WaitUtils.waitFor(2);
//        ALTERNATIVELY WE CAN USE THE REUSABLE login METHOD
//        orangeHRMLoginPage.login("Admin","admin123");
//        ****LOG IN VERIFICATION SECTION***
//    Then verify the login in successful
        /*
        we can use the profile to do assertion
         */
        OrangeHRM_DashboardPage orangeHRMDashboardPage = new OrangeHRM_DashboardPage();
//        Assert.assertTrue(orangeHRMDashboardPage.profile.isDisplayed());
//        ALTERNATIVELY-RECOMMENDED- USE REUSABLE METHOD
        BrowserUtils.verifyElementDisplayed(orangeHRMDashboardPage.profile);
//        ****LOG OUT SECTION***
////    And logout the application
//        orangeHRMDashboardPage.profile.click();
//        WaitUtils.waitFor(2);
//        orangeHRMDashboardPage.logOut.click();
//        WaitUtils.waitFor(2);

//        ALTERNATIVELY use the proper reusable method
        BrowserUtils.clickWithTimeOut(orangeHRMDashboardPage.profile,5);//dynamic custom method
        BrowserUtils.clickWithTimeOut(orangeHRMDashboardPage.logOut,5);
//        ****LOG OUT VERIFICATION SECTION***
//    Then verify the logout is successful
        /*
        if username, password, login are displayed then logout is successful
         */
        BrowserUtils.verifyElementDisplayed(orangeHRMLoginPage.username);

        Driver.closeDriver();
    }
}