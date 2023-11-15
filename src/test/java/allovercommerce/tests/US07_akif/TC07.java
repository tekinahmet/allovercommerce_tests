package allovercommerce.tests.US07_akif;

import allovercommerce.pages.akif.*;
import allovercommerce.utilities.*;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC07 {

    AllovCommerceDefaultPage allovCommerceDefaultPage = new AllovCommerceDefaultPage();
    AllovCommerceSignInPage allovCommerceSignInPage = new AllovCommerceSignInPage();
    AllovCommerceHomePage allovCommerceHomePage = new AllovCommerceHomePage();
    AllovCommerceMyAccountPage allovCommerceMyAccountPage = new AllovCommerceMyAccountPage();
    AllovCommerceShippingAddressPage allovCommerceShippingAddressPage = new AllovCommerceShippingAddressPage();
    AllovCommerceItemPage allovCommerceItemPage = new AllovCommerceItemPage();
    AllovCommerceComparePage allovCommerceComparePage = new AllovCommerceComparePage();

    //User should be able to add and compare items on the Compare Page
    //And user should be able to remove items by clicking cross
    //Then user should be able to verify that items are no longer displayed on the page
    // (No products added to the compare message should be displayed on the page)
    @Test
    public void US07_TC07(){

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

        /*
        allovCommerceComparePage.removeItem1.click();
        WaitUtils.waitFor(2);
        allovCommerceComparePage.removeItem1.click();
        */

        allovCommerceComparePage.removeItem2.click();
        WaitUtils.waitFor(2);
        allovCommerceComparePage.removeItem1.click();

        Assert.assertTrue(allovCommerceComparePage.noProductsMessage.isDisplayed());


    }

}
