package allovercommerce.tests.US16_mertcan;

import allovercommerce.pages.Mertcan_HomePage;
import allovercommerce.pages.Mertcan_RegistrationPage;
import allovercommerce.utilities.Driver;
import allovercommerce.utilities.WaitUtils;
import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class TC01 {

        @Test
        public void testcase1(){
            Mertcan_RegistrationPage mertcanRegistrationPage = new Mertcan_RegistrationPage();
            Mertcan_HomePage mertcanHomePage = new Mertcan_HomePage();
            Faker faker = new Faker();

            //navigate to homepage
            Driver.getDriver().get("https://allovercommerce.com/");
            WaitUtils.waitFor(1);
            //click on register button
            mertcanHomePage.RegisterButton.click();
            WaitUtils.waitFor(1);
            //click sign up as a vendor
            mertcanHomePage.SignupAsaVendorButton.click();
            WaitUtils.waitFor(1);
            //enter email
            mertcanRegistrationPage.email.sendKeys(faker.internet().emailAddress());
            WaitUtils.waitFor(1);
            Driver.getDriver().navigate().refresh();
            WaitUtils.waitFor(1);
            //enter password
            mertcanRegistrationPage.password.sendKeys(faker.internet().password());
            WaitUtils.waitFor(1);
            //re enter password
            mertcanRegistrationPage.password.sendKeys(faker.internet().password());
            WaitUtils.waitFor(1);
            mertcanRegistrationPage.registerButton.click();
            WaitUtils.waitFor(1);




        }
}
