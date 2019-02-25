package com.test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

//import
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/java/com/test/features/PageLoadFeature.feature",
        glue="com/test/steps"
)
public class TestRunner {
}
