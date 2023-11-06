package myapp.pages;

import com.github.javafaker.Faker;
import myapp.pages.XYZBankCustomerPage;
import myapp.pages.XYZBankHomePage;
import myapp.pages.XYZBankManagerPage;
import myapp.utilities.ConfigReader;
import myapp.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertFalse;
import static org.testng.AssertJUnit.assertTrue;

public class XYZBankTest {
    //Open 5 new  Accounts, deposit 100 USD and withdraw 100 USD from any account and delete all accounts you created on https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login.
 /*
Given
    Go to url https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login
When
    Click on "Bank Manager Login" button
And
    Click on "Add Customer" button
And
    Fill inputs and click on "Add Customer" form
And
    Accept alert
And
    Add 4 more customers
And
    Click on "Open Account"  button
And
    Click on "Customer" dropdown
And
    Select customer name
And
    Click on "Currency" dropdown
And
    Select "Dollar"
And
    Click on "Process" button
And
    Accept alert
And
    Open 4 more accounts
And
    Click on "Customers" button
And
    Get last 5 customers' account numbers
Then
    Assert that you created 5 accounts
When
    Click on "Home" button
And
    Click on "Customer Login" button
And
    Click on "Your Name" dropdown
And
    Select the any name you created
And
    Click on "Login" button
And
    Click on "Deposit" button
And
    Type 100 into "Amount to be Deposited" input
And
    Click on "Deposit"(Submit) button
Then
    Assert that "Deposit Successful" is displayed
And
    Click on "Withdrawal" button
And
    Type 100 into "Amount to be Withdrawn" input
And
    Click on "Withdraw"(Submit) button
Then
    Assert that "Transaction  Successful" is displayed
When
    Click on "Logout" button
And
    Click on "Home" button
And
    Click on "Bank Manager Login" button
And
    Click on "Customers" button
And
    Click on each "Delete" button
And
    Count table row numbers
Then
    Assert that number of customers is 0

 */

    @Test
    public void xyzBankTest() {

//        Go to url https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login
        Driver.getDriver().get(ConfigReader.getProperty("xyz_bank_link"));

//        Click on "Bank Manager Login" button
        XYZBankHomePage xyzBankHomePage = new XYZBankHomePage();
        xyzBankHomePage.bankManagerLoginButton.click();

//        Click on "Add Customer" button
        XYZBankManagerPage xyzBankManagerPage = new XYZBankManagerPage();
        xyzBankManagerPage.addCustomerButton.click();

//        Fill inputs and click on "Add Customer" form
        for (int i = 0; i < 5; i++) {
            xyzBankManagerPage.firstNameInput.clear();
            xyzBankManagerPage.firstNameInput.sendKeys(Faker.instance().name().firstName());
            xyzBankManagerPage.lastNameInput.clear();
            xyzBankManagerPage.lastNameInput.sendKeys(Faker.instance().name().lastName());
            xyzBankManagerPage.postCodeInput.clear();
            xyzBankManagerPage.postCodeInput.sendKeys(Faker.instance().address().zipCode());
            xyzBankManagerPage.addCustomerSubmit.click();
//        Accept alert
            Driver.getDriver().switchTo().alert().accept();
//        Add 4 more customers
        }

//        Click on "Open Account"  button
        xyzBankManagerPage.openAccountButton.click();

//        Click on "Customer" dropdown
        Select customerDD = new Select(xyzBankManagerPage.customerDropDown);
        Select currencyDD = new Select(xyzBankManagerPage.currencyDropDown);

        for (int i = 0; i < 5; i++) {
//        Select customer name
            customerDD.selectByIndex(i + 6);

//        Click on "Currency" dropdown
//        Select "Dollar"
            currencyDD.selectByVisibleText("Dollar");
//        Click on "Process" button
            xyzBankManagerPage.processButton.click();

//        Accept alert
            Driver.getDriver().switchTo().alert().accept();
            //        Open 4 more accounts
        }

//        Click on "Customers" button
        xyzBankManagerPage.customersButton.click();

//        Get last 5 customers' account numbers
//        Assert that you created 5 accounts
        for (int i = xyzBankManagerPage.accountNumbers.size() - 1; i > xyzBankManagerPage.accountNumbers.size() - 6; i--) {
            boolean isBlank = xyzBankManagerPage.accountNumbers.get(i).getText().isBlank();
//            String lastNumber = xyzBankManagerPage.accountNumbers.get(xyzBankManagerPage.accountNumbers.size()-1).getText();
//            System.out.println("lastNumber = " + lastNumber);
//            System.out.println("isBlank = " + isBlank);
            assertFalse(isBlank);
        }


//        Click on "Home" button
        xyzBankManagerPage.homeButton.click();

//        Click on "Customer Login" button
        xyzBankHomePage.customerLoginButton.click();

//        Click on "Your Name" dropdown
//        Select any name you created
        XYZBankCustomerPage xyzBankCustomerPage = new XYZBankCustomerPage();
        Select yourNameDD = new Select(xyzBankCustomerPage.yourNameDropDown);
        yourNameDD.selectByIndex(6);

//        Click on "Login" button
        xyzBankCustomerPage.loginButton.click();

//        Click on "Deposit" button
        xyzBankCustomerPage.depositButton.click();

//        Type 100 into "Amount to be Deposited" input
        xyzBankCustomerPage.depositInput.sendKeys("100");

//        Click on "Deposit"(Submit) button
        xyzBankCustomerPage.depositSubmitButton.click();


//        Assert that "Deposit Successful" is displayed
        assertTrue(xyzBankCustomerPage.depositSuccessfulMessage.isDisplayed());

//        Click on "Withdrawal" button
        xyzBankCustomerPage.withdrawlButton.click();

//        Type 100 into "Amount to be Withdrawn" input
        xyzBankCustomerPage.withdrawlSubmitButton.click();
        xyzBankCustomerPage.withdrawlInput.sendKeys("100", Keys.ENTER);

//        Click on "Withdraw"(Submit) button
        xyzBankCustomerPage.withdrawlSubmitButton.click();

//        Assert that "Transaction  Successful" is displayed
        assertTrue(xyzBankCustomerPage.transactionSuccessfulMessage.isDisplayed());

//        Click on "Logout" button
        xyzBankCustomerPage.logoutButton.click();

//        Click on "Home" button
        xyzBankManagerPage.homeButton.click();

//        Click on "Bank Manager Login" button
        xyzBankHomePage.bankManagerLoginButton.click();

//        Click on "Customers" button
        xyzBankManagerPage.customersButton.click();

//        Click on each "Delete" button
        xyzBankManagerPage.deleteButtonList.forEach(WebElement::click);

//        Count table row numbers
//        Assert that number of customers is 0
        assertTrue(xyzBankManagerPage.deleteButtonList.isEmpty());

        Driver.closeDriver();

    }
}
