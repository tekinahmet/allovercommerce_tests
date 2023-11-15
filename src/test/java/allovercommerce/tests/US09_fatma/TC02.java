package allovercommerce.tests.US09_fatma;

import allovercommerce.pages.fatma.FatmaPage;
import allovercommerce.utilities.Driver;
import allovercommerce.utilities.ExtentReportUtils;
import allovercommerce.utilities.JSUtils;
import allovercommerce.utilities.WaitUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

//        Go to https://allovercommerce.com/vendor-register/
//        Enter an email address to the email textbox
//        Leave the blank Verification Code textbox
//        Enter a password
//        Retype the password
//        Click on register button
//        The user must see the "Email Verification Code: This field is required."


public class TC02 {
    @Test
    public void test02() throws InterruptedException {
        FatmaPage fatmaPage =new FatmaPage();


    // Go to https://allovercommerce.com/vendor-register/
        Driver.getDriver().get("https://allovercommerce.com/vendor-register/");


    // Enter an email address to the email textbox
        fatmaPage.emailInput.sendKeys("abcdef@gmail.com");

    // Leave the blank Verification Code textbox
        fatmaPage.verificationCode.sendKeys("");
        Thread.sleep(2000);


    // Enter a password
        fatmaPage.passwordInput.sendKeys("Abcd.1245");
        Thread.sleep(2000);

    // Retype the password
        fatmaPage.confirmPassword.sendKeys("Abcd.1245");


    //  Click on register button
       // JSUtils.JSscrollIntoView(fatmaPage.registerButton);
        JSUtils.JSclickWithTimeout(fatmaPage.registerButton);
        JSUtils.flashElement(fatmaPage.registerButton);
        WaitUtils.waitFor(3);
        JSUtils.JSscrollAllTheWayUp();



    // The user must see the "Email Verification Code: This field is required." Registration should not be successful.

        Assert.assertTrue(fatmaPage.requiredMessage.isDisplayed());

        ExtentReportUtils.createTestReport("Vendor registration","User should not be able to register");
        ExtentReportUtils.passAndCaptureScreenshot("PASSED");
        ExtentReportUtils.flush();


    }
}
