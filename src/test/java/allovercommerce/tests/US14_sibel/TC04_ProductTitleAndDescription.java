package allovercommerce.tests.US14_sibel;
import allovercommerce.pages.sibel.*;
import allovercommerce.utilities.Driver;
import allovercommerce.utilities.ExtentReportUtils;
import allovercommerce.utilities.JSUtils;
import allovercommerce.utilities.WaitUtils;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TC04_ProductTitleAndDescription {


    MyAccount2LoginPage myAccount2DefaultPage = new MyAccount2LoginPage();
    StoreManagerHomePage storeManagerHomePage = new StoreManagerHomePage();
    AllProductsPage allProductsPage = new AllProductsPage();
    NewProductsPage newProductsPage = new NewProductsPage();
    MyAccountHomePage myAccountHomePage = new MyAccountHomePage();



    @BeforeTest
    public void signInToVendorAcc() {
        ExtentReportUtils.createTestReport("User sign-in Process to the Vendor Account"
                ,"User should sign in Vendor Account");
        ExtentReportUtils.info("TEST OBJECTIVE : TYPING PRODUCT INFORMATION");

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
    public void productATitle(){
        ExtentReportUtils.createTestReport("PRODUCT TITLE TYPE"
                ,"User should be able to type Product title");
        ExtentReportUtils.info("TEST OBJECTIVE : PRODUCT TITLE TYPING TEST");
        // newProductsPage.productTitle.sendKeys("Printable Colouring Plane Picture");
        JSUtils.JSscrollIntoView(newProductsPage.productTitle);
        JSUtils.JSsetValueBy(newProductsPage.productTitle,"Printable Plane Colouring");
        ExtentReportUtils.info("User Send title as a **Printable Plane Colouring");
        ExtentReportUtils.pass("User type the title successfully");
        ExtentReportUtils.passAndCaptureScreenshot("Title appears");
        String valueOfTitle = JSUtils.JSgetValueBy("pro_title");
        WaitUtils.waitFor(2);
        System.out.println(valueOfTitle);

        Assert.assertTrue(valueOfTitle.contains("Plane"));
        ExtentReportUtils.pass("Asserted successfully title typed on the correct place");

    }

    @Test
    public void productDescriptionTest(){
        ExtentReportUtils.createTestReport("PRODUCT DESCRIPTION TYPE"
                ,"User should be able to type Product Description");
        ExtentReportUtils.info("TEST OBJECTIVE : PRODUCT DESCRIPTION TYPING TEST");


            Driver.getDriver().switchTo().frame("excerpt_ifr");
            newProductsPage.productDescription.sendKeys("Printable A4 suitable coloring " +
                    "plane,suitable for all printer types");
            ExtentReportUtils.passAndCaptureScreenshot("Description typed successfully");
            Assert.assertTrue(newProductsPage.productDescription.getText().contains("Printable A4"));

            ExtentReportUtils.pass("Switch to frame annotation used and Description Succesfully typed and Asserted");

            Driver.getDriver().close();
            ExtentReportUtils.flush();

        }
    }

