package allovercommerce.tests.US09_fatma;

import allovercommerce.pages.fatma.FatmaPage;
import allovercommerce.utilities.Driver;
import allovercommerce.utilities.ExtentReportUtils;
import allovercommerce.utilities.JSUtils;
import allovercommerce.utilities.WaitUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;


public class TC03 {


//      Go to https://allovercommerce.com/vendor-register/
//      Enter an email address to the email textbox
//      Enter the verification code
//      Leave the blank password textbox
//      Leave the blank confirm password textbox
//      Click on register button
//      For both password textboxes, there should password a required messages occur
    @Test
    public void test3() throws InterruptedException {
        FatmaPage fatmaPage = new FatmaPage();

    // Go to https://allovercommerce.com/vendor-register/
        Driver.getDriver().get("https://allovercommerce.com/vendor-register/");


    // Enter an email address to the email textbox
      fatmaPage.emailInput.sendKeys("abcd@gmail.com");

    //Enter the verification code
      fatmaPage.verificationCode.sendKeys("12345");

    // Leave the blank password textbox
      fatmaPage.passwordInput.sendKeys("");
        Thread.sleep(2000);
    // Leave the blank confirm password textbox
       fatmaPage.confirmPassword.sendKeys("");
        Thread.sleep(2000);

    // Click on register button
        JSUtils.JSclickWithTimeout(fatmaPage.registerButton);
        JSUtils.flashElement(fatmaPage.registerButton);
        WaitUtils.waitFor(3);
        JSUtils.JSscrollAllTheWayUp();
     // WaitUtils.waitForVisibility(fatmaPage.requiredMessage,3);


     // For both password text boxes, there should password a required messages occur

       assertTrue(fatmaPage.requiredMessage.isDisplayed());





        ExtentReportUtils.createTestReport("Vendor registration","User should not be able to register");
        ExtentReportUtils.passAndCaptureScreenshot("PASSED");
        ExtentReportUtils.flush();


    }
}
