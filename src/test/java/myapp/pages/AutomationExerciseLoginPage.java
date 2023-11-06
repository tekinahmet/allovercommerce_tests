package myapp.pages;

import myapp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutomationExerciseLoginPage {

    public AutomationExerciseLoginPage() {

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//h2[.='New User Signup!']")
    public WebElement newUserSignup;

    @FindBy(xpath = "//*[@name='name']")
    public WebElement nameInput;

    @FindBy(xpath = "//input[@data-qa='signup-email']")
    public WebElement emailInput;

    @FindBy(xpath = "//button[@data-qa='signup-button']")
    public WebElement signUpButton;

}