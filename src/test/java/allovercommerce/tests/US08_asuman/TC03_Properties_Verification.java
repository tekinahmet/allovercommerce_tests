package allovercommerce.tests.US08_asuman;

import allovercommerce.pages.asuman.Asu_Homepage;
import allovercommerce.pages.asuman.Asu_WishlistPage;
import allovercommerce.utilities.Driver;
import allovercommerce.utilities.JSUtils;
import allovercommerce.utilities.MediaUtils;
import allovercommerce.utilities.WaitUtils;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import java.io.IOException;

public class TC03_Properties_Verification {

    @Test
    public void PropertiesVerification() throws IOException {

        Asu_Homepage asuHomepage=new Asu_Homepage();
        Asu_WishlistPage asuWishlistPage=new Asu_WishlistPage();

        //1 Go to  homepage	https://allovercommerce.com
        Driver.getDriver().get("https://allovercommerce.com/");

        //8. Write a product name	 macbook
        asuHomepage.searchBar.sendKeys("macbook",Keys.ENTER);

        //2. Click on "sign in" button
        asuHomepage.signInItem.click();

        //3. Enter  e-mail address ayazasuman@gmail.com
        asuHomepage.username.sendKeys("ayazasuman@gmail.com");

        //4.  Enter password  	ofelya1863
        asuHomepage.password.sendKeys("ofelya1863");

        //5. Click on "sign in" button
        asuHomepage.signInButton.click();

        //6. Select(hoover over) a product	macbook
        WaitUtils.waitFor(10);
        asuHomepage.macbook1.click();

        //7.Click on wishlist item on the product
        Asu_Homepage.wishlistItem1.click();

        asuHomepage.searchBar.sendKeys("macbook",Keys.ENTER);

        //8. Select (hoover over) another product	macbook
        Asu_Homepage.macbookPro.click();

        //9. Click on wishlist item on the product
        Asu_Homepage.wishlistItem2.click();

        //10. Click on "Wishlist" item on the page
        Asu_Homepage.pageWishlistItem.click();


        //11. Click on "Wishlist" item on the page
        Asu_Homepage.pageWishlistItem.click();

        // 12. Verify that page title "Wishlist" is visible
  asuWishlistPage.pageTitleWishlist.isDisplayed();


        //13. Verify that selected products are visible on the wishlist page
        asuHomepage.macbookPro.isDisplayed();

        //14. Click on "QUICK VIEW" button
        asuWishlistPage.quickView.click();

        //15. Verify that "Category" is visible
        asuWishlistPage.category.isDisplayed();
        JSUtils.flashElement(asuWishlistPage.category);

        MediaUtils.takeScreenshotOfTheEntirePage();

        Driver.closeDriver();
    }


}
