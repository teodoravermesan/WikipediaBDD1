package com.project.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        stepNotifications = true,
        monochrome = true,
        plugin = {"pretty", "html:target/cucumber", "json:target/jsonReports/CreateProject.json"},
        glue = {"com"},
        features = {
                "src/test/resources/features/create-projects.feature"
        }
)
public class TestRunner {
}
