package allovercommerce.tests.US05_zeynep;

import allovercommerce.pages.zeynep.Zeynep_AccountDetailsPage;
import allovercommerce.pages.zeynep.Zeynep_SignInPage;
import allovercommerce.utilities.Driver;
import allovercommerce.utilities.JSUtils;
import org.testng.annotations.Test;

public class US05_TC03 {

    Zeynep_SignInPage zeynepSignInPage = new Zeynep_SignInPage();
    Zeynep_AccountDetailsPage zeynepAccountDetailsPage = new Zeynep_AccountDetailsPage();

    @Test
    public void US05_TC02() {

        //User should be able to fill in the Biography section
        //Go to webpage
        //Click on My Account
        //Click on Account Details
        //Enter text in Biography field
        //Click on SAVE CHANGES button
        //Verify that biography has been changed


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

        //Enter text in Biography field
        //zeynepAccountDetailsPage.biography1.click();
        //zeynepAccountDetailsPage.biography2.sendKeys("ABcdefg123546");

        //Click on SAVE CHANGES button
        JSUtils.JSclickWithTimeout(zeynepAccountDetailsPage.saveChangesButton);

        //Verify that biography has been changed



    }
}
