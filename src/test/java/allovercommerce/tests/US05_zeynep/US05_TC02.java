package allovercommerce.tests.US05_zeynep;

import allovercommerce.pages.zeynep.Zeynep_AccountDetailsPage;
import allovercommerce.pages.zeynep.Zeynep_SignInPage;
import allovercommerce.utilities.Driver;
import allovercommerce.utilities.ExtentReportUtils;
import allovercommerce.utilities.JSUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US05_TC02 {
    //User should be able to change First name, Last name, Display name and Email address information
    //Go to webpage
    //Click on My Account
    //Click on Account Details
    //Enter a new name in First name field
    //Enter a new last name in Last Name filed
    //Enter a new display name in Display Name field
    //Enter a new email address in Email Address field
    //Click on SAVE CHANGES button
    //Verify that the details has been changed
    Zeynep_SignInPage zeynepSignInPage = new Zeynep_SignInPage();
    Zeynep_AccountDetailsPage zeynepAccountDetailsPage = new Zeynep_AccountDetailsPage();

    @Test
    public void US05_TC02(){
        ExtentReportUtils.createTestReport("US05_TC02", "Chancing Account Details");
        ExtentReportUtils.pass("Starting the changing account details test...");


        //Go to webpage
        Driver.getDriver().get("https://allovercommerce.com/");
        ExtentReportUtils.pass("User is on the page...");
        zeynepSignInPage.signInButton.click();
        zeynepSignInPage.userName.sendKeys("zeynepsguler4");
        zeynepSignInPage.password.sendKeys("123zeynep");
        ExtentReportUtils.pass("Clicked on the sign in button successfully");
        zeynepSignInPage.signInButton2.click();

        //Click on My Account
        JSUtils.JSclickWithTimeout(zeynepSignInPage.myAccount);
        //Click on Account Details
        JSUtils.JSclickWithTimeout(zeynepSignInPage.accountDetailsButton);

        //Enter a new name in First name field
        zeynepAccountDetailsPage.reFirstName.clear();
        zeynepAccountDetailsPage.reFirstName.sendKeys("Sude");

        //Enter a new last name in Last Name filed
        zeynepAccountDetailsPage.reLastName.clear();
        zeynepAccountDetailsPage.reLastName.sendKeys("Güler");

        //Enter a new display name in Display Name field
        zeynepAccountDetailsPage.displayName.clear();
        zeynepAccountDetailsPage.displayName.sendKeys("zeynepsguler247");

        //Enter a new email address in Email Address field
        zeynepAccountDetailsPage.reEmailAddress.clear();
        zeynepAccountDetailsPage.reEmailAddress.sendKeys("jebodo5280@othao.com");

        //Click on SAVE CHANGES button
        JSUtils.JSclickWithTimeout(zeynepAccountDetailsPage.saveChangesButton);

        //Verify that the details has been changed
        Assert.assertTrue(zeynepAccountDetailsPage.verifyMessage.isDisplayed());

        ExtentReportUtils.passAndCaptureScreenshot("Account details changed successfully alert is displayed");
        Driver.closeDriver();
        ExtentReportUtils.pass("Driver is closed... Test is completed successfully...");
        ExtentReportUtils.flush();



    }
}
