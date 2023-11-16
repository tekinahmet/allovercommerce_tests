package allovercommerce.tests.US04_akif;

import allovercommerce.pages.akif.*;
import allovercommerce.utilities.*;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC05 {

    AllovCommerceDefaultPage allovCommerceDefaultPage = new AllovCommerceDefaultPage();
    AllovCommerceSignInPage allovCommerceSignInPage = new AllovCommerceSignInPage();
    AllovCommerceHomePage allovCommerceHomePage = new AllovCommerceHomePage();
    AllovCommerceMyAccountPage allovCommerceMyAccountPage = new AllovCommerceMyAccountPage();
    AllovCommerceShippingAddressPage allovCommerceShippingAddressPage = new AllovCommerceShippingAddressPage();

    //User leaves First name empty and should not be able to add/save shipping address
    //User should be able to see "First name is a required field." alert message on the page
    @Test
    public void US04_TC05(){

        LoggerUtils.info("Test case begins...");

        ExtentReportUtils.createTestReport("US04_TC05 Test Report", "Adding Shipping Address Test");
        ExtentReportUtils.pass("Starting the adding shipping address test...");

        Driver.getDriver().get("https://allovercommerce.com/");

        ExtentReportUtils.pass("User in on the default page...");

        allovCommerceDefaultPage.signinButton.click();

        ExtentReportUtils.pass("Navigated to the sign-in page...");

        ExtentReportUtils.info("Entering Customer credentials...");

        allovCommerceSignInPage.userName.sendKeys("Luna_Ravenclaw2007");
        allovCommerceSignInPage.password.sendKeys("Lunalovegood2007!!!");
        allovCommerceSignInPage.loginButton.click();

        ExtentReportUtils.passAndCaptureScreenshot("Entered Customer credentials, and clicked on login button successfully...");

        Assert.assertTrue(allovCommerceHomePage.signOutButton.isDisplayed());
        ExtentReportUtils.passAndCaptureScreenshot("Login is verified...");

        allovCommerceHomePage.signOutButton.click();
        Assert.assertTrue(allovCommerceMyAccountPage.pageTitle.isDisplayed());

        ExtentReportUtils.pass("Navigated to the My Account page...");

        allovCommerceMyAccountPage.adresses.click();
        Assert.assertTrue(allovCommerceMyAccountPage.shippingAdress.isDisplayed());

        ExtentReportUtils.pass("Navigated to the Addresses page...");

        JSUtils.JSclickWithTimeout(allovCommerceMyAccountPage.shippingAddressButton);
        Assert.assertTrue(allovCommerceShippingAddressPage.pageHeader.isDisplayed());

        ExtentReportUtils.pass("Navigated to the Shipping Address page...");

        ExtentReportUtils.info("Entering customer information for shipping address...");

        allovCommerceShippingAddressPage.firstName.clear();
        //allovCommerceShippingAddressPage.firstName.sendKeys(ConfigReader.getProperty("akif_US04_name"));

        allovCommerceShippingAddressPage.lastName.clear();
        allovCommerceShippingAddressPage.lastName.sendKeys(ConfigReader.getProperty("akif_US04_lastname"));

        allovCommerceShippingAddressPage.company.clear();
        allovCommerceShippingAddressPage.company.sendKeys(ConfigReader.getProperty("akif_US04_company"));

        allovCommerceShippingAddressPage.countryArrow.click();
        allovCommerceShippingAddressPage.countrySearch.sendKeys(ConfigReader.getProperty("akif_US04_country") + Keys.ENTER);

        allovCommerceShippingAddressPage.street.clear();
        allovCommerceShippingAddressPage.street.sendKeys(ConfigReader.getProperty("akif_US04_street"));

        allovCommerceShippingAddressPage.apartment.clear();
        allovCommerceShippingAddressPage.apartment.sendKeys(ConfigReader.getProperty("akif_US04_apartment"));

        allovCommerceShippingAddressPage.city.clear();
        allovCommerceShippingAddressPage.city.sendKeys(ConfigReader.getProperty("akif_US04_city"));

        allovCommerceShippingAddressPage.postCode.clear();
        allovCommerceShippingAddressPage.postCode.sendKeys(ConfigReader.getProperty("akif_US04_postcode"));

        JSUtils.JSclickWithTimeout(allovCommerceShippingAddressPage.saveButton);

        ExtentReportUtils.passAndCaptureScreenshot("Entered customer information, and clicked on save button...");

        Assert.assertTrue(allovCommerceShippingAddressPage.firstNameFieldAlert.isDisplayed());

        ExtentReportUtils.passAndCaptureScreenshot("Shipping address could not save successfully, ''First name is a required field.'' alert message is displayed ont he page...");

        Driver.closeDriver();

        ExtentReportUtils.pass("Driver is closed...Test case passed successfully...");

        ExtentReportUtils.flush();

        LoggerUtils.info("Test completed...");





    }


}
