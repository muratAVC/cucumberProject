package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class GoogleStepDefinitions {
    WebDriver driver;
    @Before
    public void startDriver(){
        driver=Driver.getDriver(Driver.CHROME);
    }
    @After
    public void closeDriver(){
        driver.quit();
    }


    @When("user is on google search page")
    public void user_is_on_google_search_page() {
        driver.get("https://www.google.com");
    }
    @Then("user should see title is Google")
    public void user_should_see_title_is_google() {
        Assert.assertTrue(driver.getTitle().contains("Google"));

    }
}
