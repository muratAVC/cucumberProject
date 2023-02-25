package com.cydeo.pages;

import com.cydeo.utilities.DriverBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DataTablePage extends DriverBase {
    public DataTablePage(){
        PageFactory.initElements(driver,this);
    }

@FindBy(name = "username")
    public WebElement inputBox;

@FindBy(name = "password")
    public WebElement passBox;

@FindBy(xpath = "//button[@type='submit']")
    public WebElement buttonLogin;

@FindBy(xpath = "//*[@id=\"root\"]/nav/div[2]/a[3]/button")
    public WebElement orderButton;

@FindBy(name = "product")
    public WebElement productType;

@FindBy(id = "editing-view-port")
    public WebElement quantify;
@FindBy(id = "placeholder")
    public WebElement customerName;






}
