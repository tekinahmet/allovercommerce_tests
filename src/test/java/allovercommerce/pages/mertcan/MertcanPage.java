package allovercommerce.pages.mertcan;

import allovercommerce.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MertcanPage {
        public MertcanPage(){
            PageFactory.initElements(Driver.getDriver(),this);
        }
        @FindBy(xpath = "//span[.='Register']")
        public WebElement regLink;
        @FindBy(xpath = "//a[.='Signup as a vendor?']")
        public  WebElement SignAsVenLink;
        @FindBy(id = "confirm_pwd")
        public WebElement confrmpwd;
        @FindBy(xpath = "//*[@id='passoword']")
        public  WebElement password;
        @FindBy(xpath = "//input[@name='save-data']")
        public WebElement regBut;
        @FindBy(xpath ="//div[@class='wcfm-message email_verification_message wcfm-success']")
        public WebElement verifycodesentmessage;
        @FindBy(xpath ="//input[@placeholder='Verification Code']")
        public WebElement verifyCode;
        @FindBy(xpath ="//span[@id='email']")
        public WebElement fakeMail;
        @FindBy(xpath ="//span[@id='predmet']")
        public WebElement fakeCode;
        @FindBy(xpath ="//tr[@data-href='2'][1]")
        public WebElement clickToFakeMail;
        @FindBy(xpath = "//a[@href='https://allovercommerce.com/store-manager/']")
        public WebElement nrnbutton;
        @FindBy(id = "username")
        public WebElement username;
        @FindBy(xpath = "//button[.='Sign In']")
        public WebElement registerbutton;
        @FindBy(xpath = "//a[.='Store Manager']")
        public WebElement storemanagerbutton;
        @FindBy(xpath = "(//a[@class='wcfm_menu_item '])[5]")
        public WebElement couponsbut;
        @FindBy(xpath = "//span[.='Add New']")
        public WebElement addnewtc3;
        @FindBy(xpath = "//input[@id='title']")
        public WebElement codefortest;
        @FindBy(xpath = "//*[@id='coupon_amount']")
        public WebElement couponamount;
        @FindBy(xpath = "//input[@id='free_shipping']")
        public WebElement allowfreeshipping;
        @FindBy(xpath = "//input[@id='show_on_store']")
        public WebElement showonstore;
        @FindBy(xpath = "//input[@id='wcfm_coupon_manager_submit_button']")
        public WebElement submitbutton;
        @FindBy(xpath = "//*[@id='username']")
        public WebElement usernameforentrance;
        @FindBy(xpath = "//*[@id='password']")
        public WebElement passwordforentrance;
        @FindBy(xpath = "//*[@name='login']")
        public WebElement registerbut;
        @FindBy(xpath = "(//div//a//span[@class='text'])[4]")
        public WebElement products;
        @FindBy(xpath = "//span[.='Add New']")
        public WebElement addnewBut;
        @FindBy(id = "is_virtual")
        public WebElement virtual;
        @FindBy(id = "is_downloadable")
        public WebElement downloadable;
        @FindBy(id = "pro_title")
        public WebElement title;
        @FindBy(id = "regular_price")
        public WebElement price;
        @FindBy(id = "sale_price")
        public WebElement salePrice;
        @FindBy(id = "user_email")
        public WebElement email;
        @FindBy(xpath = "//*[@id='expiry_date']")
        public  WebElement expirydate;
        @FindBy(xpath = "(//*[@value='769'])[1]")
        public  WebElement bikecategory;
        @FindBy(xpath = "//*[@id='wcfm_products_simple_submit_button']")
        public  WebElement getsubmitbutton;
        @FindBy(xpath = "//*[@id='featured_img_display']")
        public  WebElement featuredphoto;
        @FindBy(xpath = "//*[@id='menu-item-browse']")
        public  WebElement medialibrary;
        @FindBy(xpath = "//*[@class='thumbnail']")
        public  WebElement bikephoto;
        @FindBy(xpath = "(//*[.='Select'])[4]")
        public  WebElement selectbutton;
        @FindBy(xpath = "(//*[@class='button insert-media add_media'])[1]")
        public WebElement addmediabutton;
        @FindBy(xpath = "(//*[@id='menu-item-browse'])[2]")
        public  WebElement medialibraryforgallery;
        @FindBy(xpath = "(//*[@class='thumbnail'])[2]")
        public  WebElement bikephotoforgallery;
        @FindBy(xpath = "(//*[.='Insert into post'])[2]")
        public  WebElement inserintopost;
        @FindBy(xpath = "//*[@id='excerpt_ifr']")
        public WebElement fordescription;
        @FindBy(xpath = "//*[@id='gallery_img_gimage_0_display']")
        public WebElement galeryimage;
        @FindBy(xpath ="(//*[.='Add to Gallery'])[9]")
        public WebElement addtogallery;
        @FindBy(xpath = "//*[@id='product_tags']")
        public WebElement tag;
        @FindBy(xpath = "(//*[.='Downloadable'])[3]")
        public WebElement downloadablebutton;
        @FindBy(xpath = "//*[@id='downloadable_files_name_0']")
        public WebElement downloadablename;
        @FindBy(xpath = "//*[@id='downloadable_files_file_0_button']")
        public WebElement uploadfilebutton;
        @FindBy(xpath = "(//*[@class='thumbnail'])[3]")
        public WebElement bikephhotoupload;
        @FindBy(xpath ="(//*[.='Select'])[8]")
        public WebElement selectbuttonupload;


}




