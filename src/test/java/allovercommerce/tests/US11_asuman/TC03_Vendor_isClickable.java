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

       asuHomepage.signInItem.click();

        asuHomepage.username.sendKeys("asudeyaz01@gmail.com");

        asuHomepage.password.sendKeys("Raskolnikov1895");

        asuHomepage.signInButton.click();

        asuVendorSignInPage.signOutButton.click();



       // 2. Verify that "Dashboard" is visible
        assertTrue(asuVendorDashboardPage.dashboardMenu.isEnabled());
        JSUtils.flashElement(asuVendorDashboardPage.dashboardMenu);

       //3.  Verify that "Store Manager" is clickable
        assertTrue(asuVendorDashboardPage.storeManagerMenu.isEnabled());
        JSUtils.flashElement(asuVendorDashboardPage.storeManagerMenu);

       //4. Verify that "Orders" is clickable.
        assertTrue(asuVendorDashboardPage.ordersMenu.isEnabled());
        JSUtils.flashElement(asuVendorDashboardPage.ordersMenu);

        // 5. Verify that "Downloads" is clickable
        assertTrue(asuVendorDashboardPage.downloadsMenu.isEnabled());
        JSUtils.flashElement(asuVendorDashboardPage.downloadsMenu);

        //6. Verify that "Adresses" is clickable
        assertTrue(asuVendorDashboardPage.adressesMenu.isEnabled());
        JSUtils.flashElement(asuVendorDashboardPage.adressesMenu);

        // 7. Verify that "Account Details" is clickable
        assertTrue(asuVendorDashboardPage.accountDetailsMenu.isEnabled());
        JSUtils.flashElement(asuVendorDashboardPage.accountDetailsMenu);

        //8. Verify that "Wishlist" is clickable
        assertTrue(asuVendorDashboardPage.wishlistMenu.isEnabled());
        JSUtils.flashElement(asuVendorDashboardPage.wishlistMenu);

        //9. Verify that " Support Tickets" is clickable
        assertTrue(asuVendorDashboardPage.supportTicketsMenu.isEnabled());
        JSUtils.flashElement(asuVendorDashboardPage.supportTicketsMenu);

        //10. Verify that  "Followings" is clickable
        assertTrue(asuVendorDashboardPage.followingsMenu.isEnabled());
        JSUtils.flashElement(asuVendorDashboardPage.followingsMenu);

        //11. Verify that "Logout" is clickable
        assertTrue(asuVendorDashboardPage.logoutMenu.isEnabled());
        JSUtils.flashElement(asuVendorDashboardPage.logoutMenu);

        MediaUtils.takeScreenshotOfTheEntirePage();

        Driver.getDriver().close();

    }

}
