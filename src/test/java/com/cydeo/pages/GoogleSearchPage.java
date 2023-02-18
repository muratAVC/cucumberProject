package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearchPage {
    public GoogleSearchPage(){
        //create constructor
        // initialize the driver instance and this class' instance using PageFactory.initElements
        PageFactory.initElements(Driver.getDriver(Driver.CHROME),this);
    }

    @FindBy(name = "q")
    public WebElement searchBox;

    public String getCapital(){
        return Driver.getDriver(Driver.CHROME).findElement(By.xpath("//a[@class='FLP8od']")).getText();
    }


}
