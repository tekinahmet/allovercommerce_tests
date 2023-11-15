package allovercommerce.tests.US17_oguzhan;

import allovercommerce.pages.oguzhan.Oguzhan_LoginPage;
import allovercommerce.pages.oguzhan.Oguzhan_VendorAccountPage;
import allovercommerce.pages.oguzhan.Oguzhan_VendorBillingPage;
import allovercommerce.utilities.*;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class TC03 {
    @Test

    public void testCase03() throws InterruptedException, IOException {
        Oguzhan_LoginPage oguzhanLoginPage = new Oguzhan_LoginPage();
        Oguzhan_VendorAccountPage oguzhanVendorAccountPage = new Oguzhan_VendorAccountPage();
        Oguzhan_VendorBillingPage oguzhanVendorBillingPage = new Oguzhan_VendorBillingPage();


        // 1. vendor navigates to https://allovercommerce.com/
        Driver.getDriver().get("https://allovercommerce.com/");
        MediaUtils.takeScreenshotOfTheEntirePage();
        // 2. vendor clicks on sign-in button
        oguzhanLoginPage.signIn.click();
        // 3. vendor enters username/e-mail address
        oguzhanLoginPage.userName.sendKeys("oguzhanguven_2020@outlook.com");
        MediaUtils.takeScreenshotOfTheEntirePage();
        // 4. vendor enters password
        oguzhanLoginPage.password.sendKeys("Out23_20*");
        MediaUtils.takeScreenshotOfTheEntirePage();
        // 5. vendor clicks sign in button
        oguzhanLoginPage.signInButton.click();
        // vendor verifies login is successful
        String verifyText1 ="Sign Out";
        Assert.assertTrue(oguzhanVendorAccountPage.signOutSign.isDisplayed(), verifyText1);
        // 6. vendor types product name on the search bar and enters
        Thread.sleep(2000);
        oguzhanVendorAccountPage.searchBar.sendKeys("nutella"+ Keys.ENTER);
        //vendor verifies the product
        oguzhanVendorAccountPage.product.getText().equalsIgnoreCase("nutella");
        //vendor verifies number of products to be purchased can be increased or decreased
        oguzhanVendorAccountPage.increaseButton.click();
        Thread.sleep(2000);
        //7. vendor adds the item into cart
        oguzhanVendorAccountPage.addToCart.click();
        Thread.sleep(1000);
        //8. vendor goes to cart by clicking cart icon
        oguzhanVendorAccountPage.cart.click();
        MediaUtils.takeScreenshotOfTheEntirePage();
        // vendor removes the item from the cart
        oguzhanVendorAccountPage.removeItem.click();
        //vendor verifies shopping cart is empty
        String verifyText4 ="No Products In The Cart.";
        Assert.assertTrue(oguzhanVendorAccountPage.emptyCartMessage.isDisplayed(), verifyText4);
        MediaUtils.takeScreenshotOfTheEntirePage();




    }
}
