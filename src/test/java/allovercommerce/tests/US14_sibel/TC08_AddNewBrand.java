package allovercommerce.tests.US14_sibel;

import allovercommerce.pages.sibel.*;
import allovercommerce.utilities.Driver;
import allovercommerce.utilities.ExtentReportUtils;
import allovercommerce.utilities.JSUtils;
import allovercommerce.utilities.WaitUtils;
import com.github.javafaker.Faker;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC08_AddNewBrand {

    MyAccount2LoginPage myAccount2DefaultPage = new MyAccount2LoginPage();
    StoreManagerHomePage storeManagerHomePage = new StoreManagerHomePage();
    AllProductsPage allProductsPage = new AllProductsPage();
    NewProductsPage newProductsPage = new NewProductsPage();
    MyAccountHomePage myAccountHomePage = new MyAccountHomePage();

// 1.navigate to https://allovercommerce.com/store-manager/products-manage/

    @BeforeTest
    public void signInToVendorAcc() {

        ExtentReportUtils.createTestReport("User sign-in Process to the Vendor Account"
                ,"User should sign in Vendor Account");
        ExtentReportUtils.info("TEST OBJECTIVE : NEW BRAND MUST BE ADDED");

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
    public void addNewBrandTest(){
// 2.Click on the add new brand link under the Brands
        ExtentReportUtils.createTestReport("Add New Brand Test"
                ,"User attempt to Add New Brand ");

        ExtentReportUtils.info("TEST OBJECTIVE : NEW BRAND MUST BE ADDED");

        JSUtils.JSclickWithTimeout(newProductsPage.addNewBrand);

// 3.Type the new Brand name you like to add (RandomBrandName)
        Faker faker = new Faker();
    String RandomBrandName = faker.company().name();
        JSUtils.JSsetValueBy(newProductsPage.newBrandName,RandomBrandName);
    ExtentReportUtils.pass("User Send New Brand Name with Faker Class");
        Select select = new Select(newProductsPage.parentTaxonomy);


        // 4.Select related parent taxonomy from the dropdown list (JAN CARLUCCI)

        select.selectByValue("980");


        // 5.Click add button

        JSUtils.JSclickWithTimeout(newProductsPage.addBrandButton);
        ExtentReportUtils.passAndCaptureScreenshot("New Brand Added and Selected");

        WaitUtils.waitFor(2);

        Assert.assertTrue(newProductsPage.newBrandCheckBox.isSelected());
        Driver.getDriver().close();
        ExtentReportUtils.pass("Driver Closed successfully");
        ExtentReportUtils.flush();

//        List<WebElement> allBrands = Driver.getDriver().findElements(By.xpath("//ul[@id='product_brand']"));
//
//        // 6.Check from the brand list if the new brand has been added succesfully
//        WaitUtils.waitFor(2);
//        int i=0;
//        for (WebElement eachBrand:allBrands){
//
//            for (i=0; i<allBrands.size(); i++); {
//
//                Assert.;
//
//            }

        }
    }

