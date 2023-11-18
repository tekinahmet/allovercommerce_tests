package allovercommerce.tests.US18_mertcan;

import allovercommerce.pages.mertcan.MertcanPage;
import allovercommerce.utilities.Driver;
import allovercommerce.utilities.JSUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.security.Key;

public class TC02 {
    @Test
    public void testcase2(){
        MertcanPage mertcanPage = new MertcanPage();
        //navigate to ("https://allovercommerce.com/store-manager/");
        Driver.getDriver().get("https://allovercommerce.com/store-manager/");
        //enter mail
        mertcanPage.username.sendKeys("t08843732@gmail.com");
        //enter password
        mertcanPage.passwordforentrance.sendKeys("deneme1234");
        //click register
        mertcanPage.registerbut.click();
        //click store manager button
        mertcanPage.storemanagerbutton.click();
        //click coupon
        mertcanPage.couponsbut.click();
        //click add new
        mertcanPage.addnewtc3.click();
        //enter code and enter description
        mertcanPage.codefortest.sendKeys("TESTERCODE129319239", Keys.TAB,"this code for test",Keys.TAB,Keys.ARROW_DOWN,Keys.ENTER,Keys.TAB);
        JSUtils.JSclickWithTimeout(mertcanPage.couponamount);
        //enter coupon amount
        mertcanPage.couponamount.sendKeys("5",Keys.TAB);
        //enter expiry date
        mertcanPage.expirydate.sendKeys("2024-12-30",Keys.TAB);
        //click allow free shipping
        mertcanPage.allowfreeshipping.click();
        //click show on store
        mertcanPage.showonstore.click();
        //click submit button
        mertcanPage.submitbutton.click();































    }
}
