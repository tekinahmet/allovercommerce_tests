package allovercommerce.tests.US05_zeynep;

import allovercommerce.pages.zeynep.Zeynep_AccountDetailsPage;
import allovercommerce.pages.zeynep.Zeynep_SignInPage;
import allovercommerce.utilities.Driver;
import allovercommerce.utilities.ExtentReportUtils;
import allovercommerce.utilities.JSUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US05_TC03 {

    Zeynep_SignInPage zeynepSignInPage = new Zeynep_SignInPage();
    Zeynep_AccountDetailsPage zeynepAccountDetailsPage = new Zeynep_AccountDetailsPage();

    Actions actions=new Actions(Driver.getDriver());
    @Test
    public void US05_TC02() {
        ExtentReportUtils.createTestReport("US05_TC03", "Chancing Account Details");
        ExtentReportUtils.pass("Starting the changing account details test...");


        //User should be able to fill in the Biography section
        //Go to webpage
        //Click on My Account
        //Click on Account Details
        //Enter text in Biography field
        //Click on SAVE CHANGES button
        //Verify that biography has been changed


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

        //Enter text in Biography field
        Driver.getDriver().switchTo().frame(0);
        JSUtils.JSclickWithTimeout(zeynepAccountDetailsPage.biography);
        zeynepAccountDetailsPage.biography.sendKeys("ABcdefg123546");
        Driver.getDriver().switchTo().defaultContent();

        //Click on SAVE CHANGES button
        JSUtils.JSclickWithTimeout(zeynepAccountDetailsPage.saveChangesButton);

        //Verify that biography has been changed
        Assert.assertTrue(zeynepAccountDetailsPage.verifyMessage.isDisplayed());

        ExtentReportUtils.passAndCaptureScreenshot("Account details changed successfully alert is displayed");
        Driver.closeDriver();
        ExtentReportUtils.pass("Driver is closed... Test is completed successfully...");
        ExtentReportUtils.flush();


    }
}
