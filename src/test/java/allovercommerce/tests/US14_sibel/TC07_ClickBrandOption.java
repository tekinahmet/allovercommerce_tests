package allovercommerce.tests.US14_sibel;

import allovercommerce.pages.sibel.*;
import allovercommerce.utilities.Driver;
import allovercommerce.utilities.ExtentReportUtils;
import allovercommerce.utilities.JSUtils;
import allovercommerce.utilities.WaitUtils;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC07_ClickBrandOption {

    MyAccount2LoginPage myAccount2DefaultPage = new MyAccount2LoginPage();
    StoreManagerHomePage storeManagerHomePage = new StoreManagerHomePage();
    AllProductsPage allProductsPage = new AllProductsPage();
    NewProductsPage newProductsPage = new NewProductsPage();
    MyAccountHomePage myAccountHomePage = new MyAccountHomePage();

//            1.navigate to https://allovercommerce.com/store-manager/products-manage/

    @BeforeTest
    public void signInToVendorAcc() {

        ExtentReportUtils.createTestReport("User sign-in Process to the Vendor Account"
                ,"User should sign in Vendor Account");
        ExtentReportUtils.info("TEST OBJECTIVE : PRODUCTS BRANDS OPTIONS MUST EXIST AND CLICKABLE");

        Driver.getDriver().get("https://allovercommerce.com/my-account-2/");
        ExtentReportUtils.pass("User navigates to the my-Account-2 page for sign-in process");
        myAccount2DefaultPage.username.sendKeys("sibeltechpro@gmail.com");
        WaitUtils.waitFor(1);
        myAccount2DefaultPage.password.sendKeys("vendortest1");
        WaitUtils.waitFor(1);
        JSUtils.JSclickWithTimeout(myAccount2DefaultPage.signInButton);
        ExtentReportUtils.passAndCaptureScreenshot("User signed in successfully");
        JSUtils.JSclickWithTimeout(myAccountHomePage.toStoreManagerPage);
        ExtentReportUtils.pass("User navigate to Store Manager Page");
        JSUtils.JSclickWithTimeout(storeManagerHomePage.productLink);
        ExtentReportUtils.pass("User navigates to the Products Page");
        JSUtils.JSclickWithTimeout(allProductsPage.newProductButton);
        ExtentReportUtils.pass("User click on the Add new Product Button");
    }
    @Test
    public void selectProductBrand(){
        ExtentReportUtils.createTestReport("SELECT PRODUCT BRAND"
                ,"User should be able to see and Click Product Brands From the Brand List");
        ExtentReportUtils.info("TEST OBJECTIVE : PRODUCTS BRANDS OPTIONS MUST EXIST AND CLICKABLE");


//     2.Select a product related Brand from the right side--- ACK category located and selected
        ExtentReportUtils.info("ACK brand located and Selected");
        if(!newProductsPage.brandAckCheckbox.isSelected()) {
            JSUtils.JSclickWithTimeout(newProductsPage.brandAckCheckbox);
        }
        ExtentReportUtils.passAndCaptureScreenshot("User Click on the Brand ACK from the List");
        //    3.Check if Categories can be selected

        Assert.assertTrue(newProductsPage.brandAckCheckbox.isSelected());
        ExtentReportUtils.passAndCaptureScreenshot("ACK brand Selection Asserted");
        Driver.getDriver().close();
        ExtentReportUtils.pass("Driver Closed successfully");
        ExtentReportUtils.flush();
    }

}
