package allovercommerce.pages.sibel;

import allovercommerce.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StoreManagerHomePage {

    public StoreManagerHomePage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(linkText = "Products")
    public WebElement productLink;

}
