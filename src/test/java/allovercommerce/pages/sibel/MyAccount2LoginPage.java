package allovercommerce.pages.sibel;

import allovercommerce.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccount2LoginPage {

    public MyAccount2LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath="//input[@id='username']")
    public WebElement username;
    @FindBy(id="password")
    public WebElement password;
    @FindBy(xpath="//button[@value='Sign In']")
    public WebElement signInButton;




}
