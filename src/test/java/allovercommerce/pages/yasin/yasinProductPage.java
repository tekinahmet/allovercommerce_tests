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

    @FindBy(xpath = "//*[@class='w-icon-cart']")
    public WebElement cartIcon;

    @FindBy(xpath = "//*[@class='quantity-plus w-icon-plus']")
    public WebElement plusButton;

    @FindBy(xpath = "")
    public WebElement proceedToCheckOutButton;

    @FindBy(xpath = "")
    public WebElement checkOutButton;

    @FindBy(xpath = "")
    public WebElement signInButton;


    @FindBy(xpath = "")
    public WebElement viewCartButton;

    @FindBy(xpath = "")
    public WebElement updateCartButton;

    @FindBy(xpath = "")
    public WebElement cartIconFromviewCart;







}
