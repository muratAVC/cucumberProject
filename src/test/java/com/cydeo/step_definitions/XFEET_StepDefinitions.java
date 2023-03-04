package com.cydeo.step_definitions;

import com.cydeo.pages.XFLEETPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;

public class XFEET_StepDefinitions {
    XFLEETPage xfleetPage =new XFLEETPage();



    @Given("users should be able to login with their {string} and {string}")
    public void usersShouldBeAbleToLoginWithTheirAnd(String userName, String password) {
        Driver.getDriver().get("http://qa.xfleetsolutions.com/user/login");
        xfleetPage.inputNameBox.sendKeys(userName);
        xfleetPage.passwordBox.sendKeys(password);
        xfleetPage.logButton.click();
        Assert.assertTrue(xfleetPage.quickLaunchpad.isDisplayed());
        xfleetPage.userMenu.click();
        xfleetPage.logoutButton.click();

    }


    @Given("invalid login user name {string}")
    public void invalid_login_user_name(String string) {
        Driver.getDriver().get("http://qa.xfleetsolutions.com/user/login");
        xfleetPage.inputNameBox.sendKeys(string);

    }
    @Given("invalid login password {string}")
    public void invalid_login_password(String string) {
        xfleetPage.passwordBox.sendKeys(string);
    }

    @And("user clicks to login button in zfleet")
    public void userClicksToLoginButtonInZfleet() {
        xfleetPage.logButton.click();
    }

    @Given("enpty username and password")
    public void enpty_username_and_password() {

    }
    @Given("forgot password clickable")
    public void forgot_password_clickable() {

    }
    @Given("User can see Remember Me link exists and is clickable on the login page")
    public void user_can_see_remember_me_link_exists_and_is_clickable_on_the_login_page() {

    }


    @And("verify  not login")
    public void verifyNotLogin() {
        Assert.assertTrue(xfleetPage.invalidInformations.isDisplayed());
    }
}
