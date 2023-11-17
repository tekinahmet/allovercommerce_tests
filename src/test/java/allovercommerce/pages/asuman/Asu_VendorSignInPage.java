package allovercommerce.pages.asuman;

import allovercommerce.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Asu_VendorSignInPage {
    public Asu_VendorSignInPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath= "/html/body/div[1]/div[1]/div/div/h2")
    public WebElement myAccountisVisible;

    @FindBy(xpath="//span[text()='Sign Out']")
    public  WebElement signOutButton;
}

