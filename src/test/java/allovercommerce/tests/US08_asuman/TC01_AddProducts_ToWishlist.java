package allovercommerce.tests.US08_asuman;

import allovercommerce.pages.asuman.Asu_Homepage;
import allovercommerce.pages.asuman.Asu_WishlistPage;
import allovercommerce.utilities.Driver;
import allovercommerce.utilities.MediaUtils;
import allovercommerce.utilities.WaitUtils;
import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertTrue;

public class TC01_AddProducts_ToWishlist {

    @Test
    public void addWishlist() throws IOException {
        Asu_Homepage asuHomepage=new Asu_Homepage();

        WaitUtils.waitFor(5);
        //1 Go to  homepage	https://allovercommerce.com
        Driver.getDriver().get("https://allovercommerce.com/");

        //8. Write a product name	 macbook
        asuHomepage.searchBar.sendKeys("macbook",Keys.ENTER); //there is a bug here

        //2. Click on "sign in" button
        asuHomepage.signInItem.click();

        //3. Enter  e-mail address     	ayazasuman@gmail.com
        asuHomepage.username.sendKeys("ayazasuman@gmail.com");

        //4.  Enter password  	ofelya1863
        asuHomepage.password.sendKeys("ofelya1863");


        //5. Click on "sign in" button
        asuHomepage.signInButton.click();



        //6. Verify that results include "macbook"
        asuHomepage.resultVerification.getText().contains("macbook");

        //7. Select(hoover over) a product	macbook
        WaitUtils.waitFor(5);

        asuHomepage.macbook1.click();

        //8.Click on wishlist item on the product
        Asu_Homepage.wishlistItem1.click();
        asuHomepage.searchBar.sendKeys("macbook",Keys.ENTER);


        //9. Select (hoover over) another product	macbook
        Asu_Homepage.macbookPro.click();

        //10. Click on wishlist item on the product
        Asu_Homepage.wishlistItem2.click();

        //11. Click on "Wishlist" item on the page
        Asu_Homepage.pageWishlistItem.click();



        MediaUtils.takeScreenshotOfTheEntirePage();
        Driver.closeDriver();

    }
}
