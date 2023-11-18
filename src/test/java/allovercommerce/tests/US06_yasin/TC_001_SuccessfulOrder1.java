package allovercommerce.tests.US06_yasin;

import allovercommerce.pages.yasin.yasinHomePage;
import allovercommerce.pages.yasin.yasinOrderPage;
import allovercommerce.pages.yasin.yasinProductPage;
import allovercommerce.pages.yasin.yasinSignPage;
import allovercommerce.utilities.Driver;
import allovercommerce.utilities.JSUtils;
import allovercommerce.utilities.MediaUtils;
import allovercommerce.utilities.WaitUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class TC_001_SuccessfulOrder1 {

        @Test
        public void TestCase01() throws IOException, IOException, InterruptedException {

            yasinHomePage yasinHomePage = new yasinHomePage();
            yasinProductPage yasinProductPage = new yasinProductPage();
            yasinSignPage yasinSignPage = new yasinSignPage();
            yasinOrderPage yasinOrderPage = new yasinOrderPage();

//        navigate to homepage
            Driver.getDriver().get("https://allovercommerce.com/");
            WaitUtils.waitFor(1);
//        search "iphone" in search box and click enter
            WebElement searchBox = yasinHomePage.searchBox;
            searchBox.sendKeys("iphone");
            searchBox.sendKeys(Keys.ENTER);
//        choose the product
            yasinHomePage.theProduct.click();
            WaitUtils.waitFor(3);

//      check that the number of products to be purchased can be increased or decreased

        JSUtils.JSclickWithTimeout(yasinProductPage.plusButton);
        Thread.sleep(2000);
        yasinProductPage.plusButton.click();
        yasinProductPage.plusButton.click();
        MediaUtils.takeScreenshotOfTheEntirePage();
        yasinProductPage.minusButton.click();
        MediaUtils.takeScreenshotOfTheEntirePage();
//        Click "Add to Cart"
            JSUtils.JSclickWithTimeout(yasinProductPage.addToCartButton);
            WaitUtils.waitFor(2);
//        ExtentReportUtils.createTestReport("addcartbutton","report");

//        Verify that the product is added the cart
            Assert.assertTrue(yasinProductPage.cartIcon.getText().contentEquals("2"));
            MediaUtils.takeScreenshotOfTheEntirePage();

//        Click to the cart icon on the page
            yasinProductPage.cartIcon.click();
//        Click to checkout button
            yasinProductPage.checkOutButton.click();
//        click sign in
            yasinProductPage.signInButton.click();
            WaitUtils.waitFor(2);
//        enter username and password
            yasinSignPage.userNameBox.sendKeys("yaseko");
            yasinSignPage.passWordBox.sendKeys("12345.");
//        click sign in
            yasinSignPage.singInAsUserButton.click();
            WaitUtils.waitFor(3);

//        Verify that the billing address on the page is accurate
            String expectedName = "asdsadasda";
            Assert.assertTrue(yasinOrderPage.billingFirstName.isDisplayed(), expectedName);
            WaitUtils.waitFor(1);
            //last name
            String expectedLastName = "sdffds";
            Assert.assertTrue(yasinOrderPage.billingLastName.isDisplayed(), expectedLastName);

            // country

            JSUtils.JSclickWithTimeout(yasinOrderPage.billingCountry);
            String expectedCountry = "United States (US)";
            Assert.assertTrue(yasinOrderPage.billingCountry.isDisplayed(), expectedCountry);


            String expectedMail = "ozturkyasin182@gmail.com";
            Assert.assertTrue(yasinOrderPage.billingEmail.isDisplayed(), expectedMail);
            WaitUtils.waitFor(1);
//        Check the payment options are on the page

            JSUtils.JSclickWithTimeout(yasinOrderPage.payAtTheDoor);
            Assert.assertTrue(yasinOrderPage.payAtTheDoor.isDisplayed());
            WaitUtils.waitFor(1);

//        Select a payment option
            JSUtils.JSclickWithTimeout(yasinOrderPage.wireTransfer);
            Assert.assertTrue(yasinOrderPage.wireTransfer.isDisplayed());
            WaitUtils.waitFor(1);

//        Click to place order button
            JSUtils.JSclickWithTimeout(yasinOrderPage.placeOrderButton);


//        Verify the message that your order has been succefully received
            String verifyText = "Thank you. Your order has been received.";
            Assert.assertTrue(yasinOrderPage.orderCompleteText.isDisplayed(), verifyText);

            //close the driver
            Driver.getDriver().close();


        }
}