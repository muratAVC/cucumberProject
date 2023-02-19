package com.cydeo.utilities;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import java.util.Set;

public class BrowserUtils {
    public WebDriver driver;

    public void verifyTitle(WebDriver driver,String actualTitle){
        Assert.assertTrue(driver.getTitle().equals(actualTitle));
    }

    public static void switchWindowAndVerify(String expectedURL, String expectedTitle){
        Set<String> allWindowsHandles=Driver.getDriver(Driver.CHROME).getWindowHandles();

        for (String vinH:allWindowsHandles) {
            Driver.getDriver(Driver.CHROME).switchTo().window(vinH);
            System.out.println(Driver.getDriver(Driver.CHROME).getCurrentUrl());
            if (Driver.getDriver(Driver.CHROME).getCurrentUrl().contains(expectedURL)){
                break;
            }
        }
        Assert.assertTrue(Driver.getDriver(Driver.CHROME).getTitle().contains(expectedTitle));
    }
}
