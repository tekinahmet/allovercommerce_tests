package allovercommerce.tests.US03_zeynep;

import allovercommerce.pages.ahmet.Ahmet_RegistrationPage;
import allovercommerce.pages.zeynep.Zeynep_AddressesPage;
import allovercommerce.pages.zeynep.Zeynep_SignInPage;
import allovercommerce.utilities.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;


public class US03_TC03 {
//User shouldn't be able to add  Billing Address without Town City name
//Go to webpage
//Click the Sign In button
//Enter username in the username field
//Enter password in the password field
//Click the Sign In button
//Click on My Account
//Click on Addresses
//Click on EDIT YOUR BILLING ADDRESS button
//Choose Country/Region
//Enter street address in the Street address field
//Enter postcode/ZIP
//Choose state in the State field
//Enter phone number in the Phone field
//Click SAVE ADDRESS button

    Zeynep_AddressesPage zeynepAddressesPage=new Zeynep_AddressesPage();
    Zeynep_SignInPage zeynepSignInPage =new Zeynep_SignInPage();
    @Test
    public void US03_TC03(){
        ExtentReportUtils.createTestReport("US03_TC03", "Adding Billing Address");
        ExtentReportUtils.pass("Starting the adding billing address test...");


        //Go to webpage
        Driver.getDriver().get("https://allovercommerce.com/");
        ExtentReportUtils.pass("User is on the page...");

        //Click the Sign In button
        zeynepSignInPage.signInButton.click();
        ExtentReportUtils.pass("Entering the username and password...");
        //Enter username in the username field
        zeynepSignInPage.userName.sendKeys("zeynepsguler5");

        //Enter password in the password field
        zeynepSignInPage.password.sendKeys("123zeynep");

        //Click the Sign In button
        zeynepSignInPage.signInButton2.click();
        WaitUtils.waitFor(5);
        ExtentReportUtils.pass("Clicked on the sign in button successfully");
        //Click on My Account
        JSUtils.JSclickWithTimeout(zeynepSignInPage.myAccount);

        //Click on Addresses
        JSUtils.JSclickWithTimeout(zeynepSignInPage.addresses);

        //Click on EDIT YOUR BILLING ADDRESS button
        JSUtils.JSclickWithTimeout(zeynepAddressesPage.editBillingAddress);

        //Choose Country/Region
        zeynepAddressesPage.country1.click();
        zeynepAddressesPage.country2.sendKeys(("United States (US)") + Keys.ENTER);


        //Enter street address in the Street address field
        zeynepAddressesPage.street.sendKeys("Olbia Çarşı Merkezi, 10 Nolu Bölüm Antalya Merkez");

        //Enter postcode/ZIP
        zeynepAddressesPage.zipcode.sendKeys("12345");

        //Choose state in the State field
        Select select1 = new Select(zeynepAddressesPage.state);
        select1.selectByVisibleText("Wyoming");


        //Enter phone number in the Phone field
        zeynepAddressesPage.phoneNumber.sendKeys("5684036590");

        //Click SAVE ADDRESS button
        JSUtils.JSclickWithTimeout(zeynepAddressesPage.saveAddress);
        ExtentReportUtils.pass("Entered billing address information except Town Name");

        //Verify that message shows up
        Assert.assertTrue(zeynepAddressesPage.assertMessage.isDisplayed());
        ExtentReportUtils.passAndCaptureScreenshot("Billing address could not save successfully, ''Town/City is a required field.'' alert message is displayed on the page...");
        Driver.closeDriver();
        ExtentReportUtils.pass("Driver is closed... Test is completed successfully...");
        ExtentReportUtils.flush();

    }
}
