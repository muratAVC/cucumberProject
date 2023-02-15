package com.cydeo.utilities;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;


public class BrowserUtils {
    public WebDriver driver;

    public void verifyTitle(WebDriver driver,String actualTitle){
        Assert.assertTrue(driver.getTitle().equals(actualTitle));
    }
    @BeforeMethod
    public void driverStart(){
        driver= Driver.getDriver(Driver.CHROME);
    }
    @AfterMethod
    public void driverQuit() throws InterruptedException {
        //Thread.sleep(3000);
        driver.quit();
    }
}
