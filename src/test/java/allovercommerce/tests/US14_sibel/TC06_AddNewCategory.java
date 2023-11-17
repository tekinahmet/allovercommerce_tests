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

public class TC06_AddNewCategory {

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
        ExtentReportUtils.info("TEST OBJECTIVE : NEW CATEGORIES MUST BE ADDED");

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
    public void addNewCategoryTest(){
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

        Driver.getDriver().close();
        ExtentReportUtils.flush();
    }
}
// List<WebElement> allCats = Driver.getDriver().findElements(By.xpath("product_cats_checklist"));
// 6.Check from the category list if the new category has been added succesfully
//
//        int i=0;
//       for (WebElement each:allCats){
//
//           for (i=0; i<allCats.size(); i++); {
//               Assert.assertTrue(each.getText().contains("Morning Suit"));
//           }
//       }