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
//        click on register button
        ahmetRegistrationPage.register.click();
//        click on sign up
        ahmetRegistrationPage.signUp.click();
//        enter a valid username
        ahmetRegistrationPage.userName.sendKeys(faker.name().name());
//        enter an email address
        ahmetRegistrationPage.email.sendKeys(faker.internet().emailAddress());
//        enter a weak password
        ahmetRegistrationPage.password.sendKeys(" ");
        MediaUtils.takeScreenshotOfTheEntirePage();
//        click on "I agree to the privacy policy" box
        ahmetRegistrationPage.policyCheckBox.click();
//        click on sign up button
        ahmetRegistrationPage.signUpButton.click();
        WaitUtils.waitFor(2);
        MediaUtils.takeScreenshotOfTheEntirePage();
//        verify that user see the "Please enter a valid account username." message
        Assert.assertTrue(ahmetRegistrationPage.verifyEmail.isDisplayed());
//        close
        Driver.getDriver().close();
    }
}
