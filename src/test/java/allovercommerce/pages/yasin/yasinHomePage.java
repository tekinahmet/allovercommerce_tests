package allovercommerce.pages.yasin;

import allovercommerce.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class yasinHomePage {
    public yasinHomePage() {
        PageFactory.initElements(Driver.getDriver(), this);


    }

    @FindBy(name = "s")
    public WebElement searchBox;

    @FindBy(xpath = "//*[@href='https://allovercommerce.com/urun/hiphone-25/']")
    public WebElement theProduct ;


}
