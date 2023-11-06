package myapp.pages;

import myapp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TechproHomePage {
    public TechproHomePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(partialLinkText = "Logout")
    public WebElement logOut;

    public void homeLogoutButton(){
        logOut.click();
    }
}
