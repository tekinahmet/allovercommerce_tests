package allovercommerce.pages.sibel;

import allovercommerce.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountHomePage {

    public MyAccountHomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(linkText="Store Manager")
    public WebElement toStoreManagerPage;
}
