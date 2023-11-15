package allovercommerce.pages.oguzhan;

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

}
