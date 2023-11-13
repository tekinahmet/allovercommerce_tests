package allovercommerce.tests.US07_akif;

import allovercommerce.pages.akif.*;
import allovercommerce.utilities.ConfigReader;
import allovercommerce.utilities.Driver;
import allovercommerce.utilities.JSUtils;
import allovercommerce.utilities.WaitUtils;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC01 {

    AllovCommerceDefaultPage allovCommerceDefaultPage = new AllovCommerceDefaultPage();
    AllovCommerceSignInPage allovCommerceSignInPage = new AllovCommerceSignInPage();
    AllovCommerceHomePage allovCommerceHomePage = new AllovCommerceHomePage();
    AllovCommerceMyAccountPage allovCommerceMyAccountPage = new AllovCommerceMyAccountPage();
    AllovCommerceShippingAddressPage allovCommerceShippingAddressPage = new AllovCommerceShippingAddressPage();
    AllovCommerceItemPage allovCommerceItemPage = new AllovCommerceItemPage();

    @Test
    public void US07_TC01(){

        Driver.getDriver().get("https://allovercommerce.com/");

        allovCommerceDefaultPage.searchBox.sendKeys(ConfigReader.getProperty("akif_US07_item1") + Keys.ENTER);

        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("chess"));

        JSUtils.JSclickWithTimeout(allovCommerceItemPage.compareButton);

        Assert.assertTrue(allovCommerceItemPage.compareConsole.isDisplayed());

        Assert.assertTrue(allovCommerceItemPage.imageItem1.isDisplayed());

        allovCommerceDefaultPage.searchBox.sendKeys(ConfigReader.getProperty("akif_US07_item2") + Keys.ENTER);

        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("pants"));

        JSUtils.JSclickWithTimeout(allovCommerceItemPage.compareButton);

        Assert.assertTrue(allovCommerceItemPage.compareConsole.isDisplayed());

        Assert.assertTrue(allovCommerceItemPage.imageItem2.isDisplayed());

        JSUtils.JSclickWithTimeout(allovCommerceItemPage.startCompareButton);

        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("compare"));








    }

}
