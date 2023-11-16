package allovercommerce.tests.US02_ahmet;

import allovercommerce.pages.ahmet.Ahmet_MyAccountPage;
import allovercommerce.pages.ahmet.Ahmet_RegistrationPage;
import allovercommerce.utilities.Driver;
import allovercommerce.utilities.ExtentReportUtils;
import allovercommerce.utilities.JSUtils;
import allovercommerce.utilities.MediaUtils;
import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class TC02_RegisteredEmail {
    @Test
    public void registeredEmail() throws IOException {

        ExtentReportUtils.createTestReport("registeredEmail", "verify the steps");
        ExtentReportUtils.pass("Starting the test...");

        Ahmet_RegistrationPage ahmetRegistrationPage = new Ahmet_RegistrationPage();
        Ahmet_MyAccountPage ahmetMyAccountPage = new Ahmet_MyAccountPage();
        Faker faker = new Faker();

//        navigate to homepage
        Driver.getDriver().get("https://allovercommerce.com/");
        MediaUtils.takeScreenshotOfTheEntirePage();

//        click on register button
        JSUtils.flashElement(ahmetRegistrationPage.register);
        ahmetRegistrationPage.register.click();
        MediaUtils.takeScreenshotOfTheEntirePage();

//        click on sign up
        JSUtils.flashElement(ahmetRegistrationPage.signUp);
        ahmetRegistrationPage.signUp.click();
        MediaUtils.takeScreenshotOfTheEntirePage();

//        enter a valid username
        JSUtils.flashElement(ahmetRegistrationPage.userName);
        ahmetRegistrationPage.userName.sendKeys(faker.name().name());
        MediaUtils.takeScreenshotOfTheEntirePage();

//        enter a registered email address
        JSUtils.flashElement(ahmetRegistrationPage.email);
        ahmetRegistrationPage.email.sendKeys("jarek.najair@feerock.com");
        MediaUtils.takeScreenshotOfTheEntirePage();

//        enter a valid password
        JSUtils.flashElement(ahmetRegistrationPage.password);
        ahmetRegistrationPage.password.sendKeys(faker.internet().password());
        MediaUtils.takeScreenshotOfTheEntirePage();

//        click on "I agree to the privacy policy" box"
        JSUtils.flashElement(ahmetRegistrationPage.policyCheckBox);
        ahmetRegistrationPage.policyCheckBox.click();
        MediaUtils.takeScreenshotOfTheEntirePage();

//        click on sign up button
        JSUtils.flashElement(ahmetRegistrationPage.signUpButton);
        ahmetRegistrationPage.signUpButton.click();
        MediaUtils.takeScreenshotOfTheEntirePage();

//        verify that user sees "An account is already registered with your email address." message
        JSUtils.flashElement(ahmetRegistrationPage.verifyRegisteredEmail);
        Assert.assertTrue(ahmetRegistrationPage.verifyRegisteredEmail.isDisplayed());
        MediaUtils.takeScreenshotOfTheEntirePage();

//        close
        Driver.getDriver().close();

        ExtentReportUtils.pass("Driver is closed.... Test is completed successfully...");
        ExtentReportUtils.flush();

    }
}
