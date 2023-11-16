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
        @FindBy(xpath = "//span[@class='text'][1]")
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
        @FindBy(xpath ="//input[@id='passoword']")
        public WebElement password;
        @FindBy(id = "confirm_pwd")
        public WebElement confrmpwd;
        @FindBy(xpath = "//input[@name='save-data']")
        public WebElement regBut;
        @FindBy(xpath ="//div[@class='wcfm-message email_verification_message wcfm-success']")
        public WebElement verifycodesentmessage;
        @FindBy(xpath ="//input[@placeholder='Verification Code']")
        public WebElement verifyCode;
        @FindBy(xpath = "(//*[text()='Allover Commerce '])[1]")
        public WebElement GetVerCode;
        @FindBy(xpath ="//span[@id='email']")
        public WebElement fakeMail;
        @FindBy(xpath ="//span[@id='predmet']")
        public WebElement fakeCode;
        @FindBy(xpath ="//tr[@data-href='2'][1]")
        public WebElement clickToFakeMail;
        @FindBy(xpath = "//a[@href='https://allovercommerce.com/store-manager/']")
        public WebElement nrnbutton;
}




