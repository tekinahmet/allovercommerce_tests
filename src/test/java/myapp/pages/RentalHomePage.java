package myapp.pages;

import myapp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RentalHomePage {
    //    1. create constructor
//    2. create page objects
    public RentalHomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(partialLinkText = "Login")
    public WebElement loginLink;
    @FindBy(id = "dropdown-basic-button")
    public WebElement userID;
    @FindBy(xpath = "//select[@name='car']")
    public WebElement selectACar;
    @FindBy(xpath = "//input[@name='pickUpLocation']")
    public WebElement pickUpPlace;
    @FindBy(xpath = "//input[@name='dropOfLocation']")
    public WebElement dropOffPlace;
    @FindBy(xpath = "//input[@name='pickUpDate']")
    public WebElement pickUpDate;
    @FindBy(xpath = "//input[@name='pickUpTime']")
    public WebElement pickUpTime;
    @FindBy(xpath = "//input[@name='dropOffDate']")
    public WebElement dropOffDate;
    @FindBy(xpath = "//input[@name='dropOffTime']")
    public WebElement dropOffTime;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement reservationButton;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement continueButton;
    @FindBy(xpath = "//div[@class='Toastify__toast-body']")
    public WebElement errorMessage;
}