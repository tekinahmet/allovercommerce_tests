package allovercommerce.tests.US04_akif;

import allovercommerce.pages.akif.*;
import allovercommerce.utilities.*;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC01 {

    AllovCommerceDefaultPage allovCommerceDefaultPage = new AllovCommerceDefaultPage();
    AllovCommerceSignInPage allovCommerceSignInPage = new AllovCommerceSignInPage();
    AllovCommerceHomePage allovCommerceHomePage = new AllovCommerceHomePage();
    AllovCommerceMyAccountPage allovCommerceMyAccountPage = new AllovCommerceMyAccountPage();
    AllovCommerceShippingAddressPage allovCommerceShippingAddressPage = new AllovCommerceShippingAddressPage();

    @Test
    public void US04_TC01(){
        Driver.getDriver().get("https://allovercommerce.com/");
        allovCommerceDefaultPage.signinButton.click();
        allovCommerceSignInPage.userName.sendKeys("Luna_Ravenclaw2007");
        allovCommerceSignInPage.password.sendKeys("Lunalovegood2007!!!");
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

        allovCommerceShippingAddressPage.countryArrow.click();
        allovCommerceShippingAddressPage.countrySearch.sendKeys(ConfigReader.getProperty("akif_US04_country") + Keys.ENTER);

        allovCommerceShippingAddressPage.street.clear();
        allovCommerceShippingAddressPage.street.sendKeys(ConfigReader.getProperty("akif_US04_street"));

        allovCommerceShippingAddressPage.apartment.clear();
        allovCommerceShippingAddressPage.apartment.sendKeys(ConfigReader.getProperty("akif_US04_apartment"));

        allovCommerceShippingAddressPage.city.clear();
        allovCommerceShippingAddressPage.city.sendKeys(ConfigReader.getProperty("akif_US04_city"));

        //JSUtils.JSclickWithTimeout(allovCommerceShippingAddressPage.stateArrow);
        //allovCommerceShippingAddressPage.stateSearch.sendKeys(ConfigReader.getProperty("akif_US04_state") + Keys.ENTER);


        allovCommerceShippingAddressPage.postCode.clear();
        allovCommerceShippingAddressPage.postCode.sendKeys(ConfigReader.getProperty("akif_US04_postcode"));

        JSUtils.JSclickWithTimeout(allovCommerceShippingAddressPage.saveButton);





    }

}
