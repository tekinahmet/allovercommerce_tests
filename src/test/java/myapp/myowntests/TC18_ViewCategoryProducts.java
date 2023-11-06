package myapp.myowntests;

import myapp.pages.AutomationExerciseHomePage;
import myapp.pages.AutomationExerciseProductsPage;
import myapp.utilities.Driver;
import myapp.utilities.ExtentReportUtils;
import myapp.utilities.LoggerUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC18_ViewCategoryProducts {
    @Test
    public void test(){
        LoggerUtils.info("Test case begins .. ");
        ExtentReportUtils.createTestReport("ViewCategoryProducts", "verify the steps");
        ExtentReportUtils.pass("Starting the admin login test...");
//        1. Launch browser
//        2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get("http://automationexercise.com");

//        3. Verify that categories are visible on left side bar
        AutomationExerciseHomePage automationExerciseHomePage= new AutomationExerciseHomePage();
        String categoryText = automationExerciseHomePage.category.getText();
        System.out.println("categoryText = " + categoryText);
        Assert.assertTrue(categoryText.contains("CATEGORY"));

        ExtentReportUtils.pass("verified that it contains CATEGORY word");

//        4. Click on 'Women' category
        automationExerciseHomePage.womenCategory.click();

//        5. Click on any category link under 'Women' category, for example: Dress
        automationExerciseHomePage.dress.click();

//        6. Verify that category page is displayed and confirm text 'WOMEN - TOPS PRODUCTS'
        String productVisibility = automationExerciseHomePage.dress.getText();
        System.out.println("productVisibility = " + productVisibility);
        automationExerciseHomePage.dress.isDisplayed();

        ExtentReportUtils.info("verified that the product name is visible");

//        7. On left side bar, click on any sub-category link of 'Men' category
        AutomationExerciseProductsPage automationExerciseProductsPage = new AutomationExerciseProductsPage();
        Driver.getDriver().navigate().refresh();
        automationExerciseProductsPage.menCategory.click();
        automationExerciseProductsPage.menSubCategory.click();

//        8. Verify that user is navigated to that category page
        String menCategoryTitle = automationExerciseProductsPage.menProductTitle.getText();
        System.out.println("menProductTitle = " + menCategoryTitle);
        automationExerciseProductsPage.menProductTitle.isDisplayed();
        ExtentReportUtils.pass("verified that men's products' name is displayed");

        Driver.getDriver().close();

        ExtentReportUtils.pass("Driver is closed.... Test is completed successfully...");
        ExtentReportUtils.flush();
        LoggerUtils.info("Test completed...");
    }
}
