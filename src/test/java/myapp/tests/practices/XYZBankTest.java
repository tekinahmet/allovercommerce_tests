package myapp.tests.practices;

import com.github.javafaker.Faker;
import myapp.pages.XYZBankHomePage;
import myapp.pages.XYZBankManagerPage;
import myapp.utilities.Driver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

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
    Count table row numbers
Then
    Assert that you created 5 customers
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
        Driver.getDriver().get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");

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
        }
//        Open 4 more accounts


//        Click on "Customers" button
        xyzBankManagerPage.customersButton.click();
//        Count table row numbers

//        Assert that you created 5 customers

//        Click on "Home" button

//        Click on "Customer Login" button

//        Click on "Your Name" dropdown

//        Select the any name you created

//        Click on "Login" button

//        Click on "Deposit" button

//        Type 100 into "Amount to be Deposited" input

//        Click on "Deposit"(Submit) button

//        Assert that "Deposit Successful" is displayed

//        Click on "Withdrawal" button

//        Type 100 into "Amount to be Withdrawn" input

//        Click on "Withdraw"(Submit) button

//        Assert that "Transaction  Successful" is displayed

//        Click on "Logout" button

//        Click on "Home" button

//        Click on "Bank Manager Login" button

//        Click on "Customers" button

//        Click on each "Delete" button

//        Count table row numbers

//        Assert that number of customers is 0
        // Driver.closeDriver();


    }


}
