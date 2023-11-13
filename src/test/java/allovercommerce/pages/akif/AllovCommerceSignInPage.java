package allovercommerce.pages.akif;

import allovercommerce.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllovCommerceSignInPage {

    public AllovCommerceSignInPage(){

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(id = "username")
    public WebElement userName;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(name = "login")
    public WebElement loginButton;

}
