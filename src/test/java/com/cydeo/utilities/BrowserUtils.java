package com.cydeo.utilities;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import java.util.Set;

public class BrowserUtils extends DriverBase{

    public void verifyTitle(WebDriver driver,String actualTitle){
        Assert.assertTrue(driver.getTitle().equals(actualTitle));
    }

    public static void switchWindowAndVerify(String expectedURL, String expectedTitle){
        Set<String> allWindowsHandles=driver.getWindowHandles();

        for (String vinH:allWindowsHandles) {
            driver.switchTo().window(vinH);
            System.out.println(driver.getCurrentUrl());
            if (driver.getCurrentUrl().contains(expectedURL)){
                break;
            }
        }
        Assert.assertTrue(driver.getTitle().contains(expectedTitle));
    }
}
