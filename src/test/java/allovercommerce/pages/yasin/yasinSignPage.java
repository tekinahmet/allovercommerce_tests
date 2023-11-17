package allovercommerce.pages.yasin;

import allovercommerce.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class yasinSignPage {
    public yasinSignPage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//input[@autocomplete='username']")
    public WebElement userNameBox;

    @FindBy(xpath = "//input[@autocomplete='current-password']")
    public WebElement passWordBox;

    @FindBy(xpath = "//*[@value='Sign In']")
    public WebElement singInAsUserButton;

    @FindBy(xpath = "//*[@class='submit-status']")
    public WebElement unverifiedMessage;
}
