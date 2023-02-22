package com.cydeo.utilities;

import org.openqa.selenium.WebDriver;

public class DriverBase {
    public static WebDriver driver;

    static {
        driver=Driver.getDriver(Driver.CHROME);
    }

}
