package myapp.homework;

import myapp.pages.RentalHomePage;
import myapp.pages.RentalLoginPage;
import myapp.utilities.ConfigReader;
import myapp.utilities.Driver;
import myapp.utilities.WaitUtils;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HW04_InvalidEmail_ValidEmail {
    @Test
    public void invalidEmail(){
//        go to https://www.bluerentalcars.com/
        Driver.getDriver().get(ConfigReader.getProperty("app_home_url"));
//        click login button
        RentalHomePage rentalHomePage = new RentalHomePage();
        rentalHomePage.loginLink.click();
//        enter an invalid email address
        RentalLoginPage rentalLoginPage = new RentalLoginPage();
        rentalLoginPage.username.sendKeys("ali");
//        verify that Error Message: email must be a valid email is displayed
        WaitUtils.waitForVisibility(By.xpath("//div[@class='invalid-feedback']"), 1);
        String enterValidEmail = rentalLoginPage.invalidEmail.getText();
        System.out.println("enterValidEmail = " + enterValidEmail);
        Assert.assertEquals("email must be a valid email", enterValidEmail);
    }
    @Test
    public void validEmail(){
//        go to https://www.bluerentalcars.com/
        Driver.getDriver().get(ConfigReader.getProperty("app_home_url"));
//        click login button
        RentalHomePage rentalHomePage = new RentalHomePage();
        rentalHomePage.loginLink.click();
//        enter a valid email address
        RentalLoginPage rentalLoginPage = new RentalLoginPage();
        rentalLoginPage.username.sendKeys(ConfigReader.getProperty("admin_username"));
//        verify that no error message is displayed
        Assert.assertTrue(!rentalLoginPage.invalidEmail.isDisplayed());
    }
}
