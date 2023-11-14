package allovercommerce.tests.US17_oguzhan;

import allovercommerce.pages.Oguzhan_LoginPage;
import allovercommerce.utilities.ActionsUtils;
import allovercommerce.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.security.Key;


public class TC01 {


@Test

    public void testCase01() throws InterruptedException {
    Oguzhan_LoginPage oguzhanLoginPage = new Oguzhan_LoginPage();



    // 1. vendor navigates to https://allovercommerce.com/
    Driver.getDriver().get("https://allovercommerce.com/");
    // 2. vendor clicks on sign-in button
   oguzhanLoginPage.signIn.click();
    // 3. vendor enters username/e-mail address
    oguzhanLoginPage.userName.sendKeys("oguzhanguven_2020@outlook.com");
    // 4. vendor enters password
    oguzhanLoginPage.password.sendKeys("Out23_20*");
    // 5. vendor clicks sign in button
    oguzhanLoginPage.signInButton.click();
    // 6. vendor types product name on the search bar and enters
    Thread.sleep(2000);
    oguzhanLoginPage.searchBar.sendKeys("nutella"+ Keys.ENTER);
    //7. vendor adds the item into cart
    oguzhanLoginPage.addToCart.click();
    Thread.sleep(1000);
    //8. vendor goes to cart by clicking kart icon
    oguzhanLoginPage.cart.click();
    //9. vendor clicks checkout
    oguzhanLoginPage.checkout.click();
    //10. vendor enters firstname
    oguzhanLoginPage.billingFirstName.sendKeys("trial1");
    //11. vendor enters lastname
    oguzhanLoginPage.billingLastName.sendKeys("abc");
    //12. vendor enters country info
    oguzhanLoginPage.countryName.sendKeys("US"+ Keys.ENTER);  //  page.element.getText().contains(" ")





//    // ?. vendor chooses payment method  !!!
   oguzhanLoginPage.payAtTheDoor.isSelected();
//    //?. vendor clicks on Place Order button
   Thread.sleep(2000);
   oguzhanLoginPage.placeOrder.click();


}
}
