package allovercommerce.tests.US16_mertcan;

import allovercommerce.pages.mertcan.MertcanPage;
import allovercommerce.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;


import static allovercommerce.utilities.WaitUtils.waitFor;

public class TC03 {
    @Test
    public void testcase3(){
        MertcanPage mertcanPage = new MertcanPage();
        Driver.getDriver().get("https://allovercommerce.com/store-manager/");
        mertcanPage.username.sendKeys("t08843732@gmail.com");
        //enter password
        mertcanPage.passwordforentrance.sendKeys("deneme1234");
        //click register
        mertcanPage.registerbut.click();
        //click store manager button
        mertcanPage.storemanagerbutton.click();
        //click products
        mertcanPage.products.click();
        //Assert that vendor in the product page
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("products"));
        //click add new button
        mertcanPage.addnewBut.click();
        //click virtual
        mertcanPage.virtual.click();
        //click downloadable
        mertcanPage.downloadable.click();
        //enter product title
        mertcanPage.title.sendKeys("Salcano");
        //enter price
        mertcanPage.price.sendKeys("200");
        //enter sale price
        mertcanPage.salePrice.sendKeys("200");
        //select categorie
        mertcanPage.bikecategory.click();
        /*upload file for product u chosed
        mertcanPage.addmedia.click();
        mertcanPage.medialibrary.click();
        JSUtils.JSclickWithTimeout(mertcanPage.bikethumbnail);
        mertcanPage.bikethumbnail.sendKeys(Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,
                Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,
                Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB);
                */
        //upload file for featured photo
        mertcanPage.featuredphoto.click();
        waitFor(2);
        mertcanPage.medialibrary.click();
        waitFor(2);
        mertcanPage.bikephoto.click();
        waitFor(2);
        mertcanPage.selectbutton.click();
        waitFor(2);
        //upload file for gallery
        mertcanPage.galeryimage.click();
        waitFor(2);
        mertcanPage.bikephotoforgallery.click();
        waitFor(2);
        mertcanPage.addtogallery.click();
        waitFor(2);
        //click downloadable
        mertcanPage.downloadablebutton.click();
        waitFor(2);
        //enter name
        mertcanPage.downloadablename.sendKeys("SALCANO BIKE");
        waitFor(2);
        //upload file
        String bike = System.getProperty("user.home")+"/Desktop/salcanobike.jpg";

        waitFor(3);
        //click on the upload button
        mertcanPage.uploadfilebutton.click();
        waitFor(2);
        mertcanPage.bikephhotoupload.click();
        waitFor(2);
        mertcanPage.selectbuttonupload.click();
        waitFor(2);
        //click submit button
        mertcanPage.getsubmitbutton.click();
        waitFor(2);
        //close driver
        Driver.closeDriver();


































    }


}
