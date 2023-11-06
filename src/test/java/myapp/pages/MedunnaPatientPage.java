package myapp.pages;

import myapp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MedunnaPatientPage {

    public MedunnaPatientPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[.='Create a new Patient']")
    public WebElement createANewPatientLink;

    @FindBy(id = "patient-firstName")
    public WebElement patientFirstNameInput;

    @FindBy(id = "patient-lastName")
    public WebElement patientLastNameInput;

    @FindBy(id = "email")
    public WebElement patientEmailInput;

    @FindBy(id = "patient-phone")
    public WebElement patientPhoneInput;

    @FindBy(id = "save-entity")
    public WebElement saveSubmitButton;

    @FindBy(xpath = "//div[@role='alert']")
    public WebElement alertMessage;

}