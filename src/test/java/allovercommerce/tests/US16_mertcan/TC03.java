package allovercommerce.tests.US16_mertcan;

import allovercommerce.pages.Mertcan_HomePage;
import allovercommerce.pages.Mertcan_RegistrationPage;
import allovercommerce.pages.Mertcan_VendorStoreManagerPage;
import allovercommerce.utilities.Driver;
import allovercommerce.utilities.WaitUtils;
import com.github.javafaker.Faker;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC03 {
    @Test
    public void testcase3(){
        Mertcan_VendorStoreManagerPage mertcanVendorStoreManagerPage = new Mertcan_VendorStoreManagerPage();
        Mertcan_HomePage mertcanHomePage = new Mertcan_HomePage();
        Mertcan_RegistrationPage mertcanRegistrationPage = new Mertcan_RegistrationPage();
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
        //assert that vendor at home page
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("https://allovercommerce.com/store-manager/"));
        WaitUtils.waitFor(1);
        //click products button
        mertcanVendorStoreManagerPage.productsButton.click();
        WaitUtils.waitFor(1);
        //click add new button
        mertcanVendorStoreManagerPage.addnewButton.click();
        WaitUtils.waitFor(1);
        //assert that simple product as default option
        Assert.assertTrue(Driver.getDriver().getTitle().contains("//option[.='Simple Product']"));
        //click virtual
        mertcanVendorStoreManagerPage.virtualButton.click();
        //click downloadable button
        mertcanVendorStoreManagerPage.downloadableButton.click();
        //enter product title
        mertcanVendorStoreManagerPage.title.sendKeys("apple");
        //enter price
        mertcanVendorStoreManagerPage.price.sendKeys("999");
        //enter sale price
        mertcanVendorStoreManagerPage.salePrice.sendKeys("999");

    }
}
