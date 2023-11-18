package allovercommerce.tests.US14_sibel;

import allovercommerce.pages.sibel.*;
import allovercommerce.utilities.Driver;
import allovercommerce.utilities.ExtentReportUtils;
import allovercommerce.utilities.JSUtils;
import allovercommerce.utilities.WaitUtils;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC02_ChooseProductTypes {

    MyAccount2LoginPage myAccount2DefaultPage = new MyAccount2LoginPage();
    StoreManagerHomePage storeManagerHomePage = new StoreManagerHomePage();
    AllProductsPage allProductsPage = new AllProductsPage();
    NewProductsPage newProductsPage = new NewProductsPage();
    MyAccountHomePage myAccountHomePage = new MyAccountHomePage();

    @BeforeTest
    public void signInToVendorAcc() {
        ExtentReportUtils.createTestReport("User sign-in Process to the Vendor Accoun"
                ,"User should sign in Vendor Account");
        ExtentReportUtils.info("TEST OBJECTIVE : User Should See and Choose Product Types");

        Driver.getDriver().get("https://allovercommerce.com/my-account-2/");

        if(myAccount2DefaultPage.username.isDisplayed()) {
            myAccount2DefaultPage.username.sendKeys("sibeltechpro@gmail.com");
            WaitUtils.waitFor(1);
            myAccount2DefaultPage.password.sendKeys("vendortest1");
            WaitUtils.waitFor(1);
            JSUtils.JSclickWithTimeout(myAccount2DefaultPage.signInButton);
            WaitUtils.waitFor(1);
            ExtentReportUtils.pass("User Signed in Successfully to the Vendor Account");

        }
        JSUtils.JSclickWithTimeout(myAccountHomePage.toStoreManagerPage);
        JSUtils.JSclickWithTimeout(storeManagerHomePage.productLink);

    }

    @Test
    public void chooseFromProductTypes1() {
        ExtentReportUtils.createTestReport("Choose Product Types : Simple"
                ,"User should see and Choose Product Type as Simple");
        ExtentReportUtils.info("TEST OBJECTIVE : USER SHOULD CHOOSE DIFFERENT PRODUCT TYPES");

        JSUtils.JSclickWithTimeout(allProductsPage.newProductButton);

        Select select = new Select(newProductsPage.product_type);
        select.selectByValue("simple");
        Assert.assertTrue(newProductsPage.product_type.getText().contains("Simple Product"));
        ExtentReportUtils.passAndCaptureScreenshot("User Choose Simple Product Successfully");


    }

    @Test
    public void chooseFromProductTypes2() {

        ExtentReportUtils.createTestReport("Choose Product Types : VARIABLE"
                ,"User should see and Choose Product Type as VARIABLE");
        ExtentReportUtils.info("TEST OBJECTIVE : USER SHOULD CHOOSE DIFFERENT PRODUCT TYPES");


        allProductsPage.newProductButton.click();
        Select select = new Select(newProductsPage.product_type);
        select.selectByValue("variable");
        Assert.assertTrue(newProductsPage.product_type.getText().contains("Variable Product"));
        ExtentReportUtils.passAndCaptureScreenshot("User Choose Variable Product Successfully");

    }

    @Test
    public void chooseFromProductTypes3() {
        ExtentReportUtils.createTestReport("Choose Product Types : GROUPED"
                ,"User should see and Choose Product Type as GROUPED");
        ExtentReportUtils.info("TEST OBJECTIVE : USER SHOULD CHOOSE DIFFERENT PRODUCT TYPES");

        allProductsPage.newProductButton.click();
        Select select = new Select(newProductsPage.product_type);
        select.selectByValue("grouped");
        Assert.assertTrue(newProductsPage.product_type.getText().contains("Grouped Product"));
        ExtentReportUtils.passAndCaptureScreenshot("User Choose Grouped Product Successfully");

    }

    @Test
    public void chooseFromProductTypes4() {
        ExtentReportUtils.createTestReport("Choose Product Types : EXTERNAL/AFFILIATED"
                ,"User should see and Choose Product Type as EXTERNAL/AFFILIATED");
        ExtentReportUtils.info("TEST OBJECTIVE : USER SHOULD CHOOSE DIFFERENT PRODUCT TYPES");

        allProductsPage.newProductButton.click();
        Select select = new Select(newProductsPage.product_type);
        select.selectByValue("external");
        Assert.assertTrue(newProductsPage.product_type.getText().contains("External"));
        ExtentReportUtils.passAndCaptureScreenshot("User Choose External/Affiliated Product Successfully");
        Driver.getDriver().close();
        ExtentReportUtils.flush();
    }

}

