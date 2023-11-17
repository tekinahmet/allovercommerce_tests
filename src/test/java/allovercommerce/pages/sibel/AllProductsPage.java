package allovercommerce.pages.sibel;

import allovercommerce.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllProductsPage {


        public AllProductsPage(){
            PageFactory.initElements(Driver.getDriver(),this);
        }


    @FindBy(id="add_new_product_dashboard")
    public WebElement newProductButton;
}
