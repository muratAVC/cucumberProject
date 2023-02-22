package com.cydeo.pages;

import com.cydeo.utilities.DriverBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikiSearchPage extends DriverBase {

    public WikiSearchPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//div[@class='search-input']")
    public WebElement searchBox;

    @FindBy(xpath = "//button[@class='pure-button pure-button-primary-progressive']")
    public WebElement searchButton;

    @FindBy(xpath = "//span[@class='mw-page-title-main']")
    public WebElement getSearchHead;





}
