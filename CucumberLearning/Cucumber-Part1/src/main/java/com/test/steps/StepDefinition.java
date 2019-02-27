package com.test.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
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

    }

    @Then("^user clicks on sign in button$")
    public void clickOnSignIn(){
        driver.findElement(By.xpath("//a[@href='/login']")).click();

    }
@Then("^user enters user name as user and password as pass$")
    public void enterUserNameAndPassword(){
        driver.findElement(By.name("login")).sendKeys("test");
        driver.findElement(By.name("password")).sendKeys("pass");
    }

@Then("user login denied on submit")
    public void loginDenied(){
        driver.findElement(By.name("commit")).click();
        String text = driver.findElement(By.tagName("body")).getText();

        Assert.assertTrue(text.contains("Incorrect username or password."));
    }


}
