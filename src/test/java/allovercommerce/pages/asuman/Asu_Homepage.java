package allovercommerce.pages.asuman;

import allovercommerce.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.w3c.dom.html.HTMLInputElement;

public class Asu_Homepage {



    public  Asu_Homepage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div/div/div[9]/div/div/a[1]")
    public  WebElement signInItem;


    @FindBy(xpath="//input[@id='username']")
    public  WebElement username;

    @FindBy(xpath="//input[@id='password']")
    public  WebElement password;

    @FindBy(xpath="//button[@class='woocommerce-button button woocommerce-form-login__submit' and @name='login' and @value='Sign In']")
    public  WebElement signInButton;

    @FindBy(xpath= "//button[@class='btn btn-search']")
    public  WebElement searchItem;

    @FindBy(xpath= "//*[@id='header']/div/div/div/div/div/div[3]/div/div/form/input[2]")
    public  WebElement searchBar;

    @FindBy(xpath= "/html/body/div[2]/div[1]/ul/li[5]")
    public  WebElement resultVerification;

    @FindBy(xpath="//*[@id=\"main\"]/div/div/div/div[4]/ul/li[1]/div/div/h3/a")
    public  WebElement macbook1;





    @FindBy(xpath="//*[@id=\"product-21379\"]/div[2]/div/div[5]/div[2]/div/a")
    public static WebElement wishlistItem1;


    @FindBy(xpath="//a[text()='MacBook Pro']")
    public static WebElement macbookPro;

    @FindBy(xpath="//*[@id=\"product-14671\"]/div[2]/div/div[5]/div[2]/div/a")
    public static WebElement wishlistItem2;

    @FindBy(xpath="//*[@id=\"header\"]/div/div/div/div/div/div[5]/div/a/i")
    public static WebElement pageWishlistItem;



    //signIn reusable method

    }

