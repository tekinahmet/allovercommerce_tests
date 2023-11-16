package allovercommerce.tests.US05_zeynep;

import allovercommerce.pages.zeynep.Zeynep_AccountDetailsPage;
import allovercommerce.pages.zeynep.Zeynep_SignInPage;
import allovercommerce.utilities.Driver;
import allovercommerce.utilities.JSUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class US05_TC04 {
    //User should be able to change password
    //Go to webpage
    //Click on My Account
    //Click on Account Details
    //Click current password blank and Enter current password
    //Click new password blank and Enter new password
    //Click confirm password blank and Enter new password again
    //Click on SAVE CHANGES button
    //Verify that password has been changed
    Zeynep_SignInPage zeynepSignInPage = new Zeynep_SignInPage();
    Zeynep_AccountDetailsPage zeynepAccountDetailsPage = new Zeynep_AccountDetailsPage();


    @Test
    public void US05_TC02() {

        //Go to webpage
        Driver.getDriver().get("https://allovercommerce.com/");
        zeynepSignInPage.signInButton.click();
        zeynepSignInPage.userName.sendKeys("zeynepsguler4");
        zeynepSignInPage.password.sendKeys("123zeynep");
        zeynepSignInPage.signInButton2.click();
        //Click on My Account
        JSUtils.JSclickWithTimeout(zeynepSignInPage.myAccount);
        //Click on Account Details
        JSUtils.JSclickWithTimeout(zeynepSignInPage.accountDetailsButton);

        //Click current password blank and Enter current password
        zeynepAccountDetailsPage.currentPassword.sendKeys("123zeynep");

        //Click new password blank and Enter new password
        zeynepAccountDetailsPage.newPassword1.sendKeys("1234zeynep");

        //Click confirm password blank and Enter new password again
        zeynepAccountDetailsPage.confirmPassword.sendKeys("1234zeynep");

        //Click on SAVE CHANGES button
        JSUtils.JSclickWithTimeout(zeynepAccountDetailsPage.saveChangesButton);

        //Verify that password has been changed
        Assert.assertTrue(zeynepAccountDetailsPage.verifyMessage.isDisplayed());
    }
}
