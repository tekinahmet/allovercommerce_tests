package allovercommerce.pages.zeynep;

import allovercommerce.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Zeynep_AddressesPage {

    public Zeynep_AddressesPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@id=\"main\"]/div/div/div/div/div/div/div/div[3]/div[1]/div/a")
    public WebElement editBillingAddress;

    @FindBy(id = "billing_address_1")
    public WebElement street;

    @FindBy(id = "billing_city")
    public WebElement town;

    @FindBy(id = "billing_postcode")
    public WebElement zipcode;

    @FindBy(id = "billing_phone")
    public WebElement phoneNumber;

    @FindBy(name = "save_address")
    public WebElement saveAddress;

    //@FindBy(xpath = "//*[@id=\"select2-billing_country-container\"]/span")
    //public WebElement country;
    @FindBy(xpath = "(//span[@class='select2-selection__arrow'])[1]")
    public WebElement country1;

    @FindBy(xpath = "//input[@class='select2-search__field']")
    public WebElement country2;

    @FindBy(id = "//*[@id=\"billing_state_field\"]/span/span/span[1]/span/span[2]")
    public WebElement state1;

    @FindBy(id = "select2-billing_state-container")
    public WebElement state2;



}
