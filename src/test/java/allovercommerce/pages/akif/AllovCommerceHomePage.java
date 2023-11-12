package allovercommerce.pages.akif;

import allovercommerce.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllovCommerceHomePage {

    public AllovCommerceHomePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@class='login logout inline-type']")
    public WebElement signOutButton;

    @FindBy(name = "s")
    public WebElement searchBox;

    @FindBy(xpath = "(//button[@class='btn btn-search'])[1]")
    public WebElement searchButton;
}
