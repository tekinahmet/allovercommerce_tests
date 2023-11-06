package myapp.pages;
import myapp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class RentalLoginPage {
    //    1. create constructor
//    2. create page objects
    public RentalLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id="formBasicEmail")
    public WebElement username;
    @FindBy(id="formBasicPassword")
    public WebElement password;
    @FindBy(xpath="//button[@type='submit']")
    public WebElement loginButton;

    @FindBy(xpath = "//div[@class='Toastify__toast-body']")
    public WebElement alert;

    @FindBy(xpath = "//div[@class='invalid-feedback']")
    public WebElement invalidEmail;
}