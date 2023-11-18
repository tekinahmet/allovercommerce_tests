package allovercommerce.pages.yasin;

import allovercommerce.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class yasinProductPage {

    public yasinProductPage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(name = "add-to-cart")
    public WebElement addToCartButton ;

    @FindBy(xpath = "//*[@class='cart-count']")
    public WebElement cartIcon;

    @FindBy(xpath = "//button[@class='quantity-plus w-icon-plus']")
    public WebElement plusButton;

    @FindBy(xpath = "//button[@class='quantity-minus w-icon-minus']")
    public WebElement minusButton;

    @FindBy(xpath = "//*[@class='checkout-button button alt wc-forward']")
    public WebElement proceedToCheckOutButton;

    @FindBy(xpath = "//*[@class='button checkout wc-forward']")
    public WebElement checkOutButton;

    @FindBy(xpath = "//*[@class='login inline-type']")
    public WebElement signInButton;

    @FindBy(xpath = "//*[@class='button wc-forward']")
    public WebElement viewCartButton;

    @FindBy(name = "update_cart")
    public WebElement updateCartButton;









}
