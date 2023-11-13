package allovercommerce.pages.ahmet;

import allovercommerce.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ahmet_RegistrationPage {
    public Ahmet_RegistrationPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//span[.='Register']")
    public WebElement register;
    @FindBy(xpath = "//a[@href='signup']")
    public WebElement signUp;
    @FindBy(id = "reg_username")
    public WebElement userName;
    @FindBy(id = "reg_email")
    public WebElement email;
    @FindBy(id = "reg_password")
    public WebElement password;
    @FindBy(xpath = "//input[@id='register-policy']")
    public WebElement policyCheckBox;
    @FindBy(xpath = "//button[@value='Sign Up']")
    public WebElement signUpButton;
    @FindBy(xpath = "//p[.='Please enter a valid account username.']")
    public WebElement verifyUsername;
    @FindBy(xpath = "//p[.='Please provide a valid email address.']")
    public WebElement verifyEmail;
    @FindBy(xpath = "//p[.='An account is already registered with that username. Please choose another.']")
    public WebElement verifyRegisteredUsername;
    @FindBy(xpath = "(//p[@class='submit-status'])[2]")
    public WebElement verifyRegisteredEmail;
    @FindBy(xpath = "//small[@class='woocommerce-password-hint']")
    public WebElement verifyPassword;

}
