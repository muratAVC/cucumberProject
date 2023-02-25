package com.cydeo.step_definitions;

import com.cydeo.pages.DataTablePage;
import com.cydeo.utilities.DriverBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class WebTableOrder_StepDefinitions extends DriverBase {

    DataTablePage dataTablePage =new DataTablePage();


    @Given("user is already logged in and on order page")
    public void user_is_already_logged_in_and_on_order_page() {
        driver.get("https://web-table-2.cydeo.com/login");
        dataTablePage.inputBox.sendKeys("Test");
        dataTablePage.passBox.sendKeys("Tester");
        dataTablePage.buttonLogin.click();
        dataTablePage.orderButton.click();
    }
    @When("user selects product type {string}")
    public void user_selects_product_type(String string) {
        Select select=new Select(dataTablePage.productType);
        List<WebElement> elementList=select.getOptions();
        for (WebElement each: elementList) {
            if (each.equals(string)){
                select.selectByValue(string);
            }
        }
    }
    @When("user enters quantity {string}")
    public void user_enters_quantity(String string) {
        dataTablePage.quantify.sendKeys(string);
    }
    @When("user enters costumer name {string}")
    public void user_enters_costumer_name(String string) {
        dataTablePage.customerName.sendKeys(string);

    }
    @When("user enters street {string}")
    public void user_enters_street(String string) {

    }
    @When("user enters city {string}")
    public void user_enters_city(String string) {

    }
    @When("user enters state {string}")
    public void user_enters_state(String string) {

    }
    @When("user enters zipcode {string}")
    public void user_enters_zipcode(String string) {

    }
    @When("user selects credit card type {string}")
    public void user_selects_credit_card_type(String string) {

    }
    @When("user enters credit card number {string}")
    public void user_enters_credit_card_number(String string) {

    }
    @When("user enters expiry date {string}")
    public void user_enters_expiry_date(String string) {

    }
    @When("user enters process order button")
    public void user_enters_process_order_button() {

    }
    @Then("user should see {string} in first row of the web table")
    public void user_should_see_in_first_row_of_the_web_table(String string) {

    }

}
