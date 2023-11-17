package allovercommerce.pages.asuman;

import allovercommerce.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Asu_WishlistPage {

    public Asu_WishlistPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//i[@class='w-icon-heart']")
    public WebElement wishlistButtonOnPage;
    @FindBy(xpath="//h2[@class='page-title']")
    public  WebElement pageTitleWishlist;

    @FindBy(xpath="//*[@id=\"yith-wcwl-row-21379\"]/td[5]/div/button")
    public  WebElement quickView;

    @FindBy(xpath="//*[@id=\"product-21379\"]/div[2]/div/div[1]/div/span[1]/a")
    public  WebElement category;
    /*
    1. Go to homepage	https://allovercommerce.com
2. Click on wishlist button
3. Verify that page title "Wishlist" is visible
4. Verify that selected products are visible on the wishlist page
     */
}
