package com.cydeo.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/cuc-report.html",
                "rerun:target/rerun.txt"
        },
        features = "src/test/resources/features",
        glue = "com/cydeo/step_definitions",
        dryRun = false,
        tags = "@Run"

)
public class CukesRunner {
/*
"html:target/cuc-report.html",
"rerun:target/rerun.txt"
 */
}
