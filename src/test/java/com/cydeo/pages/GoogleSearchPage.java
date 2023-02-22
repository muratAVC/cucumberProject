package com.cydeo.pages;

import com.cydeo.step_definitions.GoogleStepDefinitions;
import com.cydeo.utilities.Driver;
import com.cydeo.utilities.DriverBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearchPage extends DriverBase {

    public GoogleSearchPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(name = "q")
    public WebElement searchBox;

}
