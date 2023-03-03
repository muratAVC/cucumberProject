package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DataTablePage {
    public DataTablePage(){
        PageFactory.initElements(Driver.getDriver(),this);
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

@FindBy(name = "quantity")
    public WebElement quantify;
@FindBy(name = "name")
    public WebElement customerName;
@FindBy(name = "street")
    public WebElement streetName;
@FindBy(name = "city")
    public WebElement cityName;
    @FindBy(name = "state")
    public WebElement stateName;
    @FindBy(name = "zip")
    public WebElement zipCode;
    @FindBy(xpath = "//label[@class='radio']")
    public List<WebElement> cardType;

    @FindBy(name = "cardNo")
    public WebElement cardNo;
    @FindBy(name = "cardExp")
    public WebElement cardExp;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement processButton;

    @FindBy(xpath = "//tbody//tr[1]//td[1]")
    public WebElement tableFirst;

    @FindBy(xpath = "//button[@class='button __logout']")
    public WebElement logoutButton;









}
