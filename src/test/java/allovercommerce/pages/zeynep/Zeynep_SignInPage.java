package allovercommerce.pages.zeynep;

import allovercommerce.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Zeynep_SignInPage {

    public Zeynep_SignInPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[.='Sign In']")
    public WebElement signInButton;

    @FindBy(id = "username")
    public WebElement userName;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(xpath = "//button[@name='login']")
    public WebElement signInButton2;

    @FindBy(xpath = "//*[@id=\"menu-item-1079\"]/a")
    public WebElement myAccount;

    @FindBy(xpath = "/html/body/div[1]/main/div/div/div/div/div/div/nav/ul/li[4]/a")
    public WebElement addresses;

    @FindBy(xpath = "//*[@id=\"main\"]/div/div/div/div/div/div/nav/ul/li[5]/a")
    public WebElement accountDetailsButton;

}
