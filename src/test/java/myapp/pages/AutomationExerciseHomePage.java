package myapp.pages;

import myapp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AutomationExerciseHomePage {

    public AutomationExerciseHomePage() {

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//a[.=' Home']")
    public WebElement homePageLink;
    @FindBy(xpath = "//a[.=' Signup / Login']")
    public WebElement signupLoginButton;
    @FindBy(xpath = "//h2[.='Category']")
    public WebElement category;
    @FindBy(xpath = "//a[@href='#Women']")
    public WebElement womenCategory;
    @FindBy(xpath = "//a[@href='/category_products/1']")
    public WebElement dress;
    @FindBy(xpath = "//a[@href='/products']")
    public WebElement products;
}
