package myapp.homework;

import myapp.pages.RentalHomePage;
import myapp.pages.RentalLoginPage;
import myapp.utilities.BrowserUtils;
import myapp.utilities.ConfigReader;
import myapp.utilities.Driver;
import myapp.utilities.WaitUtils;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HW03_US413123_Bad_Credentials {
    @Test
    public void badCredentials(){
//        go to https://www.bluerentalcars.com/
        Driver.getDriver().get(ConfigReader.getProperty("app_home_url"));
//        click login button
        RentalHomePage rentalHomePage = new RentalHomePage();
        rentalHomePage.loginLink.click();
//        enter valid email
        RentalLoginPage rentalLoginPage = new RentalLoginPage();
        rentalLoginPage.username.sendKeys(ConfigReader.getProperty("admin_username"));
//        enter invalid password
        rentalLoginPage.password.sendKeys("123");
//        click login button
        rentalLoginPage.loginButton.click();
//        verify error message
        WaitUtils.waitForVisibility(By.xpath("//div[@class='Toastify__toast-body']"), 3);
        String alertMessage = rentalLoginPage.alert.getText();
        System.out.println("alertMessage = " + alertMessage);
        Assert.assertTrue(alertMessage.contains("Bad credentials"));

    }
}
