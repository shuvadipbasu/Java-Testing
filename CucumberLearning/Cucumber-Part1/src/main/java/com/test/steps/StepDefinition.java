package com.test.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepDefinition {

    WebDriver driver;
    private static final String _DRIVER_LOC="D:\\GitRepos\\Java-Testing\\CucumberLearning\\Cucumber-Part1\\src\\main\\resources\\driver\\chromedriver.exe";

    @Given("^user is at login page of github$")
    public void userOnSite(){
        System.setProperty("webdriver.chrome.driver",_DRIVER_LOC);
         driver = new ChromeDriver();
         driver.get("https://github.com/");
    }

    @Then("^title of the page is The world’s leading software development platform · GitHub$")
    public void checkTitleOfThePage(){
       Assert.assertEquals("The world’s leading software development platform · GitHub",driver.getTitle());
       driver.close();
    }

}
