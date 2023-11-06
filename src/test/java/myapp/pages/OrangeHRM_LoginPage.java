package myapp.pages;
import myapp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class OrangeHRM_LoginPage {
//    1. create a constructor and use pagefactory to initialize the page elements
//    2. locate the elements using @FindBy annotation
    public OrangeHRM_LoginPage(){
//        PageFactory is used to instantiate the page objects
        PageFactory.initElements(Driver.getDriver(),this);
    }
    //    username
//    public WebElement username = driver.findElement(By.name("username")); //TRADITIONAL
    @FindBy(name = "username")
    public WebElement username;
    //    password
    @FindBy(xpath = "//input[@type='password']")
    public WebElement password;
    //    login button
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginButton;
    //    NOTE : we can also create reusable PAGE SPECIFIC methods
    public void login(String userID,String pass){
        username.sendKeys(userID);
        password.sendKeys(pass);
        loginButton.click();
    }

//    !!!DONE WITH THE PAGE OBJECTS. NOW COMPLETE YOUR TEST CASE USING THIS REUSABLE PAGE OBJECTS!!!
}
