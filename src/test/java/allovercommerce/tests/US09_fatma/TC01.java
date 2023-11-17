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
    public void test01() throws InterruptedException {
        FatmaPage fatmaPage = new FatmaPage();

        ExtentReportUtils.createTestReport("Vendor Registration","User creates account successfully as a vendor");
        ExtentReportUtils.info("Starting the Vendor Registration test");

        // Go to https://allovercommerce.com/
        Driver.getDriver().get("https://allovercommerce.com/");

        ExtentReportUtils.info("User goes to the website");

        //Click on "Register" button
        fatmaPage.registerPageLink.click();
        ExtentReportUtils.pass("User clicks on the register link");


        //Click on "Become a Vendor"
        fatmaPage.becomeVendorLink.click();
        ExtentReportUtils.info("User clicks on the 'Become a Vendor' link");


        // Enter an email
        Driver.getDriver().get("https://www.fakemail.net/");
        String fakeMail = fatmaPage.fakeMail.getText();
        JSUtils.flashElement(fatmaPage.fakeMail);
        System.out.println("fakeMail = " + fakeMail);
        Driver.getDriver().navigate().back();
        fatmaPage.emailInput.sendKeys(fakeMail);

        ExtentReportUtils.info("To be able to get a verification code user has to use fake mail");
        ExtentReportUtils.passAndCaptureScreenshot("User received a fake mail");

        // Enter the verification code
        fatmaPage.verificationCode.click();
        fatmaPage.passwordInput.sendKeys("");
        WaitUtils.waitForVisibility(fatmaPage.verificationCodeSentMessage,15);

        //
        Driver.getDriver().navigate().forward();
        Thread.sleep(5000);
        WaitUtils.waitForVisibility(fatmaPage.clickToFakeMail,15);
        fatmaPage.clickToFakeMail.click();
        Thread.sleep(3000);
        String fakeCode = fatmaPage.fakeCode.getText().replaceAll("\\D", "");
        JSUtils.flashElement(fatmaPage.fakeCode);
        System.out.println("fakeCode = " + fakeCode);

        ExtentReportUtils.info("To be able to receive the verification code user goes again the 'fakeMail' website");
        ExtentReportUtils.passAndCaptureScreenshot("User received the verification code");

        //
        Driver.getDriver().navigate().back();
        fatmaPage.verificationCode.sendKeys(fakeCode);


        ExtentReportUtils.passAndCaptureScreenshot("User sends the verification code to the text box");

        //Driver.getDriver().switchTo().window(alloverHandle);


        //Enter your password
        fatmaPage.passwordInput.sendKeys("Abcd.0987");
        ExtentReportUtils.info("User sends the password");


        //Retype your password
        fatmaPage.confirmPassword.sendKeys("Abcd.0987");
        ExtentReportUtils.info("User retypes the password");


        //Click on register button
        JSUtils.JSscrollIntoView(fatmaPage.registerButton);
        JSUtils.JSclickWithTimeout(fatmaPage.registerButton);
        JSUtils.flashElement(fatmaPage.registerButton);
        JSUtils.JSscrollAllTheWayUp();

        ExtentReportUtils.pass("User clicks on register button");


        //Then registration should be successful
        assertTrue(fatmaPage.setUpPage.isDisplayed());
        Driver.closeDriver();

        ExtentReportUtils.passAndCaptureScreenshot("User sees the Welcome message");
        ExtentReportUtils.flush();



    }
}
