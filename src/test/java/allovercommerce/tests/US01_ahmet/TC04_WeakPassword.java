package allovercommerce.tests.US01_ahmet;

import allovercommerce.pages.ahmet.Ahmet_MyAccountPage;
import allovercommerce.pages.ahmet.Ahmet_RegistrationPage;
import allovercommerce.utilities.*;
import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class TC04_WeakPassword {
    @Test
    public void weakPassword() throws IOException {

        ExtentReportUtils.createTestReport("weakPassword", "verify the steps");
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

//        enter an email address
        JSUtils.flashElement(ahmetRegistrationPage.email);
        ahmetRegistrationPage.email.sendKeys(faker.internet().emailAddress());
        MediaUtils.takeScreenshotOfTheEntirePage();

//        enter a weak password
        JSUtils.flashElement(ahmetRegistrationPage.password);
        ahmetRegistrationPage.password.sendKeys(" ");
        MediaUtils.takeScreenshotOfTheEntirePage();

//        click on "I agree to the privacy policy" box
        JSUtils.flashElement(ahmetRegistrationPage.policyCheckBox);
        ahmetRegistrationPage.policyCheckBox.click();
        MediaUtils.takeScreenshotOfTheEntirePage();

//        click on sign up button
        JSUtils.flashElement(ahmetRegistrationPage.signUpButton);
        ahmetRegistrationPage.signUpButton.click();
        MediaUtils.takeScreenshotOfTheEntirePage();

//        verify that user is not able to click on sign up button
        JSUtils.flashElement(ahmetRegistrationPage.verifyPassword);
        Assert.assertTrue(ahmetRegistrationPage.verifyPassword.isDisplayed());
        MediaUtils.takeScreenshotOfTheEntirePage();

//        close
        Driver.getDriver().close();

        ExtentReportUtils.pass("Driver is closed.... Test is completed successfully...");
        ExtentReportUtils.flush();
    }
}
