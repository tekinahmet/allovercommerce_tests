package myapp.homework;

import myapp.pages.RentalHomePage;
import myapp.pages.RentalLoginPage;
import myapp.utilities.BrowserUtils;
import myapp.utilities.ConfigReader;
import myapp.utilities.Driver;
import myapp.utilities.WaitUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.HdrDocumentImpl;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HW02_US100208_Negative_Login {
    /*
        Description:
        User should not be able login with incorrect credentials
        Acceptance Criteria:
        As customer, I should not be able to log in the application
        Incorrect username and incorrect password
        Customer email: fake@bluerentalcars.com
        Customer password: fakepass
        Error: User with email fake@bluerentalcars.com not found
     */
   @Test
    public void negativeLogin(){
//       go to https://www.bluerentalcars.com/
       Driver.getDriver().get(ConfigReader.getProperty("app_home_url"));
//        click login button
       RentalHomePage rentalHomePage = new RentalHomePage();
       BrowserUtils.clickWithTimeOut(rentalHomePage.loginLink, 3);
//       enter invalid username
       RentalLoginPage rentalLoginPage = new RentalLoginPage();
       rentalLoginPage.username.sendKeys("fake@bluerentalcars.com");
//       enter invalid password
       rentalLoginPage.password.sendKeys("fakepass");
       rentalLoginPage.loginButton.click();
//       verify User with email fake@bluerentalcars.com not found
       WaitUtils.waitForVisibility(By.xpath("//div[@class='Toastify__toast-body']"), 3);
       String alertMessage = rentalLoginPage.alert.getText();
       System.out.println("alertMessage = " + alertMessage);
       Assert.assertEquals("User with email fake@bluerentalcars.com not found", alertMessage);
   }

}
