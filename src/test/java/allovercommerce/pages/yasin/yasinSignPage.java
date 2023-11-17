package allovercommerce.pages.yasin;

import allovercommerce.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class yasinSignPage {
    public yasinSignPage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//label[@for='username']")
    public WebElement userNameBox;

    @FindBy(xpath = "//label[@for='password']")
    public WebElement passWordBox;

    @FindBy(name = "//*[@class='woocommerce-button button woocommerce-form-login__submit']")
    public WebElement singInAsUserButton;

    @FindBy(xpath = "//*[@class='submit-status']")
    public WebElement unverifiedMessage;
}
