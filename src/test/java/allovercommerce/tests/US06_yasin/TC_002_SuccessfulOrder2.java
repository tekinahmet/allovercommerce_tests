package allovercommerce.tests.US06_yasin;

import allovercommerce.pages.yasin.yasinHomePage;
import allovercommerce.pages.yasin.yasinOrderPage;
import allovercommerce.pages.yasin.yasinProductPage;
import allovercommerce.pages.yasin.yasinSignPage;
import allovercommerce.utilities.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class TC_002_SuccessfulOrder2 {

    @Test
    public void TestCase002() throws IOException {

        yasinHomePage yasinHomePage = new yasinHomePage();
        yasinProductPage yasinProductPage = new yasinProductPage();
        yasinSignPage yasinSignPage= new yasinSignPage();
        yasinOrderPage yasinOrderPage= new yasinOrderPage();

//      navigate to homepage
        Driver.getDriver().get("https://allovercommerce.com/");
        WaitUtils.waitFor(1);
//      search "iphone" in search box and click enter
        WebElement searchBox = yasinHomePage.searchBox;
        searchBox.sendKeys("iphone");
        searchBox.sendKeys(Keys.ENTER);
//      choose the product
        yasinHomePage.theProduct.click();
        WaitUtils.waitFor(2);


//      Click "Add to Cart"
        JSUtils.JSclickWithTimeout(yasinProductPage.addToCartButton);
        WaitUtils.waitFor(2);

 //      Click to the cart icon on the page
        yasinProductPage.cartIcon.click();
//      Click to checkout button
        yasinProductPage.viewCartButton.click();
//      Click to proceed to checkout button
//      check that the number of products to be purchased can be increased or decreased
        yasinProductPage.plusButton.click();
        WaitUtils.waitFor(1);
        MediaUtils.takeScreenshotOfTheEntirePage();

        //click update to cart button
        yasinProductPage.updateCartButton.click();
        WaitUtils.waitFor(3);

//      Verify that the product is added the cart
        Assert.assertTrue(yasinProductPage.cartIcon.getText().contentEquals("2"));
       WaitUtils.waitFor(3);
//        ExtentReportUtils.createTestReport("verify report","....");

//      click proceed to checkout button
        JSUtils.JSclickWithTimeout(yasinProductPage.proceedToCheckOutButton);
//      click sign in
        yasinProductPage.signInButton.click();
        WaitUtils.waitFor(2);
//      enter username and password
        yasinSignPage.userNameBox.sendKeys("yaseko");
        yasinSignPage.passWordBox.sendKeys("12345.");
//      click sign in
        yasinSignPage.singInAsUserButton.click();
        WaitUtils.waitFor(2);
//      Verify that the billing address on the page is accurate
        String expectedName ="asdsadasda";
        Assert.assertTrue(yasinOrderPage.billingFirstName.isDisplayed(), expectedName);
        WaitUtils.waitFor(1);
//      Last name
        String expectedLastName ="sdffds";
        Assert.assertTrue(yasinOrderPage.billingLastName.isDisplayed(), expectedLastName);
//      Country
        JSUtils.JSclickWithTimeout(yasinOrderPage.billingCountry);
        String expectedCountry ="United States (US)";
        Assert.assertTrue(yasinOrderPage.billingCountry.isDisplayed(), expectedCountry);

//        Street
        JSUtils.JSclickWithTimeout(yasinOrderPage.billingStreet);
        String expectedStreet ="1244 st ttat";
        Assert.assertTrue(yasinOrderPage.billingCountry.isDisplayed(), expectedStreet);

//      verify Email
        String expectedMail ="ozturkyasin182@gmail.com";
        Assert.assertTrue(yasinOrderPage.billingEmail.isDisplayed(), expectedMail);
        WaitUtils.waitFor(1);
//      Check the payment options are on the page
        JSUtils.JSclickWithTimeout(yasinOrderPage.payAtTheDoor);
        Assert.assertTrue(yasinOrderPage.payAtTheDoor.isDisplayed());
        WaitUtils.waitFor(1);

//      Select a payment option
        JSUtils.JSclickWithTimeout(yasinOrderPage.wireTransfer);
        Assert.assertTrue(yasinOrderPage.wireTransfer.isDisplayed());
        WaitUtils.waitFor(1);

//      Click to place order button
        JSUtils.JSclickWithTimeout(yasinOrderPage.placeOrderButton);

//      Verify the message that your order has been succesfully received
        String verifyText ="Thank you. Your order has been received.";
        Assert.assertTrue(yasinOrderPage.orderCompleteText.isDisplayed(), verifyText);
        MediaUtils.takeScreenshotOfTheEntirePage();

//      Close the driver
        Driver.getDriver().close();


    }
}
