package allovercommerce.pages.yasin;

import allovercommerce.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class yasinOrderPage {
    public yasinOrderPage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(name = "")
    public WebElement billingFirstName;

    @FindBy(name = "")
    public WebElement billingLastName;

    @FindBy(name = "")
    public WebElement userNameBox;

    @FindBy(name = "")
    public WebElement billingEmail;

    @FindBy(name = "")
    public WebElement billingCountry;

    @FindBy(name = "")
    public WebElement billingStreet;
    @FindBy(id="payment_method_cod")
    public WebElement payAtTheDoor;

    @FindBy(id="payment_method_bacs")
    public WebElement wireTransfer;

    @FindBy(id="")
    public WebElement placeOrderButton;

    @FindBy(id="")
    public WebElement orderCompleteText;
}

