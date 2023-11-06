package myapp.tests.practices;

import com.github.javafaker.Faker;
import myapp.pages.MedunnaHomePage;
import myapp.pages.MedunnaLoginPage;
import myapp.pages.MedunnaPatientPage;
import myapp.utilities.ConfigReader;
import myapp.utilities.DataProviderUtils;
import myapp.utilities.Driver;
import myapp.utilities.JSUtils;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class MedunnaPatient {
    //Admin can create patients
        /*
    Given
        Go to https://medunna.com/
    When
        Click on "user icon"
    And
        Click on "Sign In" option
    And
        Enter username into "Username" input
    And
        Enter password into "Password" input
    And
        Click on "Remember me" check box
    And
        Click on "Sign in" submit button
    And
        Click on "Items&Titles" menu
    And
        Click on "Patient" option
    And
        Click on "Create a new patient" button
    And
        Enter firstname into "First Name" input
    And
        Enter lastname into "Last Name" input
    And
        Enter email into "Email" input
    And
        Enter phone number into "Phone" input
    And
        Click on "Save" button
    Then
        Assert that patient is created
     */


    @Test(dataProvider = "medunnaCredentials", dataProviderClass = DataProviderUtils.class)
    public void medunnaPatient(String username, String password, String firstname, String lastname, String email, String phone) throws InterruptedException {
//        Go to https://medunna.com/
        Driver.getDriver().get(ConfigReader.getProperty("medunna_url"));

//        Click on "user icon"
        MedunnaHomePage medunnaHomePage = new MedunnaHomePage();
        medunnaHomePage.userIcon.click();

//        Click on "Sign In" option
        medunnaHomePage.signInOption.click();

//        Enter username into "Username" input
        MedunnaLoginPage medunnaLoginPage = new MedunnaLoginPage();
        medunnaLoginPage.usernameInput.sendKeys(username);

//        Enter password into "Password" input
        medunnaLoginPage.passwordInput.sendKeys(password);

//        Click on "Remember me" check box
        medunnaLoginPage.rememberMeCheckBox.click();

//       Click on "Sign in" submit button
        medunnaLoginPage.signInSubmitButton.click();

//        Click on "Items&Titles" menu
        medunnaHomePage.itemsAndTitlesMenu.click();

//        Click on "Patient" option
        medunnaHomePage.patientOption.click();

//        Click on "Create a new patient" button
        MedunnaPatientPage medunnaPatientPage = new MedunnaPatientPage();
        medunnaPatientPage.createANewPatientLink.click();

//        Enter firstname into "First Name" input
        medunnaPatientPage.patientFirstNameInput.sendKeys(firstname);

//        Enter lastname into "Last Name" input
        medunnaPatientPage.patientLastNameInput.sendKeys(lastname);

//        Enter email into "Email" input
        medunnaPatientPage.patientEmailInput.sendKeys(Faker.instance().number().numberBetween(1000,9999)+email);//To make email unique in each run, we use faker

//        Enter phone number into "Phone" input
        phone = phone.replaceAll("[^0-9]","");
        medunnaPatientPage.patientPhoneInput.sendKeys(phone);

//        Click on "Save" button
        //medunnaPatientPage.saveSubmitButton.click();
        JSUtils.JSclickWithTimeout(medunnaPatientPage.saveSubmitButton);//Since Selenium click did not work. We click with JS Executor

//        Assert that patient is created
        Thread.sleep(1000);
        String alertMessage = medunnaPatientPage.alertMessage.getText();
        assertTrue(alertMessage.contains("A new Patient is created"));

        Driver.closeDriver();


    }

}