package allovercommerce.pages.mertcan;

import allovercommerce.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Mertcan_RegistrationPage {

    public Mertcan_RegistrationPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(id = "user_email")
    public WebElement email;
    @FindBy(id = "passoword")
    public WebElement password;
    @FindBy(id = "confirm_pwd")
    public WebElement confrmpwd;
    @FindBy(xpath = "//input[@name='save-data']")
    public WebElement registerButton;

}
