package com.cydeo.step_definitions;

import com.cydeo.pages.DataTablePage;
import com.cydeo.pages.DropDrownPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataTables_StepDefinitions {
    DataTablePage dataTablePage=new DataTablePage();
    DropDrownPage dropDrownPage=new DropDrownPage();

    @Then("user should see your favorite fruits")
    public void user_should_see_your_favorite_fruits(List<String> list) {
        System.out.println(list);
    }
    @Given("user is on the login page of web table app")
    public void user_is_on_the_login_page_of_web_table_app() {
        Driver.getDriver().get("https://web-table-2.cydeo.com/login");
    }
    @When("user enters user name {string}")
    public void user_enters_user_name(String string) {
        //dataTablePage.inputBox.sendKeys(string);
    }
    @When("user enters user password {string}")
    public void user_enters_user_password(String string) {
       //dataTablePage.passBox.sendKeys(string);
    }
    @When("user clicks to login button")
    public void user_clicks_to_login_button() {
       dataTablePage.buttonLogin.click();
    }
    @Then("user should see url contains orders")
    public void user_should_see_url_contains_orders() {
        Assert.assertEquals("https://web-table-2.cydeo.com/orders",Driver.getDriver().getCurrentUrl());
    }

    @When("User enters below credentials")
    public void user_enters_below_credentials(io.cucumber.datatable.DataTable dataTable) {
        Map<String,String> mapList=new HashMap<>();
        mapList=dataTable.asMap();
        dataTablePage.inputBox.sendKeys(mapList.get("username"));
        dataTablePage.passBox.sendKeys(mapList.get("password "));
    }

    @Given("User is on the dropdowns page of practice tool")
    public void user_is_on_the_dropdowns_page_of_practice_tool() {
        Driver.getDriver().get("https://practice.cydeo.com/dropdown ");
    }
    @Then("User should see below info in month dropdown")
    public void user_should_see_below_info_in_month_dropdown(List<String> months) {
        List<String> monthlist=new ArrayList<>();
        Select select=new Select(dropDrownPage.months);
        List<WebElement> elementList=select.getOptions();
        for (WebElement each: elementList ) {
            monthlist.add(each.getText());
        }
        Assert.assertEquals(months,monthlist);


    }

}
