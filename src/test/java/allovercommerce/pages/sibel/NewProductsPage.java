package allovercommerce.pages.sibel;

import allovercommerce.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewProductsPage {

    public NewProductsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "product_type")
    public WebElement product_type;
    @FindBy(id = "featured_img_display")
    public WebElement addMedia;
    @FindBy(id="__wp-uploader-id-1")
    public WebElement selectFiles;
    @FindBy(id ="pro_title")
    public WebElement productTitle;

    @FindBy(id = "tinymce")
    public WebElement productDescription;

    @FindBy(xpath = "//input[@value='707']")
    public WebElement bananaCheckbox;
    @FindBy(xpath = "//p[.='+Add new category']")
    public WebElement addNewCategory;
    @FindBy(id = "wcfm_new_cat")
    public WebElement categoryNameAdd;
    @FindBy(id = "wcfm_new_parent_cat")
    public WebElement selectParentCategory;
    @FindBy(id = "product_cats_checklist")
    public WebElement allCategories;
    @FindBy(xpath = "//button[.='Add']")
    public WebElement addCategoryButton;


    @FindBy(xpath = "//input[@value='335']")
    public WebElement brandAckCheckbox;

    @FindBy(xpath = "//p[.='+Add new Product brands']")
    public WebElement addNewBrand;

    @FindBy(xpath = "//input[@id='wcfm_new_product_brand']")
    public WebElement newBrandName;

    @FindBy(id = "wcfm_new_parent_product_brand")
    public WebElement parentTaxonomy;

    @FindBy(xpath = "//button[@data-taxonomy='product_brand']")
    public WebElement addBrandButton;

    @FindBy(xpath = "//input[@class='wcfm-checkbox']")
    public WebElement newBrandCheckBox;

    @FindBy(xpath = "//input[@class='wcfm-checkbox']")
    public WebElement newCatCheckbox;






}
