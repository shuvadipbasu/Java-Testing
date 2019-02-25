package com.test.steps;

import cucumber.api.java.en.Given;
import org.junit.Assert;

public class StepDefinition {

    @Given("^user is at login page$")
    public void userOnSite(){
        Assert.assertEquals(1.0,1.0,0);
    }
}
