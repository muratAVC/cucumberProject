package com.cydeo.pages;

import com.cydeo.utilities.DriverBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DropDrownPage extends DriverBase {

    public DropDrownPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "month")
    public WebElement months;

}
