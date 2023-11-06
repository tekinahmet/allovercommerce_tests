package myapp.pages;

import myapp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class XYZBankCustomerPage {

    public XYZBankCustomerPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "userSelect")
    public WebElement yourNameDropDown;

    @FindBy(xpath = "//button[.='Login']")
    public WebElement loginButton;

    @FindBy(xpath = "//button[@ng-click='deposit()']")
    public WebElement depositButton;

    @FindBy(xpath = "//input[@placeholder='amount']")
    public WebElement depositInput;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement depositSubmitButton;

    @FindBy(xpath = "//span[.='Deposit Successful']")
    public WebElement depositSuccessfulMessage;

    @FindBy(xpath = "//button[@ng-click='withdrawl()']")
    public WebElement withdrawlButton;

    @FindBy(xpath = "//span[.='Transaction successful']")
    public WebElement transactionSuccessfulMessage;

    @FindBy(xpath = "//input[@type='number']")
    public WebElement withdrawlInput;

    @FindBy(xpath = "//button[.='Withdraw']")
    public WebElement withdrawlSubmitButton;

    @FindBy(xpath = "//button[.='Logout']")
    public WebElement logoutButton;





}
