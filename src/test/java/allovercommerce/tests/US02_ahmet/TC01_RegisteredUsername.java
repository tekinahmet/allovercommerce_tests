package allovercommerce.tests.US02_ahmet;

import allovercommerce.pages.ahmet.Ahmet_MyAccountPage;
import allovercommerce.pages.ahmet.Ahmet_RegistrationPage;
import allovercommerce.utilities.Driver;
import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC01_RegisteredUsername {
    @Test
    public void registeredUsername(){
        Ahmet_RegistrationPage ahmetRegistrationPage = new Ahmet_RegistrationPage();
        Ahmet_MyAccountPage ahmetMyAccountPage = new Ahmet_MyAccountPage();
        Faker faker = new Faker();

//        navigate to homepage
        Driver.getDriver().get("https://allovercommerce.com/");
//        click on register button
        ahmetRegistrationPage.register.click();
//        click on sign up
        ahmetRegistrationPage.signUp.click();
//        enter registered username
        ahmetRegistrationPage.userName.sendKeys("ali");
//        enter a valid email address
        ahmetRegistrationPage.email.sendKeys(faker.internet().emailAddress());
//        enter a valid password
        ahmetRegistrationPage.password.sendKeys(faker.internet().password());
//        click on "I agree to the privacy policy" box"
        ahmetRegistrationPage.policyCheckBox.click();
//        click on sign up button
        ahmetRegistrationPage.signUpButton.click();
//        verify that user sees "An account is already registered with that username. Please choose another." message
        Assert.assertTrue(ahmetRegistrationPage.verifyRegisteredUsername.isDisplayed());
//        close
        Driver.getDriver().close();
    }



}
