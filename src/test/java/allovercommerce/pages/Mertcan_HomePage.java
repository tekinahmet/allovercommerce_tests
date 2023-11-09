package allovercommerce.pages;

import allovercommerce.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Mertcan_HomePage {
    public Mertcan_HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//span[.='Register']")
    public  WebElement RegisterButton;
    @FindBy(xpath = "//a[.='Signup as a vendor?']")
    public  WebElement SignupAsaVendorButton;

}
