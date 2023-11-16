package allovercommerce.tests.US01_ahmet;

import allovercommerce.pages.ahmet.Ahmet_MyAccountPage;
import allovercommerce.pages.ahmet.Ahmet_RegistrationPage;
import allovercommerce.utilities.*;
import com.github.javafaker.Faker;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class TC01_SuccessfulRegistration {
    @Test
    public void invalidUsername() throws IOException {

        ExtentReportUtils.createTestReport("invalidUsername", "verify the steps");
        ExtentReportUtils.pass("Starting the test...");

        Ahmet_RegistrationPage ahmetRegistrationPage = new Ahmet_RegistrationPage();
        Ahmet_MyAccountPage ahmetMyAccountPage = new Ahmet_MyAccountPage();
        Faker faker = new Faker();

//        navigate to homepage
        Driver.getDriver().get("https://allovercommerce.com/");
        WaitUtils.waitFor(1);
        MediaUtils.takeScreenshotOfTheEntirePage();

//        click on register button
        JSUtils.flashElement(ahmetRegistrationPage.register);
        ahmetRegistrationPage.register.click();
        WaitUtils.waitFor(1);
        MediaUtils.takeScreenshotOfTheEntirePage();

//        click on sign up
        JSUtils.flashElement(ahmetRegistrationPage.signUp);
        ahmetRegistrationPage.signUp.click();
        WaitUtils.waitFor(1);
        MediaUtils.takeScreenshotOfTheEntirePage();


//        enter a invalid username
        JSUtils.flashElement(ahmetRegistrationPage.userName);
        ahmetRegistrationPage.userName.sendKeys("abc???");
        WaitUtils.waitFor(1);
        MediaUtils.takeScreenshotOfTheEntirePage();

//        enter an email address
        JSUtils.flashElement(ahmetRegistrationPage.email);
        ahmetRegistrationPage.email.sendKeys(faker.internet().emailAddress());
        WaitUtils.waitFor(1);
        MediaUtils.takeScreenshotOfTheEntirePage();

//        enter a valid password
        JSUtils.flashElement(ahmetRegistrationPage.password);
        ahmetRegistrationPage.password.sendKeys(faker.internet().password());
        WaitUtils.waitFor(1);
        MediaUtils.takeScreenshotOfTheEntirePage();

//        click on "I agree to the privacy policy" box"
        JSUtils.flashElement(ahmetRegistrationPage.policyCheckBox);
        ahmetRegistrationPage.policyCheckBox.click();
        WaitUtils.waitFor(1);
        MediaUtils.takeScreenshotOfTheEntirePage();

//        click on sign up button
        JSUtils.flashElement(ahmetRegistrationPage.signUpButton);
        ahmetRegistrationPage.signUpButton.click();
        WaitUtils.waitFor(1);
        MediaUtils.takeScreenshotOfTheEntirePage();

//        verify that user sees "Please provide a valid email address." message
        JSUtils.flashElement(ahmetRegistrationPage.verifyUsername);
        Assert.assertTrue(ahmetRegistrationPage.verifyUsername.isDisplayed());
        WaitUtils.waitFor(1);
        MediaUtils.takeScreenshotOfTheEntirePage();

//        close
        Driver.getDriver().close();

        ExtentReportUtils.pass("Driver is closed.... Test is completed successfully...");
        ExtentReportUtils.flush();

    }
}
