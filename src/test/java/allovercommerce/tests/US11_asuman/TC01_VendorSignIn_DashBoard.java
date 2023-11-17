package allovercommerce.tests.US11_asuman;

import allovercommerce.pages.asuman.Asu_Homepage;
import allovercommerce.pages.asuman.Asu_VendorDashboardPage;
import allovercommerce.pages.asuman.Asu_VendorSignInPage;
import allovercommerce.utilities.Driver;
import allovercommerce.utilities.JSUtils;
import allovercommerce.utilities.MediaUtils;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.AssertJUnit.assertTrue;

public class TC01_VendorSignIn_DashBoard {


    @Test
    public void VendorSignIn() throws IOException {

        Asu_VendorSignInPage asuVendorSignInPage=new Asu_VendorSignInPage();
        Asu_Homepage asuHomepage=new Asu_Homepage();

       //1. Go to  homepage	https://allovercommerce.com
        Driver.getDriver().get("https://allovercommerce.com/");

       //2. Click on "sign in" button
        Asu_Homepage.signInItem.click();
       //3. Enter  e-mail address     	ayazasuman@gmail.com
        Asu_Homepage.username.sendKeys("asudeyaz01@gmail.com");
       //4.  Enter password  	ofelya1863
        Asu_Homepage.password.sendKeys("Raskolnikov1895");
       //5. Click on "sign in" button
        Asu_Homepage.signInButton.click();

        Asu_VendorSignInPage.signOutButton.click();

        // 6. Verify that "My Account"  is visible on the new page
        assertTrue(Asu_VendorSignInPage.myAccountisVisible.isDisplayed());
        JSUtils.flashElement(Asu_VendorSignInPage.myAccountisVisible);

        MediaUtils.takeScreenshotOfTheEntirePage();
        Driver.getDriver().close();
    }
    }



