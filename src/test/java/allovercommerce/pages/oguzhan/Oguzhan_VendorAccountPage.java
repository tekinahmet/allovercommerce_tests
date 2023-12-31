package allovercommerce.pages.oguzhan;

import allovercommerce.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Oguzhan_VendorAccountPage {
    public Oguzhan_VendorAccountPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(name="s")
    public WebElement searchBar;
    @FindBy(xpath ="//i[@class='w-icon-search']")
    public  WebElement searchButton;
    @FindBy(xpath = "//h1[contains(@class, 'product_title') and contains(@class, 'entry-title')]\n")
    public WebElement product;
    @FindBy(xpath = "//button[@class='quantity-plus w-icon-plus' and @title='Plus']\n")
    public WebElement increaseButton;
    @FindBy(xpath = "//button[@name=\"add-to-cart\"]")
    public WebElement addToCart;
    @FindBy(xpath = "//i[@class='w-icon-cart']")
    public WebElement cart;
    @FindBy(xpath = "//a[contains(text(),'Checkout')]")
    public WebElement checkout;
    @FindBy(xpath ="//span[contains(text(),'Sign Out')]")
    public WebElement signOutSign;

    @FindBy(xpath = "//i[@class='fas fa-times']")
    public WebElement removeItem;

    @FindBy(xpath = "//p[@class='woocommerce-mini-cart__empty-message empty-msg']\n")
    public WebElement emptyCartMessage;

    @FindBy(xpath = "//a[@class='btn btn-dark btn-link btn-icon-right btn-close']\n")
    public WebElement closeButton;

    @FindBy(xpath = "//div[@class='woocommerce-info alert alert-simple alert-icon alert-close-top alert-info']\n")
    public WebElement alertMessage;

    @FindBy(xpath = "/html/body/a[@href='https://allovercommerce.com/urun/hiphone-25/']\n")
    public WebElement anotherItem;
}
