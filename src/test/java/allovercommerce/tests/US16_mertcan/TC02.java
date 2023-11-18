package allovercommerce.tests.US16_mertcan;

import allovercommerce.pages.mertcan.MertcanPage;
import allovercommerce.utilities.Driver;
import com.github.javafaker.Faker;

import org.testng.Assert;
import org.testng.annotations.Test;



public class TC02 {
    @Test
    public void testcase2(){
        MertcanPage mertcanPage = new MertcanPage();
        Faker faker = new Faker();

        //user should go to https://allovercommerce.com/store-manager/
        Driver.getDriver().get("https://allovercommerce.com/store-manager/");
        //enter username
        mertcanPage.username.sendKeys("t08843732@gmail.com");
        //enter password
        mertcanPage.passwordforentrance.sendKeys("deneme1234");
        //click register
        mertcanPage.registerbutton.click();
        //click store manager button
        mertcanPage.storemanagerbutton.click();
        //click products
        mertcanPage.products.click();
        //Assert that vendor in the product page
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("products"));
        //click add new button
        mertcanPage.addnewBut.click();
        //simple product must be seen as default option
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("products-manage"));
    }





















}
