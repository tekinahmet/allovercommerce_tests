package myapp.tests.practices;

import myapp.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class BrokenImages {
    /*
    Go to https://testcenter.techproeducation.com/index.php?page=broken-images
    Count the broken and valid images
     */

    @Test
    public void brokenImages() {
        Driver.getDriver().get("https://www.zenarmor.com/");
        //Get all img web elements into a list
        List<WebElement> images = Driver.getDriver().findElements(By.xpath("//img"));
        System.out.println("images.size() = " + images.size());//3

        int numberOfBrokenImages = 0;
        int numberOfValidImages = 0;
        for (WebElement w : images) {
            if (w.getAttribute("naturalWidth").equals("0")) {
                System.out.println("Broken Image: " + w.getAttribute("src"));
                numberOfBrokenImages++;

            } else {
                System.out.println("Valid Image: " + w.getAttribute("src"));
                numberOfValidImages++;
            }
        }
        System.out.println("numberOfBrokenImages = " + numberOfBrokenImages);
        System.out.println("numberOfValidImages = " + numberOfValidImages);

    }
}