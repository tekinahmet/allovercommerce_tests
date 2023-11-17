package allovercommerce.tests.US17_oguzhan;


import allovercommerce.pages.oguzhan.Oguzhan_LoginPage;
import allovercommerce.pages.oguzhan.Oguzhan_VendorAccountPage;
import allovercommerce.pages.oguzhan.Oguzhan_VendorBillingPage;
import allovercommerce.utilities.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class TC01 {

    Actions actions = new Actions(Driver.getDriver());
    @Test

    public void testCase01() throws InterruptedException, IOException {
        Oguzhan_LoginPage oguzhanLoginPage = new Oguzhan_LoginPage();
        Oguzhan_VendorAccountPage oguzhanVendorAccountPage = new Oguzhan_VendorAccountPage();
        Oguzhan_VendorBillingPage oguzhanVendorBillingPage = new Oguzhan_VendorBillingPage();

        LoggerUtils.info("Test Case 01 begins...");
        ExtentReportUtils.createTestReport("US17_TC03 Test Report", "Vendor should be able to buy product");
        ExtentReportUtils.pass("starting the testCase01");


        // 1. vendor navigates to https://allovercommerce.com/
        Driver.getDriver().get("https://allovercommerce.com/");
        MediaUtils.takeScreenshotOfTheEntirePage();
        // 2. vendor clicks on sign-in button
        oguzhanLoginPage.signIn.click();
        // 3. vendor enters username/e-mail address
        oguzhanLoginPage.userName.sendKeys("oguzhanguven_2020@outlook.com");
        MediaUtils.takeScreenshotOfTheEntirePage();
        // 4. vendor enters password
        oguzhanLoginPage.password.sendKeys("Out23_20*");
        MediaUtils.takeScreenshotOfTheEntirePage();
        // 5. vendor clicks sign in button
        oguzhanLoginPage.signInButton.click();
        // vendor verifies login is successful
        String verifyText1 ="Sign Out";
        Assert.assertTrue(oguzhanVendorAccountPage.signOutSign.isDisplayed(), verifyText1);
        // 6. vendor types product name on the search bar and enters
        Thread.sleep(2000);
        oguzhanVendorAccountPage.searchBar.sendKeys("nutella"+ Keys.ENTER);
        //vendor verifies the product
        oguzhanVendorAccountPage.product.getText().equalsIgnoreCase("nutella");
        //vendor verifies number of products to be purchased can be increased or decreased
        oguzhanVendorAccountPage.increaseButton.click();
        Thread.sleep(2000);
        //7. vendor adds the item into cart
        oguzhanVendorAccountPage.addToCart.click();
        Thread.sleep(1000);
        //8. vendor goes to cart by clicking cart icon
        oguzhanVendorAccountPage.cart.click();
        MediaUtils.takeScreenshotOfTheEntirePage();
        //9. vendor clicks checkout
        oguzhanVendorAccountPage.checkout.click();
        Thread.sleep(1000);
        MediaUtils.takeScreenshotOfTheEntirePage();
        //10. vendor enters firstname into billing details
        oguzhanVendorBillingPage.billingFirstName.clear();
        oguzhanVendorBillingPage.billingFirstName.sendKeys(ConfigReader.getProperty("oguzhan_US17_billingFirstName"));
        MediaUtils.takeScreenshotOfTheEntirePage();
        //11. vendor enters lastname into billing details
        oguzhanVendorBillingPage.billingLastName.clear();
        oguzhanVendorBillingPage.billingLastName.sendKeys(ConfigReader.getProperty("oguzhan_US17_billingLastName"));
        //12. vendor types company name into billing details
        oguzhanVendorBillingPage.companyName.clear();
        oguzhanVendorBillingPage.companyName.sendKeys(ConfigReader.getProperty("oguzhan_US17_companyName"));

        //13. vendor chooses country
        oguzhanVendorBillingPage.countryArrow.click();
        oguzhanVendorBillingPage.countrySearch.sendKeys(ConfigReader.getProperty("oguzhan_US17_country")+Keys.ENTER);
        // vendor types street address
        oguzhanVendorBillingPage.streetAddress.clear();
        oguzhanVendorBillingPage.streetAddress.sendKeys(ConfigReader.getProperty("oguzhan_US17_streetAddress"));
        //vendor types street address line 2
        oguzhanVendorBillingPage.StreetAddress2.clear();
        oguzhanVendorBillingPage.StreetAddress2.sendKeys(ConfigReader.getProperty("oguzhan_US17_streetAddress2"));
        //vendor types city/town info
        oguzhanVendorBillingPage.billingCity.clear();
        oguzhanVendorBillingPage.billingCity.sendKeys(ConfigReader.getProperty("oguzhan_US17_billingCity"));
        //Vendor Chooses state
        Select select1 = new Select(oguzhanVendorBillingPage.state);
        select1.selectByVisibleText("Wyoming");
        //vendor types ZIP CODE
        oguzhanVendorBillingPage.ZipCode.clear();
        oguzhanVendorBillingPage.ZipCode.sendKeys(ConfigReader.getProperty("oguzhan_US17_zipCode"));
        // Vendor types phone number
        oguzhanVendorBillingPage.phoneNumber.clear();
        oguzhanVendorBillingPage.phoneNumber.sendKeys(ConfigReader.getProperty("oguzhan_US7_phoneNumber"));
        //Vendor types e-mail address
        oguzhanVendorBillingPage.emailAddress.clear();
        oguzhanVendorBillingPage.emailAddress.sendKeys(ConfigReader.getProperty("oguzhan_US17_emailAddress"));
        // vendor types order notes
        oguzhanVendorBillingPage.orderNote.clear();
        oguzhanVendorBillingPage.orderNote.sendKeys("fragile");
        WaitUtils.waitFor(1);
        MediaUtils.takeScreenshotOfTheEntirePage();
       // actions.sendKeys(Keys.PAGE_UP).perform();  // optional
        // vendor chooses payment method  !!!
        // vendor clicks wireTransfer method
        JSUtils.JSclickWithTimeout(oguzhanVendorBillingPage.wireTransfer);
        WaitUtils.waitFor(2);
        Assert.assertTrue(oguzhanVendorBillingPage.wireTransfer.isDisplayed());
        // vendor clicks pay at the door
        JSUtils.JSclickWithTimeout(oguzhanVendorBillingPage.payAtTheDoor);
        WaitUtils.waitFor(2);
        Assert.assertTrue(oguzhanVendorBillingPage.payAtTheDoor.isDisplayed());
        //Vendor verifies total amount is visible
         String verifyText3 ="Total";
        Assert.assertTrue(oguzhanVendorBillingPage.totalAmount.isDisplayed(), verifyText3);

        // vendor clicks on Place Order button
        WaitUtils.waitFor(2);
        JSUtils.JSclickWithTimeout(oguzhanVendorBillingPage.placeOrder);
        WaitUtils.waitFor(3);
        //vendor verifies shopping is completed
        String verifyText2 ="Thank you. Your order has been received.";
        Assert.assertTrue(oguzhanVendorBillingPage.orderCompleteText.isDisplayed(), verifyText2);
        //vendor clicks  "My Account - My Orders"
        JSUtils.JSclickWithTimeout(oguzhanVendorBillingPage.shoppingDetails);
        //vendor clicks view
        oguzhanVendorBillingPage.viewOrder.click();
        // vendor sees order details
        Assert.assertTrue(oguzhanVendorBillingPage.orderDetails.getText().contains("ORDER DETAILS"));
      //  actions.sendKeys(Keys.PAGE_DOWN).perform();  // optional
        WaitUtils.waitFor(1);
        MediaUtils.takeScreenshotOfTheEntirePage();

        ExtentReportUtils.passAndCaptureScreenshot("ORDER DETAILS");

        //vendor closes driver
        Driver.closeDriver();

        ExtentReportUtils.pass("Driver is closed...Test case passed successfully...");

        ExtentReportUtils.flush();

        LoggerUtils.info("Test completed...");


    }


}