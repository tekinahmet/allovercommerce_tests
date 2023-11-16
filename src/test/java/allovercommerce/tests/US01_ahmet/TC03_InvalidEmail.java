package allovercommerce.tests.US01_ahmet;

import allovercommerce.pages.ahmet.Ahmet_MyAccountPage;
import allovercommerce.pages.ahmet.Ahmet_RegistrationPage;
import allovercommerce.utilities.Driver;
import allovercommerce.utilities.ExtentReportUtils;
import allovercommerce.utilities.JSUtils;
import allovercommerce.utilities.MediaUtils;
import com.github.javafaker.Faker;
import jdk.security.jarsigner.JarSigner;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class TC03_InvalidEmail {
    @Test
    public void invalidEmail() throws IOException {

        ExtentReportUtils.createTestReport("invalidEmail", "verify the steps");
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

//        enter a invalid email address
        JSUtils.flashElement(ahmetRegistrationPage.email);
        ahmetRegistrationPage.email.sendKeys("alican@alican");
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

//        verify that user see the "Please enter a valid account username." message
        JSUtils.flashElement(ahmetRegistrationPage.verifyEmail);
        Assert.assertTrue(ahmetRegistrationPage.verifyEmail.isDisplayed());
        MediaUtils.takeScreenshotOfTheEntirePage();

//        close
        Driver.getDriver().close();

        ExtentReportUtils.pass("Driver is closed.... Test is completed successfully...");
        ExtentReportUtils.flush();
    }
}
