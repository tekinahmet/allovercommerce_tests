package allovercommerce.tests.US03_zeynep;

import allovercommerce.pages.ahmet.Ahmet_RegistrationPage;
import allovercommerce.pages.zeynep.Zeynep_AddressesPage;
import allovercommerce.pages.zeynep.Zeynep_SignInPage;
import allovercommerce.utilities.ConfigReader;
import allovercommerce.utilities.Driver;
import allovercommerce.utilities.JSUtils;
import allovercommerce.utilities.WaitUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;


public class US03_TC02 {

//User shouldn't be able to add  Billing Address without Street address
//Go to webpage
//Click the Sign In button
//Enter username in the username field
//Enter password in the password field
//Click the Sign In button
//Click on My Account
//Click on Addresses
//Click on EDIT YOUR BILLING ADDRESS button
//Choose Country/Region
//Enter town/city name in the Town/City field
//Enter postcode/ZIP
//Choose state in the State field
//Enter phone number in the Phone field
//Click SAVE ADDRESS button

    Zeynep_AddressesPage zeynepAddressesPage=new Zeynep_AddressesPage();
    Zeynep_SignInPage zeynepSignInPage =new Zeynep_SignInPage();
    @Test
    public void US03_TC02(){


        //Go to webpage
        Driver.getDriver().get("https://allovercommerce.com/");

        //Click the Sign In button
        zeynepSignInPage.signInButton.click();

        //Enter username in the username field
        zeynepSignInPage.userName.sendKeys("zeynepsguler4");

        //Enter password in the password field
        zeynepSignInPage.password.sendKeys("123zeynep");

        //Click the Sign In button
        zeynepSignInPage.signInButton2.click();


        //Click on My Account
        JSUtils.JSclickWithTimeout(zeynepSignInPage.myAccount);

        //Click on Addresses
        JSUtils.JSclickWithTimeout(zeynepSignInPage.addresses);

        //Click on EDIT YOUR BILLING ADDRESS button
        JSUtils.JSclickWithTimeout(zeynepAddressesPage.editBillingAddress);

        //Choose Country/Region
        // Select select = new Select(zeynepAddressesPage.country);
        //select.selectByVisibleText("Turkey");
        //zeynepAddressesPage.country.sendKeys("Turkey");

        //JSUtils.JSsetValueBy(zeynepAddressesPage.country,"Turkey");
        zeynepAddressesPage.country1.click();
        zeynepAddressesPage.country2.sendKeys(("United States (US)") + Keys.ENTER);


        //Enter town/city name in the Town/City field
        zeynepAddressesPage.town.sendKeys("Konyaaltı");


        //Enter postcode/ZIP
        zeynepAddressesPage.zipcode.sendKeys("12345");

        //Choose state in the State field
        Select select1 = new Select(zeynepAddressesPage.state);
        select1.selectByVisibleText("Wyoming");

        //Enter phone number in the Phone field
        zeynepAddressesPage.phoneNumber.sendKeys("5684036590");

        //Click SAVE ADDRESS button
        JSUtils.JSclickWithTimeout(zeynepAddressesPage.saveAddress);

        //Verify that message shows up
        Assert.assertTrue(zeynepAddressesPage.assertMessage.isDisplayed());


    }
}
