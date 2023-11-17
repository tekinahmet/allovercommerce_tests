package allovercommerce.tests.US08_asuman;

import allovercommerce.pages.asuman.Asu_Homepage;
import allovercommerce.pages.asuman.Asu_VendorDashboardPage;
import allovercommerce.pages.asuman.Asu_WishlistPage;
import allovercommerce.utilities.Driver;
import allovercommerce.utilities.JSUtils;
import allovercommerce.utilities.MediaUtils;
import allovercommerce.utilities.WaitUtils;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import java.io.IOException;

public class TC02_VisibilityOfProducts {

    @Test
    public void visibilityOfProducts() throws IOException {

        Asu_Homepage asuHomepage=new Asu_Homepage();
        Asu_WishlistPage asuWishlistPage=new Asu_WishlistPage();

//1 Go to  homepage	https://allovercommerce.com
        Driver.getDriver().get("https://allovercommerce.com/");
        asuHomepage.searchBar.sendKeys("macbook",Keys.ENTER);
//2. Click on "sign in" button
        asuHomepage.signInItem.click();
//3. Enter  e-mail address     	ayazasuman@gmail.com
        asuHomepage.username.sendKeys("ayazasuman@gmail.com");
//4.  Enter password  	ofelya1863
        asuHomepage.password.sendKeys("ofelya1863");
//5. Click on "sign in" button
        asuHomepage.signInButton.click();
//6. Verify that searchbox is visible


//7. click on "Search" item
        // Asu_Homepage.searchBar.click();
        // Thread.sleep(2000);
//8. Write a product name	 macbook

//9. Verify that results include "macbook"
        asuHomepage.resultVerification.getText().contains("macbook");

//10. Select(hoover over) a product	macbook
        WaitUtils.waitFor(5);
        asuHomepage.macbook1.click();

//11.Click on wishlist item on the product
        Asu_Homepage.wishlistItem1.click();

        asuHomepage.searchBar.sendKeys("macbook",Keys.ENTER);


//12. Select (hoover over) another product	macbook
        Asu_Homepage.macbookPro.click();

//13. Click on wishlist item on the product
        Asu_Homepage.wishlistItem2.click();

//14. Click on "Wishlist" item on the page
        Asu_Homepage.pageWishlistItem.click();
//15. Verify that "Wishlist" item is clicked





        // 3. Verify that page title "Wishlist" is visible
        asuWishlistPage.pageTitleWishlist.isDisplayed();
        JSUtils.flashElement(asuWishlistPage.pageTitleWishlist);



        //4. Verify that selected products are visible on the wishlist page
        asuHomepage.macbookPro.isDisplayed();
        JSUtils.flashElement(asuHomepage.macbookPro);



        MediaUtils.takeScreenshotOfTheEntirePage();


        Driver.closeDriver();





    }
}
