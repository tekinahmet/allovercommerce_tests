package allovercommerce.pages;

import allovercommerce.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ahmet_MyAccountPage {
    public Ahmet_MyAccountPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//span[.='Sign Out']")
    public WebElement signOut;
    @FindBy(linkText = "Log out")
    public WebElement logOut;
    @FindBy(xpath = "//li[.='My Account']")
    public WebElement verifyLogout;
}
