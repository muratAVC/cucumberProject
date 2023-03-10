package com.cydeo.step_definitions;

import com.cydeo.pages.GoogleSearchPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class GoogleStepDefinitions {
    GoogleSearchPage googleSearchPage=new GoogleSearchPage();
//    @Before
//    public void startDriver(){
//
//    }
//    @After
//    public void closeDriver(){
//        driver.quit();
//    }

    @When("user types {string} and clicks enter")
    public void user_types_and_clicks_enter(String searchKey) {
        googleSearchPage.searchBox.sendKeys(searchKey+Keys.ENTER);
    }
    @Then("user sees {string} in the google title")
    public void user_sees_in_the_google_title(String string) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(string));
    }
    @When("user is on google search page")
    public void user_is_on_google_search_page() {
        Driver.getDriver().get("https://www.google.com");
    }
    @Then("user should see title is Google")
    public void user_should_see_title_is_google() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Google"));
    }


}
