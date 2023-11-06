package myapp.pages;

import com.google.j2objc.annotations.Weak;
import myapp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutomationExerciseSignUpPage {
    public AutomationExerciseSignUpPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//h2[.='Enter Account Information']")
    public WebElement verifyAccountInfo;
    @FindBy(xpath = "//input[@id='id_gender1']")
    public WebElement genderMale;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement password;
    @FindBy(xpath = "//select[@id='days']")
    public WebElement day;
    @FindBy(xpath = "//select[@id='months']")
    public WebElement month;
    @FindBy(xpath = "//select[@id='years']")
    public WebElement year;

    @FindBy(xpath = "//input[@id='newsletter']")
    public WebElement newsletter;
    @FindBy(xpath = "//input[@id='optin']")
    public WebElement option;
    @FindBy(xpath = "//input[@id='first_name']")
    public WebElement firstName;
    @FindBy(xpath = "//input[@id='last_name']")
    public WebElement lastName;
    @FindBy(xpath = "//input[@id='company']")
    public WebElement company;
    @FindBy(xpath = "//input[@id='address1']")
    public WebElement address1;
    @FindBy(xpath = "//input[@id='address2']")
    public WebElement address2;
    @FindBy(xpath = "//select[@id='country']")
    public WebElement country;
    @FindBy(xpath = "//input[@id='state']")
    public WebElement state;
    @FindBy(xpath = "//input[@id='city']")
    public WebElement city;
    @FindBy(xpath = "//input[@id='zipcode']")
    public WebElement zipcode;
    @FindBy(xpath = "//input[@id='mobile_number']")
    public WebElement mobile_number;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement createAccount;

    @FindBy(xpath = "//h2[@data-qa='account-created']")
    public WebElement accountCreated;

    @FindBy(xpath = "//a[.='Continue']")
    public WebElement continueSignUp;

    @FindBy(xpath = "//b")
    public WebElement verifyLoggedInAsName;

    @FindBy(xpath = " //a[@href='/delete_account']")
    public WebElement deleteButton;
    @FindBy(xpath = "//h2")
    public WebElement accountDeleted;

}
