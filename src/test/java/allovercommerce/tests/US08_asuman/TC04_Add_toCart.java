package allovercommerce.tests.US08_asuman;

import allovercommerce.pages.asuman.Asu_BillingPage;
import allovercommerce.pages.asuman.Asu_CartPage;
import allovercommerce.pages.asuman.Asu_Homepage;
import allovercommerce.pages.asuman.Asu_WishlistPage;
import allovercommerce.utilities.*;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class TC04_Add_toCart {


    @Test
    public void addToCart() throws IOException {


        Asu_Homepage asuHomepage=new Asu_Homepage();
        Asu_WishlistPage asuWishlistPage=new Asu_WishlistPage();
        Asu_CartPage asuCartPage=new Asu_CartPage();
        Asu_BillingPage asuBillingPage= new Asu_BillingPage();

        //1 Go to  homepage	https://allovercommerce.com
        Driver.getDriver().get("https://allovercommerce.com/");
        asuHomepage.searchBar.sendKeys("macbook", Keys.ENTER);
//2. Click on "sign in" button
        asuHomepage.signInItem.click();
//3. Enter  e-mail address     	ayazasuman@gmail.com
        asuHomepage.username.sendKeys("ayazasuman@gmail.com");
//4.  Enter password  	ofelya1863
        asuHomepage.password.sendKeys("ofelya1863");
//5. Click on "sign in" button
        asuHomepage.signInButton.click();
//6. Verify that searchbox is visible


//7. click on "Search" item
        // Asu_Homepage.searchBar.click();
        // Thread.sleep(2000);
//8. Write a product name	 macbook

        asuHomepage.resultVerification.getText().contains("macbook");

//4. Click on "Add to Cart" button
        WaitUtils.waitFor(10);
        asuHomepage.macbook1.click();
        asuCartPage.cartButton1.click();

        asuHomepage.searchBar.sendKeys("macbook",Keys.ENTER);


        // 4. Click on "Add to Cart" button
        asuHomepage.macbookPro.click();
        asuCartPage.cartButton2.click();

        //5. Click "Cart" icon in the same page
        asuCartPage.pageCartButton.click();

        // 7. Click on "CHECKOUT" button
        asuCartPage.checkOutButton.click();

        //checkout page verif
        // Asu_CartPage.checkOutVerif.isDisplayed();
        //20. Click on place order

        WaitUtils.waitFor(5);
        //9.Enter first name
        //Asu_BillingPage.billingFirstName.click();

        JSUtils.flashElement(asuBillingPage.billingFirstName);

        asuBillingPage.billingFirstName.clear();

        asuBillingPage.billingFirstName.sendKeys("Nehir");

        WaitUtils.waitFor(1);
        //10. Enter lastname
        asuBillingPage.billingLastName.clear();
        asuBillingPage.billingLastName.sendKeys("yaz",Keys.ENTER);


        WaitUtils.waitFor(1);
        //11. vendor types company name into billing details
        asuBillingPage.companyName.clear();
        asuBillingPage.companyName.sendKeys(ConfigReader.getProperty("techpro"));
        WaitUtils.waitFor(1);
        //12. vendor chooses country
        asuBillingPage.countryArrow.click();
        asuBillingPage.countrySearch.sendKeys(ConfigReader.getProperty("country")+Keys.ENTER);
        WaitUtils.waitFor(1);
        //13. vendor types street address
        asuBillingPage.streetAddress.clear();
        asuBillingPage.streetAddress.sendKeys(ConfigReader.getProperty("streetAddress"));
        WaitUtils.waitFor(1);
        //14.vendor types street address line 2
        asuBillingPage.StreetAddress2.clear();
        asuBillingPage.StreetAddress2.sendKeys(ConfigReader.getProperty("streetAddress2"));
        WaitUtils.waitFor(1);
        //15.vendor types city/town info
        asuBillingPage.billingCity.clear();
        asuBillingPage.billingCity.sendKeys(ConfigReader.getProperty("billingCity"));

        WaitUtils.waitFor(1);
        //16.
        asuBillingPage.ZipCode.clear();
        asuBillingPage.ZipCode.sendKeys(ConfigReader.getProperty("zipCode"));

        WaitUtils.waitFor(1);
        //17. Vendor types phone number
        asuBillingPage.phoneNumber.clear();
        asuBillingPage.phoneNumber.sendKeys(ConfigReader.getProperty("phoneNumber"));
        WaitUtils.waitFor(1);

        //18.Vendor types e-mail address
        asuBillingPage.emailAddress.clear();
        asuBillingPage.emailAddress.sendKeys(ConfigReader.getProperty("emailAddress"));

        WaitUtils.waitFor(1);
        //19. vendor types order notes
        asuBillingPage.orderNote.clear();
        asuBillingPage.orderNote.sendKeys("fragile");
        WaitUtils.waitFor(1);

        WaitUtils.waitFor(1);
        //20.vendor chooses payment method  !!!
        JSUtils.JSclickWithTimeout(asuBillingPage.wireTransfer);
        WaitUtils.waitFor(2);
        Assert.assertTrue(asuBillingPage.wireTransfer.isDisplayed());

        WaitUtils.waitFor(1);
        //21. vendor clicks pay at the door
        JSUtils.JSclickWithTimeout(asuBillingPage.payAtTheDoor);
        WaitUtils.waitFor(2);
        Assert.assertTrue(asuBillingPage.payAtTheDoor.isDisplayed());

        WaitUtils.waitFor(1);
        //22.Vendor verifies total amount is visible
        String verifyText3 ="Total";
        Assert.assertTrue(asuBillingPage.totalAmount.isDisplayed(), verifyText3);
        //23. vendor clicks on Place Order button

        WaitUtils.waitFor(2);
        JSUtils.JSclickWithTimeout(asuBillingPage.placeOrder);
        WaitUtils.waitFor(3);

        WaitUtils.waitFor(1);
        //24.vendor verifies shopping is completed
        String verifyText2 ="Thank you. Your order has been received.";
        Assert.assertTrue(asuBillingPage.orderCompleteText.isDisplayed(), verifyText2);

        //25.vendor clicks  "My Account - My Orders"
        JSUtils.JSclickWithTimeout(asuBillingPage.shoppingDetails);
        MediaUtils.takeScreenshotOfTheEntirePage();

        //26.vendor closes driver
        Driver.closeDriver();






    }

}
