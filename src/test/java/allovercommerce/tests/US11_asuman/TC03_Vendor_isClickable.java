package allovercommerce.tests.US11_asuman;

import allovercommerce.pages.asuman.Asu_Homepage;
import allovercommerce.pages.asuman.Asu_VendorDashboardPage;
import allovercommerce.pages.asuman.Asu_VendorSignInPage;
import allovercommerce.utilities.Driver;
import allovercommerce.utilities.JSUtils;
import allovercommerce.utilities.MediaUtils;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertTrue;

public class TC03_Vendor_isClickable {
/*
1.Go to homepage
2. Verify that "Dashboard" is visible
3.  Verify that "Store Manager" is clickable
4. Verify that "Orders" is clickable.
 5. Verify that "Downloads" is clickable
6. Verify that "Adresses" is clickable
 7. Verify that "Account Details" is clickable
8. Verify that "Wishlist" is clickable
 9. Verify that " Support Tickets" is clickable
10. Verify that  "Followings" is clickable
11. Verify that "Logout" is clickable

 */
    @Test

    public void VendorClickable() throws IOException {

        Asu_VendorSignInPage asuVendorSignInPage=new Asu_VendorSignInPage();
        Asu_Homepage asuHomepage=new Asu_Homepage();
        Asu_VendorDashboardPage asuVendorDashboardPage=new Asu_VendorDashboardPage();


        //1. Go to  homepage	https://allovercommerce.com and enter login credentials
        Driver.getDriver().get("https://allovercommerce.com/");

        Asu_Homepage.signInItem.click();

        Asu_Homepage.username.sendKeys("asudeyaz01@gmail.com");

        Asu_Homepage.password.sendKeys("Raskolnikov1895");

        Asu_Homepage.signInButton.click();

        Asu_VendorSignInPage.signOutButton.click();



       // 2. Verify that "Dashboard" is visible
        assertTrue(Asu_VendorDashboardPage.dashboardMenu.isEnabled());
        JSUtils.flashElement(Asu_VendorDashboardPage.dashboardMenu);

       //3.  Verify that "Store Manager" is clickable
        assertTrue(Asu_VendorDashboardPage.storeManagerMenu.isEnabled());
        JSUtils.flashElement(Asu_VendorDashboardPage.storeManagerMenu);

       //4. Verify that "Orders" is clickable.
        assertTrue(Asu_VendorDashboardPage.ordersMenu.isEnabled());
        JSUtils.flashElement(Asu_VendorDashboardPage.ordersMenu);

        // 5. Verify that "Downloads" is clickable
        assertTrue(Asu_VendorDashboardPage.downloadsMenu.isEnabled());
        JSUtils.flashElement(Asu_VendorDashboardPage.downloadsMenu);

        //6. Verify that "Adresses" is clickable
        assertTrue(Asu_VendorDashboardPage.adressesMenu.isEnabled());
        JSUtils.flashElement(Asu_VendorDashboardPage.adressesMenu);

        // 7. Verify that "Account Details" is clickable
        assertTrue(Asu_VendorDashboardPage.accountDetailsMenu.isEnabled());
        JSUtils.flashElement(Asu_VendorDashboardPage.accountDetailsMenu);

        //8. Verify that "Wishlist" is clickable
        assertTrue(Asu_VendorDashboardPage.wishlistMenu.isEnabled());
        JSUtils.flashElement(Asu_VendorDashboardPage.wishlistMenu);

        //9. Verify that " Support Tickets" is clickable
        assertTrue(Asu_VendorDashboardPage.supportTicketsMenu.isEnabled());
        JSUtils.flashElement(Asu_VendorDashboardPage.supportTicketsMenu);

        //10. Verify that  "Followings" is clickable
        assertTrue(Asu_VendorDashboardPage.followingsMenu.isEnabled());
        JSUtils.flashElement(Asu_VendorDashboardPage.followingsMenu);

        //11. Verify that "Logout" is clickable
        assertTrue(Asu_VendorDashboardPage.logoutMenu.isEnabled());
        JSUtils.flashElement(Asu_VendorDashboardPage.logoutMenu);

        MediaUtils.takeScreenshotOfTheEntirePage();

        Driver.getDriver().close();

    }

}
