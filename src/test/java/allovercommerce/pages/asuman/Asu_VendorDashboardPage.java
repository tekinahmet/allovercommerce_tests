package allovercommerce.pages.asuman;

import allovercommerce.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Asu_VendorDashboardPage {

    public Asu_VendorDashboardPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath="//*[@id=\"main\"]/div/div/div/div/div/div/nav/ul/li[1]/a")
    public WebElement dashboardMenu;

    @FindBy(xpath="//*[@id=\"main\"]/div/div/div/div/div/div/nav/ul/li[2]/a")
    public  WebElement storeManagerMenu;

    @FindBy(xpath="//*[@id=\"main\"]/div/div/div/div/div/div/nav/ul/li[3]/a")
    public  WebElement ordersMenu;

    @FindBy(xpath="//*[@id=\"main\"]/div/div/div/div/div/div/nav/ul/li[4]/a")
    public  WebElement downloadsMenu;

    @FindBy(xpath="//*[@id=\"main\"]/div/div/div/div/div/div/nav/ul/li[5]/a")
    public WebElement adressesMenu;

    @FindBy(xpath="//*[@id=\"main\"]/div/div/div/div/div/div/nav/ul/li[6]/a")
    public WebElement accountDetailsMenu;

    @FindBy(xpath = "//*[@id=\"main\"]/div/div/div/div/div/div/nav/ul/li[7]/a")
    public  WebElement wishlistMenu;

    @FindBy(xpath = "//*[@id=\"main\"]/div/div/div/div/div/div/nav/ul/li[8]/a")
    public  WebElement supportTicketsMenu;

    @FindBy(xpath = "//*[@id=\"main\"]/div/div/div/div/div/div/nav/ul/li[9]/a")
    public  WebElement followingsMenu;

    @FindBy(xpath="//*[@id=\"main\"]/div/div/div/div/div/div/nav/ul/li[10]/a")
    public  WebElement logoutMenu;
}
