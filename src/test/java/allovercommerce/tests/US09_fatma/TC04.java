package allovercommerce.tests.US09_fatma;

import allovercommerce.pages.fatma.FatmaPage;
import allovercommerce.utilities.Driver;
import allovercommerce.utilities.ExtentReportUtils;
import allovercommerce.utilities.JSUtils;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class TC04 {
    @Test()
    public void test04() throws InterruptedException {
        FatmaPage fatmaPage =new FatmaPage();

    // Go to https://allovercommerce.com/vendor-register/
        Driver.getDriver().get("https://allovercommerce.com/vendor-register/");

    // Leave the blank email text box
        fatmaPage.emailInput.sendKeys("");

    //Enter the verification code
        fatmaPage.verificationCode.sendKeys("12345");

    //Enter a password
        fatmaPage.passwordInput.sendKeys("Abcd.1245");


    //Retype your password
        fatmaPage.confirmPassword.sendKeys("Abcd.1245");


     // Click on directly to the register button
        JSUtils.JSclickWithTimeout(fatmaPage.registerButton);
        Thread.sleep(2000);
        JSUtils.JSscrollAllTheWayUp();


    // Then, there should be "Email: This field is required." massage occur
        assertTrue(fatmaPage.requiredMessage.isDisplayed());

        Driver.closeDriver();




        ExtentReportUtils.createTestReport("Vendor registration","User should not be able to register");
        ExtentReportUtils.passAndCaptureScreenshot("PASSED");
        ExtentReportUtils.flush();



    }
}
