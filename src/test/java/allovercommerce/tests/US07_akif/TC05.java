package allovercommerce.tests.US07_akif;

import allovercommerce.pages.akif.*;
import allovercommerce.utilities.ConfigReader;
import allovercommerce.utilities.Driver;
import allovercommerce.utilities.JSUtils;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC05 {

    AllovCommerceDefaultPage allovCommerceDefaultPage = new AllovCommerceDefaultPage();
    AllovCommerceSignInPage allovCommerceSignInPage = new AllovCommerceSignInPage();
    AllovCommerceHomePage allovCommerceHomePage = new AllovCommerceHomePage();
    AllovCommerceMyAccountPage allovCommerceMyAccountPage = new AllovCommerceMyAccountPage();
    AllovCommerceShippingAddressPage allovCommerceShippingAddressPage = new AllovCommerceShippingAddressPage();
    AllovCommerceItemPage allovCommerceItemPage = new AllovCommerceItemPage();
    AllovCommerceComparePage allovCommerceComparePage = new AllovCommerceComparePage();

    //User should be able to add and compare items on the Compare Page
    //Then user should be able to verify that item review info are displayed on the page
    @Test
    public void US07_TC05(){

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

        Assert.assertFalse(allovCommerceComparePage.reviewItem1.getText().isBlank());

        Assert.assertFalse(allovCommerceComparePage.reviewItem2.getText().isBlank());


    }


}
