package myapp.pages;

import com.google.j2objc.annotations.Weak;
import myapp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutomationExerciseProductsPage {
    public AutomationExerciseProductsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//h2[.='Women - Dress Products']")
    public WebElement womenProductTitle;
    @FindBy(xpath = "//a[@href='#Men']")
    public WebElement menCategory;
    @FindBy(xpath = "//a[@href='/category_products/6']")
    public WebElement menSubCategory;
    @FindBy(xpath = "//h2[.='Men - Jeans Products'] ")
    public WebElement menProductTitle;
    @FindBy(xpath = "//h2[.='Brands']")
    public WebElement brands;
    @FindBy(xpath = "//a[@href='/brand_products/H&M']")
    public WebElement clickAnyProduct;
    @FindBy(xpath = "//h2[.='Brand - H&M Products']")
    public WebElement verifyBrand;
    @FindBy(xpath = "//a[@href='/brand_products/Babyhug']")
    public WebElement anotherBrand;
    @FindBy(xpath = "//h2[.='Brand - Babyhug Products']")
    public WebElement verifyBabyHug;
}