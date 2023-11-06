package myapp.pages;

import myapp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutomationExercisePage {
    public AutomationExercisePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
   @FindBy(xpath = "//a[@data-product-id='1']")
    public WebElement addToCart;
    @FindBy(xpath = "//a[.='View Cart']")
    public WebElement viewCart;
    @FindBy(xpath = "//a[.='Proceed To Checkout']")
    public WebElement proceedToCheckout;
    @FindBy(xpath = "//a[@data-product-id='1']")
    public WebElement xSign;
    @FindBy(xpath = "//a[.='Blue Top']")
    public WebElement productName;
    @FindBy(xpath = "//div[@class='productinfo text-center']")
    public WebElement hoverOver;

}
