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

    @FindBy(xpath = "//*[@class='attachment-woocommerce_thumbnail size-woocommerce_thumbnail']")
    public WebElement theProduct ;


}
