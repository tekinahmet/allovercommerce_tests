package myapp.myowntests;

import myapp.pages.AutomationExercisePage;
import myapp.utilities.Driver;
import myapp.utilities.WaitUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC17_RemoveProductsFromCart {
    @Test
    public void test(){
//        1. Launch browser
//        2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get("http://automationexercise.com");
//        3. Verify that home page is visible successfully
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("automationexercise.com"));
//        4. Add products to cart
        AutomationExercisePage automationExercisePage = new AutomationExercisePage();
//        Actions actions = new Actions(Driver.getDriver());
//        actions.moveToElement(Driver.getDriver().findElement(By.xpath("//div[@class='productinfo text-center']")));
        automationExercisePage.addToCart.click();
//        5. Click 'Cart' button
        automationExercisePage.viewCart.click();
//        6. Verify that cart page is displayed
        Assert.assertTrue(automationExercisePage.proceedToCheckout.isDisplayed());
//        7. Click 'X' button corresponding to particular product
        automationExercisePage.xSign.click();
//        8. Verify that product is removed from the cart
        Assert.assertFalse(!automationExercisePage.proceedToCheckout.isDisplayed());
    }

}
