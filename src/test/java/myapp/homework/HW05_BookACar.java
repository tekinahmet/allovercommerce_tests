package myapp.homework;

import com.github.javafaker.Faker;
import myapp.pages.RentalHomePage;
import myapp.utilities.Driver;
import myapp.utilities.WaitUtils;

import org.apache.poi.hpsf.Date;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.xml.crypto.Data;

public class HW05_BookACar {
//        Name:
//        Require user to login for reservation
//        Description:
//        User should see a message when user tries to book a car while not logged in
//        Acceptance Criteria:
//        As customer, I should be able to see error message, when I try to book a car while not logged in
//        Message: Please first login
//        Given user is on the login page
//        And tries to book a car
//        And click continue reservation
//        Then user see the warning message: Please first login
    @Test
    public void bookACar(){
//        go to https://www.bluerentalcars.com/
        Driver.getDriver().get("https://www.bluerentalcars.com/");
        WaitUtils.waitFor(1);

//        select a car
        RentalHomePage rentalHomePage = new RentalHomePage();
        Select select = new Select(rentalHomePage.selectACar);
        select.selectByIndex(9);

//        select a place to pick up
        Faker faker = new Faker();
        rentalHomePage.pickUpPlace.sendKeys(faker.address().city());

//        select a place to drop off
        rentalHomePage.dropOffPlace.sendKeys(faker.address().city());

//        select a date to pick up
        rentalHomePage.pickUpDate.sendKeys("10122023");

//        select time to pick up
        rentalHomePage.pickUpTime.sendKeys("1215a");

//        select a date to drop off
        rentalHomePage.dropOffDate.sendKeys("11122023");

//        select time to drop off
        rentalHomePage.dropOffTime.sendKeys("1110p");

//        click "continue reservation" button
        WaitUtils.waitForVisibility(By.xpath("//button[@type='submit']"), 5);
        rentalHomePage.continueButton.click();

//        verify the message that Please first login
        WaitUtils.waitFor(3);
        String message = rentalHomePage.errorMessage.getText();
        System.out.println("message = " + message);
        Assert.assertTrue(message.contains("Please"));


    }
}
