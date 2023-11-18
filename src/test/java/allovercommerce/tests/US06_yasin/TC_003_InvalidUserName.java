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

public class TC_003_InvalidUserName {

        @Test
        public void TC003() throws IOException {


            yasinHomePage yasinHomePage =new yasinHomePage();
            yasinProductPage yasinProductPage = new yasinProductPage();
            yasinSignPage yasinSignPage = new yasinSignPage();
            yasinOrderPage yasinOrderPage = new yasinOrderPage();

//      Go to homepage
            Driver.getDriver().get("https://allovercommerce.com/");
            WaitUtils.waitFor(1);

//      Enter the product name in the search box and click enter
            WebElement searchBox = yasinHomePage.searchBox;
            searchBox.sendKeys("iphone");
            searchBox.sendKeys(Keys.ENTER);

//      Choose the product
            yasinHomePage.theProduct.click();
            WaitUtils.waitFor(2);

 //       Click "Add to Cart"
            JSUtils.JSclickWithTimeout(yasinProductPage.addToCartButton);
            WaitUtils.waitFor(2);

//        Verify that the product is added the cart
            Assert.assertTrue(yasinProductPage.cartIcon.getText().contentEquals("1"));
            MediaUtils.takeScreenshotOfTheEntirePage();
//        Click to the cart icon on the page
            JSUtils.JSclickWithTimeout(yasinProductPage.cartIcon);
            WaitUtils.waitFor(2);
//        Click to checkout button
            yasinProductPage.checkOutButton.click();
            WaitUtils.waitFor(1);
//        click sign in linktext
            yasinProductPage.signInButton.click();
            WaitUtils.waitFor(2);
//        enter username and password
            yasinSignPage.userNameBox.sendKeys("yasin1");
           yasinSignPage.passWordBox.sendKeys("12345.");
//        click sign in button
            yasinSignPage.singInAsUserButton.click();
            WaitUtils.waitFor(2);

//        Verify invalid username text on the page
            String unverifiedText = "Wrong username or password.";
            Assert.assertTrue(yasinSignPage.unverifiedMessage.isDisplayed(), unverifiedText);
            MediaUtils.takeScreenshotOfTheEntirePage();

            // Close the page
            Driver.closeDriver();
        }
    }


