package allovercommerce.pages.zeynep;

import allovercommerce.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Zeynep_AccountDetailsPage {

    public Zeynep_AccountDetailsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //@FindBy(xpath = "//h4[text()='Account Details']")
    //public WebElement accountDetailsAssert;

    @FindBy(xpath = "//*[@id=\"main\"]/div/div/div/div/div/div/div/div[2]/div/h4")
    public WebElement accountDetailAssert;

    @FindBy(xpath = "//*[@id=\"account_first_name\"]")
    public WebElement reFirstName;

    @FindBy(xpath = "//*[@id=\"account_last_name\"]")
    public WebElement reLastName;

    @FindBy(xpath = "//*[@id=\"account_display_name\"]")
    public WebElement displayName;

    @FindBy(xpath = "//*[@id=\"account_email\"]")
    public WebElement reEmailAddress;

    @FindBy(xpath = "//*[@id=\"main\"]/div/div/div/div/div/div/div/form/p[7]/button")
    public WebElement saveChangesButton;

    @FindBy(xpath = "//*[@id=\"main\"]/div/div/div/div/div/div/div/div[1]/div")
    public WebElement verifyMessage;

    @FindBy(xpath = "//*[@id=\"tinymce\"]")
    public WebElement biography1;

    @FindBy(xpath = "//*[@id=\"tinymce\"]/p")
    public WebElement biography2;

    @FindBy(xpath = "//*[@id=\"password_current\"]")
    public WebElement currentPassword;

    @FindBy(xpath = "//*[@id=\"password_1\"]")
    public WebElement newPassword1;

    @FindBy(xpath = "//*[@id=\"password_2\"]")
    public WebElement confirmPassword;

    @FindBy (css = "#tinymce")
    public WebElement biography;


}
