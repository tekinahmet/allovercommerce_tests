package allovercommerce.pages.oguzhan;

import allovercommerce.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Oguzhan_VendorBillingPage {
    public Oguzhan_VendorBillingPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(id = "billing_first_name")
    public WebElement billingFirstName;
    @FindBy(id="billing_last_name")
    public WebElement billingLastName;
    @FindBy(id="billing_company")
    public WebElement companyName;

    @FindBy(xpath = "(//span[@class='select2-selection__arrow'])[1]")
    public WebElement countryArrow;

    @FindBy(xpath = "//input[@class='select2-search__field']")
    public WebElement countrySearch;

    // Check the locators and code for the line 85-87 on TC01
//    @FindBy(xpath = "(//span[@class='select2-selection__arrow'])[2]")
//    public WebElement stateArrow;
//    @FindBy(xpath = "//input[@class='select2-search__field']")
//    public WebElement stateSearch;

    @FindBy(id="billing_address_1")
    public WebElement streetAddress;

    @FindBy(id="billing_address_2")
    public WebElement StreetAddress2;

    @FindBy(id = "billing_city")
    public WebElement billingCity;

    @FindBy(id="billing_phone")
    public WebElement phoneNumber;

    @FindBy(id="billing_postcode")
    public WebElement ZipCode;

    @FindBy(id="billing_email")
    public WebElement emailAddress;

    @FindBy(id="order_comments")
    public WebElement orderNote;

    @FindBy(id="payment_method_cod")
    public WebElement payAtTheDoor;

    @FindBy(id="payment_method_bacs")
    public WebElement wireTransfer;

    @FindBy(xpath = "//tr[@class='order-total']\n")
    public WebElement totalAmount;

    @FindBy(xpath = "//button[@id='place_order']") //!!!
    public WebElement placeOrder;

    @FindBy(xpath = "//i[@class='fas fa-check']")
    public WebElement orderCompleteText;

    @FindBy(xpath = "//a[@href='/my-account-2/orders/']\n")
    public WebElement shoppingDetails;

    @FindBy(xpath = "//select[@id='billing_state']")
    public WebElement state;

    @FindBy(xpath = "//i[@class='w-icon-cart']\n")
    public WebElement cart2;

    @FindBy(xpath = "//tbody/tr[1]/td[5]/a[1]")
    public WebElement viewOrder;

    @FindBy(xpath = "//h2[contains(text(),'Order details')]")
    public WebElement orderDetails;

}

