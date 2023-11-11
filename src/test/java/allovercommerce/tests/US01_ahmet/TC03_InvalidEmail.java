package allovercommerce.tests.US01_ahmet;

import allovercommerce.pages.ahmet.Ahmet_MyAccountPage;
import allovercommerce.pages.ahmet.Ahmet_RegistrationPage;
import allovercommerce.utilities.Driver;
import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC03_InvalidEmail {
    @Test
    public void invalidEmail(){
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
//        enter a invalid email address
        ahmetRegistrationPage.email.sendKeys("alican@alican");
//        enter a valid password
        ahmetRegistrationPage.password.sendKeys(faker.internet().password());
//        click on "I agree to the privacy policy" box"
        ahmetRegistrationPage.policyCheckBox.click();
//        click on sign up button
        ahmetRegistrationPage.signUpButton.click();
//        verify that user see the "Please enter a valid account username." message
        Assert.assertTrue(ahmetRegistrationPage.verifyEmail.isDisplayed());
//        close
        Driver.getDriver().close();
    }
}
