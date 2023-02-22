package com.cydeo.step_definitions;

import com.cydeo.pages.WikiSearchPage;
import com.cydeo.utilities.DriverBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class WikiStepDefinitions extends DriverBase {
    WikiSearchPage wikiSearchPage=new WikiSearchPage();

    @Given("User is on Wikipedia home page")
    public void user_is_on_wikipedia_home_page() {
       driver.get("https://www.wikipedia.org");
    }
    @When("User types {string} in the wiki search box")
    public void userTypesInTheWikiSearchBox(String searchText) {
        wikiSearchPage.searchBox.sendKeys(searchText);
    }
    @Then("User clicks wiki search button")
    public void user_clicks_wiki_search_button() {
        wikiSearchPage.searchButton.click();
    }

    @And("User sees {string} is in the wiki title")
    public void userSeesIsInTheWikiTitle(String searchText) {
        Assert.assertTrue(driver.getTitle().contains(searchText));
    }

    @And("User sees {string} is in the main header")
    public void userSeesIsInTheMainHeader(String searchText) {
        wikiSearchPage.getSearchHead.getText().contains(searchText);
    }
}
