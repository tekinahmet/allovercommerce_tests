package allovercommerce.tests.US14_sibel;

import allovercommerce.pages.sibel.*;
import allovercommerce.utilities.Driver;
import allovercommerce.utilities.ExtentReportUtils;
import allovercommerce.utilities.JSUtils;
import allovercommerce.utilities.WaitUtils;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC05_ClickProductCategory {

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
        ExtentReportUtils.info("TEST OBJECTIVE : CATEGORIES CAN BE ABLE TO SELECTED");

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
    public void selectProductCategory(){
        ExtentReportUtils.createTestReport("SELECT PRODUCT CATEGORY TEST"
                ,"User can be able to select a Category from Category list checkbox");

//     2.Select a product related category from the right side--- Banana category located and selected
    ExtentReportUtils.info("User Select Banana Category CheckBox");
        if(!newProductsPage.bananaCheckbox.isSelected()) {
            JSUtils.JSclickWithTimeout(newProductsPage.bananaCheckbox);
            ExtentReportUtils.passAndCaptureScreenshot("User asserted Banana Category Checkbox is selected Successfully ");
        }

        //    3.Check if Categories can be selected

            Assert.assertTrue(newProductsPage.bananaCheckbox.isSelected());


            Driver.getDriver().close();
            ExtentReportUtils.flush();

    }
}
