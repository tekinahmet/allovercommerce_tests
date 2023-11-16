package allovercommerce.pages.akif;

import allovercommerce.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllovCommerceDefaultPage {

    public AllovCommerceDefaultPage(){

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//a[@class='login inline-type']")
    public WebElement signinButton;

    @FindBy(name = "s")
    public WebElement searchBox;



}
