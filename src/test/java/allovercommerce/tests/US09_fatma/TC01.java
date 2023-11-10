package allovercommerce.tests.US09_fatma;

import allovercommerce.pages.fatma.FatmaPage;
import allovercommerce.utilities.Driver;
import allovercommerce.utilities.ExtentReportUtils;
import allovercommerce.utilities.JSUtils;
import allovercommerce.utilities.WaitUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

import java.security.Key;

import static org.testng.AssertJUnit.assertTrue;

public class TC01 {
//  Go to https://allovercommerce.com/
// Click on "Register" button
// Click on "Become a Vendor"
//  Enter an email adeel.jarett@forkshape.com
// Enter the code  812632
//Enter your password Abcd.0987
// Retype your password Abcd.0987
//Click on register button
// Then registration should be succesfull



    @Test
    public void TC01() throws InterruptedException {
    // Go to https://allovercommerce.com/


        Driver.getDriver().get("https://allovercommerce.com/");

        String alloverHandle =Driver.getDriver().getWindowHandle();

     // Click on "Register" button

        FatmaPage fatmaPage =new FatmaPage();
        fatmaPage.registerPageLink.click();

       //Click on "Become a Vendor"

        fatmaPage.becomeVendorLink.click();

       // Enter an email
        // Enter the verification code
         Driver.getDriver().switchTo().newWindow(WindowType.TAB);
         Driver.getDriver().get("https://www.fakemail.net");
         String fakeMailHandle =Driver.getDriver().getWindowHandle();
         WaitUtils.waitFor(5);
         String mail = fatmaPage.fakeMail.getText();
        WaitUtils.waitFor(3);

        System.out.println(mail);

         Driver.getDriver().switchTo().window(alloverHandle);
         fatmaPage.emailInput.sendKeys(mail,Keys.TAB);
         wait(2);
        Driver.getDriver().switchTo().window(fakeMailHandle);
        String fakeCode = fatmaPage.fakeCode.getText();
        System.out.println(fakeCode);

         Driver.getDriver().switchTo().window(alloverHandle);
         fatmaPage.verificationCode.sendKeys(fakeCode);

        //Enter your password
        fatmaPage.passwordInput.sendKeys("Abcd.0987");

       //Retype your password
        fatmaPage.confirmPassword.sendKeys("Abcd.0987");

       //Click on register button
        JSUtils.flashElement(fatmaPage.registerButton);

        JSUtils.JSclickWithTimeout(fatmaPage.registerButton);

        JSUtils.flashElement(fatmaPage.registerButton);


        //Then registration should be succesfull
        assertTrue(fatmaPage.setUpPage.isDisplayed());

        ExtentReportUtils.createTestReport("Vendor registration","User navigates to the setup page and see the Welcome message");
        ExtentReportUtils.passAndCaptureScreenshot("PASSED");
        ExtentReportUtils.flush();




    }
}
