package allovercommerce.tests.US07_akif;

import allovercommerce.pages.akif.*;
import allovercommerce.utilities.ConfigReader;
import allovercommerce.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class TC01 {

    AllovCommerceDefaultPage allovCommerceDefaultPage = new AllovCommerceDefaultPage();
    AllovCommerceSignInPage allovCommerceSignInPage = new AllovCommerceSignInPage();
    AllovCommerceHomePage allovCommerceHomePage = new AllovCommerceHomePage();
    AllovCommerceMyAccountPage allovCommerceMyAccountPage = new AllovCommerceMyAccountPage();
    AllovCommerceShippingAddressPage allovCommerceShippingAddressPage = new AllovCommerceShippingAddressPage();

    @Test
    public void US07_TC01(){

        Driver.getDriver().get("https://allovercommerce.com/");

        allovCommerceDefaultPage.searchButton = Driver.getDriver().findElement(By.xpath("(//button[@class='btn btn-search'])[1]"));
        allovCommerceDefaultPage.searchButton.click();
        allovCommerceDefaultPage.searchBox.sendKeys(ConfigReader.getProperty("akif_US07_item1") + Keys.ENTER);



    }

}
