package allovercommerce.pages.akif;

import allovercommerce.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllovCommerceItemPage {

    public AllovCommerceItemPage(){

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "(//a[@class='compare btn-product-icon'])[1]")
    public WebElement compareButton;

    @FindBy(xpath = "//div[@class='compare-popup show']")
    public WebElement compareConsole;

    @FindBy(xpath = "//img[@src='https://allovercommerce.com/wp-content/uploads/2023/02/chess_image-27-300x300.webp']")
    public  WebElement imageItem1;

    @FindBy(xpath = "//img[@src='https://allovercommerce.com/wp-content/uploads/2023/09/16608119445a0eed4d43fed1f9c55877d207667dff_thumbnail_600x-300x300.webp']")
    public WebElement imageItem2;

    @FindBy(xpath = "//a[text()='Start Compare !']")
    public WebElement startCompareButton;



}
