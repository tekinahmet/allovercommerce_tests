package allovercommerce.tests.US04_akif;

import allovercommerce.pages.akif.*;
import allovercommerce.utilities.ConfigReader;
import allovercommerce.utilities.Driver;
import allovercommerce.utilities.JSUtils;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC07 {

    AllovCommerceDefaultPage allovCommerceDefaultPage = new AllovCommerceDefaultPage();
    AllovCommerceSignInPage allovCommerceSignInPage = new AllovCommerceSignInPage();
    AllovCommerceHomePage allovCommerceHomePage = new AllovCommerceHomePage();
    AllovCommerceMyAccountPage allovCommerceMyAccountPage = new AllovCommerceMyAccountPage();
    AllovCommerceShippingAddressPage allovCommerceShippingAddressPage = new AllovCommerceShippingAddressPage();

    //User leaves country/region empty and should not be able to add/save shipping address
    //User should be able to see "Country/region is a required field." alert message on the page
    @Test
    public void US04_TC07(){
        Driver.getDriver().get("https://allovercommerce.com/");
        allovCommerceDefaultPage.signinButton.click();
        allovCommerceSignInPage.userName.sendKeys("LovegoodLuna2007");
        allovCommerceSignInPage.password.sendKeys("lovegoodluna2007!!!");
        allovCommerceSignInPage.loginButton.click();
        allovCommerceHomePage.signOutButton.click();
        Assert.assertTrue(allovCommerceMyAccountPage.pageTitle.isDisplayed());
        allovCommerceMyAccountPage.adresses.click();
        Assert.assertTrue(allovCommerceMyAccountPage.shippingAdress.isDisplayed());
        JSUtils.JSclickWithTimeout(allovCommerceMyAccountPage.shippingAddressButton);
        Assert.assertTrue(allovCommerceShippingAddressPage.pageHeader.isDisplayed());

        allovCommerceShippingAddressPage.firstName.clear();
        allovCommerceShippingAddressPage.firstName.sendKeys(ConfigReader.getProperty("akif_US04_name"));

        allovCommerceShippingAddressPage.lastName.clear();
        allovCommerceShippingAddressPage.lastName.sendKeys(ConfigReader.getProperty("akif_US04_lastname"));

        allovCommerceShippingAddressPage.company.clear();
        allovCommerceShippingAddressPage.company.sendKeys(ConfigReader.getProperty("akif_US04_company"));

        allovCommerceShippingAddressPage.street.clear();
        allovCommerceShippingAddressPage.street.sendKeys(ConfigReader.getProperty("akif_US04_street"));

        allovCommerceShippingAddressPage.apartment.clear();
        allovCommerceShippingAddressPage.apartment.sendKeys(ConfigReader.getProperty("akif_US04_apartment"));

        allovCommerceShippingAddressPage.city.clear();
        allovCommerceShippingAddressPage.city.sendKeys(ConfigReader.getProperty("akif_US04_city"));

        allovCommerceShippingAddressPage.postCode.clear();
        allovCommerceShippingAddressPage.postCode.sendKeys(ConfigReader.getProperty("akif_US04_postcode"));

        JSUtils.JSclickWithTimeout(allovCommerceShippingAddressPage.saveButton);

        Assert.assertTrue(allovCommerceShippingAddressPage.countryRegionFieldAlert.isDisplayed());




    }


}
