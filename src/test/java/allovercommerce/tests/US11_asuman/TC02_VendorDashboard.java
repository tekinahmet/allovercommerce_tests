package allovercommerce.tests.US11_asuman;

import allovercommerce.pages.asuman.Asu_Homepage;
import allovercommerce.pages.asuman.Asu_VendorDashboardPage;
import allovercommerce.pages.asuman.Asu_VendorSignInPage;
import allovercommerce.utilities.Driver;
import allovercommerce.utilities.JSUtils;
import allovercommerce.utilities.MediaUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertTrue;

public class TC02_VendorDashboard{


    @Test

    public void VendorDashboard() throws IOException {

        Asu_VendorSignInPage asuVendorSignInPage=new Asu_VendorSignInPage();
        Asu_Homepage asuHomepage=new Asu_Homepage();
        Asu_VendorDashboardPage asuVendorDashboardPage=new Asu_VendorDashboardPage();


        //1 Go to  homepage	https://allovercommerce.com and enter signIn credentials
        Driver.getDriver().get("https://allovercommerce.com/");

        asuHomepage.signInItem.click();

        asuHomepage.username.sendKeys("asudeyaz01@gmail.com");

        asuHomepage.password.sendKeys("Raskolnikov1895");

        asuHomepage.signInButton.click();

        asuVendorSignInPage.signOutButton.click();



        //2. Verify that "dashboard" is visible
        assertTrue(asuVendorDashboardPage.dashboardMenu.isDisplayed());
        JSUtils.flashElement(asuVendorDashboardPage.dashboardMenu);


        //4. Verify that "Orders" is visible.
        assertTrue(asuVendorDashboardPage.storeManagerMenu.isDisplayed());
        JSUtils.flashElement(asuVendorDashboardPage.storeManagerMenu);

        //4. Verify that "Orders" is visible.
        assertTrue( asuVendorDashboardPage.ordersMenu.isDisplayed());
        JSUtils.flashElement(asuVendorDashboardPage.ordersMenu);

        // 5. Verify that "Downloads" is visible
        assertTrue(asuVendorDashboardPage.downloadsMenu.isDisplayed());
        JSUtils.flashElement(asuVendorDashboardPage.downloadsMenu);

        //6. Verify that "Adresses" is visible
        assertTrue(asuVendorDashboardPage.adressesMenu.isDisplayed());
        JSUtils.flashElement(asuVendorDashboardPage.adressesMenu);

        //7. Verify that "Account Details" is visible
        assertTrue(asuVendorDashboardPage.accountDetailsMenu.isDisplayed());
        JSUtils.flashElement(asuVendorDashboardPage.accountDetailsMenu);

        //8. Verify that "Wishlist" is visible
        assertTrue(asuVendorDashboardPage.wishlistMenu.isDisplayed());
        JSUtils.flashElement(asuVendorDashboardPage.wishlistMenu);

        //9. Verify that " Support Tickets" is visible
        assertTrue(asuVendorDashboardPage.supportTicketsMenu.isDisplayed());
        JSUtils.flashElement(asuVendorDashboardPage.supportTicketsMenu);

        //10. Verify that  "Followings" is visible
        assertTrue(asuVendorDashboardPage.followingsMenu.isDisplayed());
        JSUtils.flashElement(asuVendorDashboardPage.followingsMenu);

        //11. Verify that "Logout" is visible
        assertTrue(asuVendorDashboardPage.logoutMenu.isDisplayed());
        JSUtils.flashElement(asuVendorDashboardPage.logoutMenu);

        MediaUtils.takeScreenshotOfTheEntirePage();

        Driver.getDriver().close();


    }

}

