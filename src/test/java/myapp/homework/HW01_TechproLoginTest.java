package myapp.homework;

import myapp.pages.TechproHomePage;
import myapp.pages.TechproLoginPage;
import myapp.utilities.BrowserUtils;
import myapp.utilities.ConfigReader;
import myapp.utilities.Driver;
import org.testng.annotations.Test;

public class HW01_TechproLoginTest {
    @Test
    public void loginTest(){
        /*
        https://testcenter.techproeducation.com/index.php?page=form-authentication
        Test the Login  and logout functionality of the application using page object model
        PAGES:
        ***TechproLoginPage
        userName
        password
        submitButton
        ***TechproHomePage
        homeHeader
        homeLogoutButton
         */
        Driver.getDriver().get(ConfigReader.getProperty("techpro_test_url"));
        TechproLoginPage techproLoginPage = new TechproLoginPage();
//        techproLoginPage.username.sendKeys(ConfigReader.getProperty("techpro_test_username"));
//        techproLoginPage.password.sendKeys(ConfigReader.getProperty("techpro_test_password"));
//        techproLoginPage.submitButton.click();

        techproLoginPage.login(ConfigReader.getProperty("techpro_test_username"), ConfigReader.getProperty("techpro_test_password"));

        TechproHomePage techproHomePage = new TechproHomePage();
        techproHomePage.homeLogoutButton();
        //BrowserUtils.clickWithTimeOut(techproHomePage.logOut, 3);

    }
}
