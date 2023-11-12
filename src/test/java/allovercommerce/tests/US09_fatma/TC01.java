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
//  Click on "Register" button
//  Click on "Become a Vendor"
//  Enter an email from "https://www.fakemail.net"
//  Receive the code from "https://www.fakemail.net" website
//  Enter your password Abcd.0987
//  Retype your password Abcd.0987
//  Click on register button
//  Then registration must be successful and, user has to navigate to the setup page.





    @Test
    public void TC01() throws InterruptedException {
        FatmaPage fatmaPage = new FatmaPage();

        // Go to https://allovercommerce.com/
        Driver.getDriver().get("https://allovercommerce.com/");
        //String alloverHandle =Driver.getDriver().getWindowHandle();

        //Click on "Register" button
        fatmaPage.registerPageLink.click();

        //Click on "Become a Vendor"
        fatmaPage.becomeVendorLink.click();

        // Enter an email
        Driver.getDriver().get("https://www.fakemail.net/");
        String fakeMail = fatmaPage.fakeMail.getText();
        JSUtils.flashElement(fatmaPage.fakeMail);
        System.out.println("fakeMail = " + fakeMail);
        Driver.getDriver().navigate().back();
        fatmaPage.emailInput.sendKeys(fakeMail);

        // Enter the verification code

        fatmaPage.verificationCode.click();
        fatmaPage.passwordInput.sendKeys("");
        WaitUtils.waitForVisibility(fatmaPage.verificationCodeSentMessage,15);

        Driver.getDriver().navigate().forward();
        Thread.sleep(5000);
        WaitUtils.waitForVisibility(fatmaPage.clickToFakeMail,15);
        fatmaPage.clickToFakeMail.click();
        Thread.sleep(3000);
        String fakeCode = fatmaPage.fakeCode.getText().replaceAll("\\D", "");
        JSUtils.flashElement(fatmaPage.fakeCode);
        System.out.println("fakeCode = " + fakeCode);

        Driver.getDriver().navigate().back();
        fatmaPage.verificationCode.sendKeys(fakeCode);

        //Driver.getDriver().switchTo().window(alloverHandle);

        //Enter your password
        fatmaPage.passwordInput.sendKeys("Abcd.0987");

        //Retype your password
        fatmaPage.confirmPassword.sendKeys("Abcd.0987");

        //Click on register button
        JSUtils.JSscrollIntoView(fatmaPage.registerButton);
        JSUtils.JSclickWithTimeout(fatmaPage.registerButton);
        JSUtils.flashElement(fatmaPage.registerButton);
        JSUtils.JSscrollAllTheWayUp();
        ExtentReportUtils.passAndCaptureScreenshot("PASSED");


        //Then registration should be succesfull
        assertTrue(fatmaPage.setUpPage.isDisplayed());
        Driver.closeDriver();




        ExtentReportUtils.createTestReport("Vendor registration","User navigates to the setup page and see the Welcome message");
        ExtentReportUtils.passAndCaptureScreenshot("PASSED");
        ExtentReportUtils.flush();

    }
}
