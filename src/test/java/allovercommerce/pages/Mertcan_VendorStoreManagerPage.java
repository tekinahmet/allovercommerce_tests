package allovercommerce.pages;

import allovercommerce.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Mertcan_VendorStoreManagerPage {
    public Mertcan_VendorStoreManagerPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//span[@class='text'][1]")
    public WebElement productsButton;
    @FindBy(xpath = "//span[.='Add New']")
    public WebElement addnewButton;
    @FindBy(id = "is_virtual")
    public WebElement virtualButton;
    @FindBy(id = "is_downloadable")
    public WebElement downloadableButton;
    @FindBy(id = "pro_title")
    public WebElement title;
    @FindBy(id = "regular_price")
    public WebElement price;
    @FindBy(id = "sale_price")
    public WebElement salePrice;

}

