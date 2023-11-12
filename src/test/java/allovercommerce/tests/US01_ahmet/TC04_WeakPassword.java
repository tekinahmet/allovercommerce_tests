package allovercommerce.tests.US01_ahmet;

import allovercommerce.pages.ahmet.Ahmet_MyAccountPage;
import allovercommerce.pages.ahmet.Ahmet_RegistrationPage;
import allovercommerce.utilities.Driver;
import allovercommerce.utilities.MediaUtils;
import allovercommerce.utilities.WaitUtils;
import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class TC04_WeakPassword {
    @Test
    public void weakPassword() throws IOException {
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

//        enter a valid username
        ahmetRegistrationPage.userName.sendKeys(faker.name().name());
        MediaUtils.takeScreenshotOfTheEntirePage();

//        enter an email address
        ahmetRegistrationPage.email.sendKeys(faker.internet().emailAddress());
        MediaUtils.takeScreenshotOfTheEntirePage();

//        enter a weak password
        ahmetRegistrationPage.password.sendKeys(" ");
        MediaUtils.takeScreenshotOfTheEntirePage();

//        click on "I agree to the privacy policy" box
        ahmetRegistrationPage.policyCheckBox.click();
        MediaUtils.takeScreenshotOfTheEntirePage();

//        click on sign up button
        ahmetRegistrationPage.signUpButton.click();
        MediaUtils.takeScreenshotOfTheEntirePage();

//        verify that user is not able to click on sign up button
        Assert.assertTrue(ahmetRegistrationPage.verifyPassword.isDisplayed());
        MediaUtils.takeScreenshotOfTheEntirePage();

//        close
        Driver.getDriver().close();
    }
}
