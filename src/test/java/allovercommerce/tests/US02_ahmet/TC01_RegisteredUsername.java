package allovercommerce.tests.US02_ahmet;

import allovercommerce.pages.ahmet.Ahmet_MyAccountPage;
import allovercommerce.pages.ahmet.Ahmet_RegistrationPage;
import allovercommerce.utilities.Driver;
import allovercommerce.utilities.MediaUtils;
import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class TC01_RegisteredUsername {
    @Test
    public void registeredUsername() throws IOException {
        Ahmet_RegistrationPage ahmetRegistrationPage = new Ahmet_RegistrationPage();
        Ahmet_MyAccountPage ahmetMyAccountPage = new Ahmet_MyAccountPage();
        Faker faker = new Faker();

//        navigate to homepage
        Driver.getDriver().get("https://allovercommerce.com/");
        MediaUtils.takeScreenshotOfTheEntirePage();

//        click on register button
        ahmetRegistrationPage.register.click();
        MediaUtils.takeScreenshotOfTheEntirePage();

//        click on sign up
        ahmetRegistrationPage.signUp.click();
        MediaUtils.takeScreenshotOfTheEntirePage();

//        enter registered username
        ahmetRegistrationPage.userName.sendKeys("ali");
        MediaUtils.takeScreenshotOfTheEntirePage();

//        enter a valid email address
        ahmetRegistrationPage.email.sendKeys(faker.internet().emailAddress());
        MediaUtils.takeScreenshotOfTheEntirePage();

//        enter a valid password
        ahmetRegistrationPage.password.sendKeys(faker.internet().password());
        MediaUtils.takeScreenshotOfTheEntirePage();

//        click on "I agree to the privacy policy" box"
        ahmetRegistrationPage.policyCheckBox.click();
        MediaUtils.takeScreenshotOfTheEntirePage();

//        click on sign up button
        ahmetRegistrationPage.signUpButton.click();
        MediaUtils.takeScreenshotOfTheEntirePage();

//        verify that user sees "An account is already registered with that username. Please choose another." message
        Assert.assertTrue(ahmetRegistrationPage.verifyRegisteredUsername.isDisplayed());
        MediaUtils.takeScreenshotOfTheEntirePage();

//        close
        Driver.getDriver().close();
    }



}
