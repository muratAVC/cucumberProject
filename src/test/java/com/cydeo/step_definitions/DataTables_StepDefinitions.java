package com.cydeo.step_definitions;

import io.cucumber.java.en.Then;

import java.util.List;

public class DataTables_StepDefinitions {


    @Then("user should see your favorite fruits")
    public void user_should_see_your_favorite_fruits(List<String> list) {
        System.out.println(list);
    }
}
