package allovercommerce.pages.asuman;

import allovercommerce.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Asu_CartPage {

    public  Asu_CartPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id=\"product-21379\"]/div[2]/div/form/div/div/div/button")
    public  WebElement cartButton1;

    @FindBy(xpath="//*[@id=\"product-14671\"]/div[2]/div/form/div/div/div/button")
    public  WebElement cartButton2;

    @FindBy(xpath="//*[@id=\"header\"]/div/div/div/div/div/div[6]/div/div/a/i")
    public  WebElement pageCartButton;

    @FindBy(xpath="//*[@id=\"header\"]/div/div/div/div/div/div[6]/div/div/div[2]/div/p[2]/a[2]")
    public  WebElement checkOutButton;

    @FindBy(xpath="/html/body/div[1]/div[1]/div/ul/li[2]/a")
    public WebElement checkOutVerif;


}
