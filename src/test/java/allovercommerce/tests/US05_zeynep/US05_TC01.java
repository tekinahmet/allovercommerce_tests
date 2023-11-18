package allovercommerce.tests.US05_zeynep;

import allovercommerce.pages.zeynep.Zeynep_AccountDetailsPage;
import allovercommerce.pages.zeynep.Zeynep_SignInPage;
import allovercommerce.utilities.Driver;
import allovercommerce.utilities.ExtentReportUtils;
import allovercommerce.utilities.JSUtils;
import allovercommerce.utilities.WaitUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US05_TC01 {

    Zeynep_SignInPage zeynepSignInPage = new Zeynep_SignInPage();
    Zeynep_AccountDetailsPage zeynepAccountDetailsPage = new Zeynep_AccountDetailsPage();

    //Account Details must be visible
    //Go to webpage
    //Click on My Account
    //Click on Account Details
    //Verify that Account Details is visible

    @Test
    public void US05_TC01(){
        ExtentReportUtils.createTestReport("US05_TC01", "Changing Account Details");
        ExtentReportUtils.pass("Starting the changing account details test...");


        //Go to webpage
        Driver.getDriver().get("https://allovercommerce.com/");
        ExtentReportUtils.pass("User is on the page...");
        zeynepSignInPage.signInButton.click();
        zeynepSignInPage.userName.sendKeys("zeynepsguler4");
        zeynepSignInPage.password.sendKeys("123zeynep");
        zeynepSignInPage.signInButton2.click();
        ExtentReportUtils.pass("Clicked on the sign in button successfully");
        WaitUtils.waitFor(2);

        //Click on My Account
        JSUtils.JSclickWithTimeout(zeynepSignInPage.myAccount);
        //Click on Account Details
        JSUtils.JSclickWithTimeout(zeynepSignInPage.accountDetailsButton);

        //Verify that Account Details is visible
        Assert.assertTrue(zeynepAccountDetailsPage.accountDetailAssert.isDisplayed());

        ExtentReportUtils.passAndCaptureScreenshot("Account details is visible");
        Driver.closeDriver();
        ExtentReportUtils.pass("Driver is closed... Test is completed successfully...");
        ExtentReportUtils.flush();



    }
}
