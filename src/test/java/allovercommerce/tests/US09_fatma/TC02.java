package allovercommerce.tests.US09_fatma;

import allovercommerce.pages.fatma.FatmaPage;
import allovercommerce.utilities.Driver;
import allovercommerce.utilities.ExtentReportUtils;
import allovercommerce.utilities.JSUtils;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

//        Go to https://allovercommerce.com/vendor-register/
//        Enter an email address to the email textbox
//        Leave the blank Verification Code textbox
//        Click on register button
//        The user must see the "Email Verification Code: This field is required." or just verified you are still on the
//      registration page.



public class TC02 {
    @Test
    public void test02(){

        FatmaPage fatmaPage =new FatmaPage();
//     Go to https://allovercommerce.com/vendor-register/

        Driver.getDriver().get("https://allovercommerce.com/vendor-register/");


//     Enter an email address to the email textbox
        fatmaPage.emailInput.sendKeys("abcd@gmail.com", Keys.TAB);


//       Leave the blank Verification Code textbox
        fatmaPage.verificationCode.sendKeys("");

//      Click on register button
        JSUtils.JSclickWithTimeout(fatmaPage.registerButton);

        //    The user must see the "Email Verification Code: This field is required." Registration should not be successful.
        //Assert.assertTrue(fatmaPage.codeRequiredMessage.getText().contains("Email Verification Code: This field is required."));

        Assert.assertTrue(fatmaPage.requiredMessage.isDisplayed());


        ExtentReportUtils.createTestReport("Vendor registration","User should not be able to register");
        ExtentReportUtils.passAndCaptureScreenshot("PASSED");
        ExtentReportUtils.flush();





    }
}
