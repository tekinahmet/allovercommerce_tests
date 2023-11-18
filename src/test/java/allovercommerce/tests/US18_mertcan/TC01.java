
package allovercommerce.tests.US18_mertcan;

import allovercommerce.utilities.JSUtils;
import org.checkerframework.checker.units.qual.K;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import allovercommerce.pages.mertcan.MertcanPage;
import allovercommerce.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.security.Key;

import static allovercommerce.utilities.WaitUtils.*;

public class TC01 {
    @Test
    public void testcase1(){
        MertcanPage mertcanPage = new MertcanPage();

        Driver.getDriver().get("https://allovercommerce.com/store-manager/");
        //enter mail
        mertcanPage.username.sendKeys("t08843732@gmail.com");
        //enter password
        mertcanPage.passwordforentrance.sendKeys("deneme1234");
        //click register
        mertcanPage.registerbut.click();

    }




}

