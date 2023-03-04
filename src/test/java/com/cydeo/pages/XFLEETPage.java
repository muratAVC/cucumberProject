package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class XFLEETPage {
    public XFLEETPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "prependedInput")
    public WebElement inputNameBox;

    @FindBy(id = "prependedInput2")
    public WebElement passwordBox;

    @FindBy (xpath = "//div[@class='pull-left']//h1")
    public WebElement quickLaunchpad;

    @FindBy(xpath = "//*[@id=\"user-menu\"]/a")
    public WebElement userMenu;

    @FindBy(xpath = "//*[@id=\"user-menu\"]/ul/li[4]/a")
    public WebElement logoutButton;

    @FindBy(id = "_submit")
    public WebElement logButton;

    @FindBy(xpath = "//label[@class='custom-checkbox absolute']")
    public WebElement rememberBox;

    @FindBy(xpath = "//a[@href='/user/reset-request']")
    public WebElement forgotPassButton;

    @FindBy(xpath = "//a[@href='/user/login']")
    public WebElement returnLoginButton;

    @FindBy(xpath = "//*[@id=\"login-form\"]/fieldset/div[1]/div")
    public WebElement invalidInformations;





}
