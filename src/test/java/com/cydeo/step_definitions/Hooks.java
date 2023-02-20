package com.cydeo.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class Hooks {
    @Before(order = 1)
    public void setupScenario(){
        System.out.println("before of method");
    }
    @Before(value = "@Login",order = 0)
    public void setupScenarioForLogin(){
        System.out.println("before of scenario for Login");
    }
    @Before(value = "@db",order = 2)
    public void setupForDatabaseScenario(){
        System.out.println("sadece @db tag ından önce çalışır");
    }

    @After
    public void teardownScenario(){
        System.out.println("After of method");
    }

    @BeforeStep
    public void setupStep(){
        System.out.println("before of step");
    }

    @AfterStep
    public void afterStep(){
        System.out.println("After of Step");
    }
}
