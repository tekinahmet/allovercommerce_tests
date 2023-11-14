package allovercommerce.pages.akif;

import allovercommerce.utilities.Driver;
import allovercommerce.utilities.WaitUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllovCommerceComparePage {

    public AllovCommerceComparePage(){

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//a[text()='Chess']")
    public WebElement item1;

    @FindBy(xpath = "//a[text()='Cargo Pants']")
    public WebElement item2;

    @FindBy(xpath = "(//bdi)[1]")
    public WebElement priceItem1;

    @FindBy(xpath = "(//bdi)[2]")
    public WebElement priceItem2;

    @FindBy(xpath = "(//div[@data-title='Availability'])[1]")
    public WebElement availabilityItem1;

    @FindBy(xpath = "(//div[@data-title='Availability'])[2]")
    public WebElement availabilityItem2;

    @FindBy(xpath = "(//div[@data-title='Description'])[1]")
    public WebElement descriptionItem1;

    @FindBy(xpath = "(//div[@data-title='Description'])[2]")
    public WebElement descriptionItem2;

    @FindBy(xpath = "(//div[@data-title='Ratings & Reviews'])[1]")
    public WebElement reviewItem1;

    @FindBy(xpath = "(//div[@data-title='Ratings & Reviews'])[2]")
    public WebElement reviewItem2;

    @FindBy(xpath = "(//a[@title='To Right'])[1]")
    public WebElement rightArrow1;

    @FindBy(xpath = "(//a[@title='To Right'])[2]")
    public WebElement rightArrow2;

    @FindBy(xpath = "(//a[@title='To Left'])[1]")
    public WebElement leftArrow1;

    @FindBy(xpath = "(//a[@title='To Left'])[2]")
    public WebElement leftArrow2;

    @FindBy(xpath = "(//a[@class='compare-action remove_from_compare'])[1]")
    public WebElement removeItem1;

    @FindBy(xpath = "(//a[@class='compare-action remove_from_compare'])[2]")
    public WebElement removeItem2;

    @FindBy(xpath = "//h2[text()='No products added to the compare']")
    public WebElement noProductsMessage;


}
