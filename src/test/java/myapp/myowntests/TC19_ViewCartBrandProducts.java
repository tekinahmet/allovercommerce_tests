package myapp.myowntests;

import myapp.pages.AutomationExerciseHomePage;
import myapp.pages.AutomationExerciseProductsPage;
import myapp.utilities.Driver;
import myapp.utilities.ExtentReportUtils;
import myapp.utilities.LoggerUtils;
import myapp.utilities.MediaUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertTrue;

public class TC19_ViewCartBrandProducts {
    @Test
    public void test() throws IOException {
        LoggerUtils.info("Test case begins .. ");
        ExtentReportUtils.createTestReport("ViewCategoryProducts", "verify the steps");
        ExtentReportUtils.pass("Starting the admin login test...");
//        1. Launch browser
//        2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get("http://automationexercise.com");
        //Driver.getDriver().navigate().refresh();

        MediaUtils.takeScreenshotOfTheEntirePage();

//        3. Click on 'Products' button
        AutomationExerciseHomePage automationExerciseHomePage = new AutomationExerciseHomePage();
        automationExerciseHomePage.products.click();

        MediaUtils.takeScreenshotOfThisElement(automationExerciseHomePage.products);

//        4. Verify that Brands are visible on left side bar
        AutomationExerciseProductsPage automationExerciseProductsPage = new AutomationExerciseProductsPage();
        assertTrue(automationExerciseProductsPage.brands.isDisplayed());
        Driver.getDriver().navigate().refresh();
        ExtentReportUtils.pass("verification is done");

        MediaUtils.takeScreenshotOfTheEntirePageAsString();

//        5. Click on any brand name
        automationExerciseProductsPage.clickAnyProduct.click();
//        Driver.getDriver().navigate().refresh();
//        automationExerciseProductsPage.clickAnyProduct.click();
        ExtentReportUtils.info("H&M product clicked");


//        6. Verify that user is navigated to brand page and brand products are displayed
        assertTrue(automationExerciseProductsPage.verifyBrand.isDisplayed());
        LoggerUtils.info("brand name is displayed");
        MediaUtils.takeScreenshotOfTheEntirePage();

//        7. On left side bar, click on any other brand link
        automationExerciseProductsPage.anotherBrand.click();
        MediaUtils.takeScreenshotOfThisElement(automationExerciseProductsPage.anotherBrand);

//        8. Verify that user is navigated to that brand page and can see products
        assertTrue(automationExerciseProductsPage.verifyBabyHug.isDisplayed());
        MediaUtils.takeScreenshotOfTheEntirePage();

        Driver.getDriver().close();

        ExtentReportUtils.pass("Driver is closed.... Test is completed successfully...");
        ExtentReportUtils.flush();
        LoggerUtils.info("Test completed...");
    }
}
