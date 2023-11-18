package allovercommerce.tests.US14_sibel;

import allovercommerce.pages.sibel.*;
import allovercommerce.utilities.*;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC03_UploadProductImage {
    MyAccount2LoginPage myAccount2DefaultPage = new MyAccount2LoginPage();
    StoreManagerHomePage storeManagerHomePage = new StoreManagerHomePage();
    AllProductsPage allProductsPage = new AllProductsPage();
    NewProductsPage newProductsPage = new NewProductsPage();
    MyAccountHomePage myAccountHomePage = new MyAccountHomePage();


    @BeforeTest
    public void signInToVendorAcc() {
        ExtentReportUtils.createTestReport("User sign-in Process to the Vendor Account"
                ,"User should sign in Vendor Account");
        ExtentReportUtils.info("TEST OBJECTIVE : USER SHOULD BE ABLE TO UPLOAD A PRODUCT PICTURE");

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

//    @Test
//    public void addProductImage() throws InterruptedException {
//
//        allProductsPage.newProductButton.click();
//
//        JSUtils.JSclickWithTimeout(newProductsPage.addMedia);
//        WaitUtils.waitFor(2);
//        newProductsPage.selectFiles.click();


    @Test
    public void addProductImage(){
        ExtentReportUtils.createTestReport("UPLOAD PRODUCT IMAGE TEST"
                ,"User will upload a product page");
        ExtentReportUtils.info("TEST OBJECTIVE : USER SHOULD BE ABLE TO UPLOAD A PRODUCT PICTURE");
        String pathOfPicture = System.getProperty("./resources/IMG_5478.jpg");
//https://drive.google.com/file/d/13GkVKcr-7vgopBb5fJTXpRzDyF8xkHW7/view?usp=sharing

        JSUtils.JSclickWithTimeout(newProductsPage.addMedia);
        WaitUtils.waitFor(1);
        newProductsPage.selectFiles.click();
        WaitUtils.waitFor(1);
        ReusableMethods.uploadFile(pathOfPicture);
        ExtentReportUtils.passAndCaptureScreenshot("Last Screen shown");
        // Set the file path in the file input element
       // newProductsPage.selectFiles.sendKeys(pathOfPicture);
      //  newProductsPage.selectFiles.sendKeys(new File(pathOfPicture).getAbsolutePath());
        WaitUtils.waitFor(2);

        Driver.getDriver().close();
        ExtentReportUtils.flush();

    }
}