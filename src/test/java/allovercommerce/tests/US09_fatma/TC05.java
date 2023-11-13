package allovercommerce.tests.US09_fatma;

import allovercommerce.pages.fatma.FatmaPage;
import allovercommerce.utilities.Driver;
import allovercommerce.utilities.ExtentReportUtils;
import allovercommerce.utilities.JSUtils;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;


//          Go to https://allovercommerce.com/vendor-register/
//          Enter an email address that you used before  (fatmakaa00@gmail.com)
//          Enter the verification code (781046)
//          Enter a passwors as required (Abcd.1245)
//          Retype the password (Abcd.1245)
//          Click on register button
//          Then, there should be "This Email already exists. Please login to the site and apply as vendor." message occur




public class TC05 {

    @Test
    public void test05() throws InterruptedException {
        FatmaPage fatmaPage = new FatmaPage();

    // Go to https://allovercommerce.com/vendor-register/
        Driver.getDriver().get("https://allovercommerce.com/vendor-register/");

    // Enter an email address that you used before   fatmakaa00@gmail.com)
        fatmaPage.emailInput.sendKeys("fatmakaa00@gmail.com");
        Thread.sleep(2000);

    // Enter the verification code  (781046)
        fatmaPage.verificationCode.sendKeys("765872");

    // Enter a passwors as required  (Abcd.1245)
        fatmaPage.passwordInput.sendKeys("Abcd.1245");

    // Retype the password  (Abcd.1245)
        fatmaPage.confirmPassword.sendKeys("Abcd.1245");

    // Click on register button
        JSUtils.JSclickWithTimeout(fatmaPage.registerButton);
        JSUtils.JSclickWithTimeout(fatmaPage.registerButton);
        Thread.sleep(2000);
        JSUtils.JSscrollAllTheWayUp();

        // Then, there should be "This Email already exists. Please log in to the site and apply as vendor." message occur

        assertTrue(fatmaPage.emailExistMessage.isDisplayed());



        ExtentReportUtils.createTestReport("Vendor registration","User should not be able to register");
        ExtentReportUtils.passAndCaptureScreenshot("PASSED");
        ExtentReportUtils.flush();

        Driver.closeDriver();


    }
}
