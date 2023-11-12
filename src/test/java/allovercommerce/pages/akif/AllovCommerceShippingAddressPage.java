package allovercommerce.pages.akif;

import allovercommerce.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllovCommerceShippingAddressPage {

    public AllovCommerceShippingAddressPage(){

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//h3[text()='Shipping address']")
    public WebElement pageHeader;

    @FindBy(id = "shipping_first_name")
    public WebElement firstName;

    @FindBy(id = "shipping_last_name")
    public WebElement lastName;

    @FindBy(id = "shipping_company")
    public WebElement company;

    @FindBy(xpath = "(//span[@class='select2-selection__arrow'])[1]")
    public WebElement countryArrow;

    @FindBy(xpath = "//input[@class='select2-search__field']")
    public WebElement countrySearch;

    @FindBy(id = "shipping_address_1")
    public WebElement street;

    @FindBy(id = "shipping_address_2")
    public WebElement apartment;

    @FindBy(id = "shipping_city")
    public  WebElement city;

    @FindBy(xpath = "(//span[@class='select2-selection__arrow'])[2]")
    public WebElement stateArrow;

    @FindBy(xpath = "//input[@class='select2-search__field']")
    public WebElement stateSearch;

    @FindBy(id = "shipping_postcode")
    public WebElement postCode;

    @FindBy(xpath = "//button[@name='save_address']")
    public WebElement saveButton;




}
