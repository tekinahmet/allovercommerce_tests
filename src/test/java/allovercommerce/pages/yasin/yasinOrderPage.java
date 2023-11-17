package allovercommerce.pages.yasin;

import allovercommerce.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class yasinOrderPage {
    public yasinOrderPage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(name = "billing_first_name")
    public WebElement billingFirstName;

    @FindBy(name = "billing_last_name")
    public WebElement billingLastName;

    @FindBy(name = "billing_email")
    public WebElement billingEmail;

    @FindBy(id = "select2-billing_country-container")
    public WebElement billingCountry;

    @FindBy(name = "billing_address_1")
    public WebElement billingStreet;
    @FindBy(id="payment_method_cod")
    public WebElement payAtTheDoor;

    @FindBy(id="payment_method_bacs")
    public WebElement wireTransfer;

    @FindBy(id="place_order")
    public WebElement placeOrderButton;

    @FindBy(xpath = "//*[@class='fas fa-check']")
    public WebElement orderCompleteText;
}

