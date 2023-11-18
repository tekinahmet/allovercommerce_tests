package allovercommerce.tests.US16_mertcan;

import allovercommerce.pages.mertcan.MertcanPage;
import allovercommerce.utilities.Driver;
import allovercommerce.utilities.WaitUtils;
import com.github.javafaker.Faker;
import org.testng.annotations.Test;


public class TC01 {

    @Test
    public void testcase1() throws InterruptedException {
        MertcanPage mertcanPage = new MertcanPage();
        Faker faker = new Faker();

        // Go to https://allovercommerce.com/
        Driver.getDriver().get("https://allovercommerce.com/");
        Thread.sleep(3000);

        //Click on "Register" button
        mertcanPage.regLink.click();
        //Click on "Become a Vendor"
        mertcanPage.SignAsVenLink.click();
        Thread.sleep(3000);
        // Enter an email
        Driver.getDriver().get("https://www.fakemail.net/");
        String fakeMail = mertcanPage.fakeMail.getText();
        System.out.println("fakeMail = " + fakeMail);
        Driver.getDriver().navigate().back();
        mertcanPage.email.sendKeys(fakeMail);
        Thread.sleep(3000);

        // Enter the verification code
        mertcanPage.verifyCode.click();
        mertcanPage.password.sendKeys("");
        WaitUtils.waitForVisibility(mertcanPage.verifycodesentmessage,10);
        Driver.getDriver().navigate().forward();
        Thread.sleep(5000);
        WaitUtils.waitForVisibility(mertcanPage.clickToFakeMail,10);
        mertcanPage.clickToFakeMail.click();
        String fakeCode = mertcanPage.fakeCode.getText().replaceAll("\\D", "");

        Driver.getDriver().navigate().back();
        mertcanPage.verifyCode.sendKeys(fakeCode);

        //Enter your password
        mertcanPage.password.sendKeys("deneme1234");
        Thread.sleep(3000);

        //Retype your password
        mertcanPage.confrmpwd.sendKeys("deneme1234");
        Thread.sleep(3000);
        //Click on register button
        mertcanPage.regBut.click();
        Thread.sleep(3000);
        //Skip Welcome to Allover Commerce Text
        mertcanPage.nrnbutton.click();
        Thread.sleep(3000);
        //close driver
        Driver.closeDriver();



        }
}
