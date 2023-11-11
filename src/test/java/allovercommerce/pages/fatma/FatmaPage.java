package allovercommerce.pages.fatma;

import allovercommerce.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FatmaPage {
    public FatmaPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@class ='register inline-type']")
    public WebElement registerPageLink;

    @FindBy(linkText = "Become a Vendor")
    public WebElement becomeVendorLink;

    @FindBy(id = "user_email")
    public WebElement emailInput;

    @FindBy(xpath ="//input[@placeholder='Verification Code']")
    public WebElement verificationCode;

    @FindBy(xpath ="//input[@id='passoword']")
    public WebElement passwordInput;

    @FindBy(xpath ="//input[@id='confirm_pwd']")
    public WebElement confirmPassword;

    @FindBy(xpath ="//input[@name='save-data']")
    public WebElement registerButton;


    @FindBy(xpath ="//div[@class ='page-title-wrap']")
    public WebElement registerPageTitle;

    @FindBy(xpath ="//h1['Welcome to Allover Commerce!']")
    public WebElement setUpPage;


    @FindBy(xpath = "//div[@class='wcfm-message email_verification_message wcfm-error']")
    public WebElement requiredMessage;

    @FindBy(xpath ="//span[@id='predmet']")
    public WebElement fakeCode;

    @FindBy(xpath ="//span[@id='email']")
    public WebElement fakeMail;

    @FindBy(xpath ="//div[@class='wcfm-message email_verification_message wcfm-success']")
    public WebElement verificationCodeSentMessage;

    @FindBy(xpath ="//tr[@data-href='2'][1]")
    public WebElement clickToFakeMail;








  }
