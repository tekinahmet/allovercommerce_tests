package allovercommerce.pages.yasin;

import allovercommerce.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class yasinSignPage {
    public yasinSignPage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(name = "")
    public WebElement userNameBox;

    @FindBy(name = "")
    public WebElement passWordBox;

    @FindBy(name = "")
    public WebElement singIn;

    @FindBy(name = "")
    public WebElement unverifiedMessage;
}
