package allovercommerce.pages;

import allovercommerce.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class ahmet_RegistrationPage {
    public ahmet_RegistrationPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
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


}
