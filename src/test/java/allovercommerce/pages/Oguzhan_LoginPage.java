package allovercommerce.pages;

import allovercommerce.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Oguzhan_LoginPage {
    public Oguzhan_LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//span[.='Sign In']")
    public  WebElement signIn;
    @FindBy(id ="username")
    public  WebElement userName;
    @FindBy(id="password")
    public  WebElement password;
    @FindBy(xpath = "//*[@id=\"signin\"]/form/button")
    public  WebElement signInButton;
    @FindBy(name="s")
    public  WebElement searchBar;
    @FindBy(xpath ="//i[@class='w-icon-search']")
    public  WebElement searchButton;
    @FindBy(xpath = "//button[@name=\"add-to-cart\"]")
    public WebElement addToCart;
    @FindBy(xpath = "//i[@class='w-icon-cart']")
    public WebElement cart;
    @FindBy(xpath = "//a[contains(text(),'Checkout')]")
    public WebElement checkout;
    @FindBy(id = "billing_first_name")
    public WebElement billingFirstName;
    @FindBy(id="billing_last_name")
    public WebElement billingLastName;
    @FindBy(id="select2-billing_country-container")
    public WebElement countryName;


    @FindBy(xpath = "//label[contains(text(),'Pay at the door')]")  //!!!!
    public WebElement payAtTheDoor;
    @FindBy(xpath = "//button[@id='place_order']") //!!!
    public WebElement placeOrder;
}
