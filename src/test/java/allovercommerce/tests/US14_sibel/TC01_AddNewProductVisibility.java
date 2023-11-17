package allovercommerce.tests.US14_sibel;

import allovercommerce.pages.sibel.*;
import allovercommerce.utilities.Driver;
import allovercommerce.utilities.ExtentReportUtils;
import allovercommerce.utilities.JSUtils;
import allovercommerce.utilities.WaitUtils;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC01_AddNewProductVisibility {
    MyAccount2LoginPage myAccount2DefaultPage = new MyAccount2LoginPage();
    StoreManagerHomePage storeManagerHomePage = new StoreManagerHomePage();
    AllProductsPage allProductsPage = new AllProductsPage();
    NewProductsPage newProductsPage = new NewProductsPage();
    MyAccountHomePage myAccountHomePage = new MyAccountHomePage();


    @BeforeTest
    public void signInToVendorAcc() {
        ExtentReportUtils.createTestReport("User sign-in Process to the Vendor Account"
                , "User should sign in Vendor Account");
        ExtentReportUtils.info("TEST OBJECTIVE :USER SHOULD BE ABLE TO SEE NEW PRODUCT BUTTON");

        Driver.getDriver().get("https://allovercommerce.com/my-account-2/");
        ExtentReportUtils.pass("User navigates to the my-Account-2 page for sign-in process");
        myAccount2DefaultPage.username.sendKeys("sibeltechpro@gmail.com");
        WaitUtils.waitFor(1);
        myAccount2DefaultPage.password.sendKeys("vendortest1");
        WaitUtils.waitFor(1);
        JSUtils.JSclickWithTimeout(myAccount2DefaultPage.signInButton);
        WaitUtils.waitFor(1);
        ExtentReportUtils.passAndCaptureScreenshot("User signed in successfully");
        JSUtils.JSclickWithTimeout(myAccountHomePage.toStoreManagerPage);
        ExtentReportUtils.pass("User navigate to Store Manager Page");
        JSUtils.JSclickWithTimeout(storeManagerHomePage.productLink);
        ExtentReportUtils.pass("User navigates to the Products Page");

    }
        @Test
        public void testCase01() {
        ExtentReportUtils.createTestReport("Add New Product Visibility"
                ,"User Should See Add New Product Button/Link on the New Product Page");

            Assert.assertTrue(allProductsPage.newProductButton.isDisplayed());
            ExtentReportUtils.passAndCaptureScreenshot("Add New Product Button/Link Appeared Successfully");

            Driver.getDriver().close();
            ExtentReportUtils.flush();

        }

    }








