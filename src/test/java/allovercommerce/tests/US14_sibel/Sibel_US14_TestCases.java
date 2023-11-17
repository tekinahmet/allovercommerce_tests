package allovercommerce.tests.US14_sibel;

import allovercommerce.pages.sibel.*;
import allovercommerce.utilities.*;
import com.github.javafaker.Faker;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Sibel_US14_TestCases {
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
        ExtentReportUtils.pass("User navigates to the Products Page");
        JSUtils.JSclickWithTimeout(allProductsPage.newProductButton);
        ExtentReportUtils.pass("User click on the Add new Product Button");
    }
    @Test
    public void testC1AddNewProductVisibility() {
        ExtentReportUtils.createTestReport("Add New Product Visibility"
                ,"User Should See Add New Product Button/Link on the New Product Page");

        Assert.assertTrue(allProductsPage.newProductButton.isDisplayed());
        ExtentReportUtils.passAndCaptureScreenshot("Add New Product Button/Link Appeared Successfully");
    }
    @Test
    public void testC2ChooseFromProductTypes1() {
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
    public void testC2ChooseFromProductTypes2() {

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
    public void testC2ChooseFromProductTypes3() {
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
    public void testC2ChooseFromProductTypes4() {
        ExtentReportUtils.createTestReport("Choose Product Types : EXTERNAL/AFFILIATED"
                ,"User should see and Choose Product Type as EXTERNAL/AFFILIATED");
        ExtentReportUtils.info("TEST OBJECTIVE : USER SHOULD CHOOSE DIFFERENT PRODUCT TYPES");

        allProductsPage.newProductButton.click();
        Select select = new Select(newProductsPage.product_type);
        select.selectByValue("external");
        Assert.assertTrue(newProductsPage.product_type.getText().contains("External"));
        ExtentReportUtils.passAndCaptureScreenshot("User Choose External/Affiliated Product Successfully");

    }
    @Test
    public void testC3addProductImage(){
        ExtentReportUtils.createTestReport("UPLOAD PRODUCT IMAGE TEST"
                ,"User will upload a product page");
        ExtentReportUtils.info("TEST OBJECTIVE : USER SHOULD BE ABLE TO UPLOAD A PRODUCT PICTURE");
        String pathOfPicture = System.getProperty("./resources/IMG_5477.jpg");
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


    }
    @Test
    public void testC4ProductATitle(){
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
    public void testC4ProductDescriptionTest(){
        ExtentReportUtils.createTestReport("PRODUCT DESCRIPTION TYPE"
                ,"User should be able to type Product Description");
        ExtentReportUtils.info("TEST OBJECTIVE : PRODUCT DESCRIPTION TYPING TEST");


        Driver.getDriver().switchTo().frame("excerpt_ifr");
        newProductsPage.productDescription.sendKeys("Printable A4 suitable coloring " +
                "plane,suitable for all printer types");
        ExtentReportUtils.passAndCaptureScreenshot("Description typed successfully");
        Assert.assertTrue(newProductsPage.productDescription.getText().contains("Printable A4"));

        Driver.getDriver().switchTo().defaultContent();

        ExtentReportUtils.pass("Switch to frame annotation used and Description Succesfully typed and Asserted");

    }
    @Test
    public void testC5SelectProductCategory(){
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

    }
    @Test
    public void testC6addNewCategoryTest(){
        ExtentReportUtils.createTestReport("ADD NEW CATEGORY TEST","USER SHOULD ADD NEW CATEGORY");
        ExtentReportUtils.info("TEST OBJECTIVE : NEW CATEGORIES MUST BE ADDED");

// 2.Click on the add new category link under the categories

        JSUtils.JSclickWithTimeout(newProductsPage.addNewCategory);
        ExtentReportUtils.pass("User Click on the add New Category Link");

// 3.Type the Category name you like to add
        Faker faker = new Faker();
        String RandomCatName = faker.company().name();
        JSUtils.JSsetValueBy(newProductsPage.categoryNameAdd,RandomCatName);

        ExtentReportUtils.pass("User send the Category Name with Faker Class");
        Select select = new Select(newProductsPage.selectParentCategory);

// 4.Select related parent category from the dropdown list (Uncategorized)

        select.selectByValue("15");
        ExtentReportUtils.pass("User Choose Parent Category as Uncategorized");

// 5.Click add button

        JSUtils.JSclickWithTimeout(newProductsPage.addCategoryButton);
        WaitUtils.waitFor(1);
        ExtentReportUtils.passAndCaptureScreenshot("User Click on the ADD button successfully");

        Assert.assertTrue(newProductsPage.newCatCheckbox.isSelected());


        ExtentReportUtils.passAndCaptureScreenshot("User Assert if the new category in the list");

    }
    @Test
    public void testC7SelectProductBrand(){
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

    }
    @Test
    public void testC8AddNewBrandTest() {
// 2.Click on the add new brand link under the Brands
        ExtentReportUtils.createTestReport("Add New Brand Test"
                , "User attempt to Add New Brand ");

        ExtentReportUtils.info("TEST OBJECTIVE : NEW BRAND MUST BE ADDED");

        JSUtils.JSclickWithTimeout(newProductsPage.addNewBrand);

// 3.Type the new Brand name you like to add (RandomBrandName)
        Faker faker = new Faker();
        String RandomBrandName = faker.company().name();
        JSUtils.JSsetValueBy(newProductsPage.newBrandName, RandomBrandName);
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
       ExtentReportUtils.pass("Driver Closed Successfully");
       ExtentReportUtils.flush();
    }
}








