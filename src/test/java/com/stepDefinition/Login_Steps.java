package com.stepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Login_Steps {

    WebDriver driver;
    @When("the user enters a valid username")
    public void the_user_enters_a_valid_username() {
        driver = new FirefoxDriver();

        driver.manage().window().maximize();

        driver.get("https://adactinhotelapp.com/");
        WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
        username.sendKeys("masif1118");

    }
    @When("the user enters a valid password")
    public void the_user_enters_a_valid_password() {
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("EMBMEO");

    }
    @When("the user clicks the Login button")
    public void the_user_clicks_the_login_button() {
        WebElement login_Btn = driver.findElement(By.name("login"));
        login_Btn.click();

    }

    @Then("the user should be successfully logged in")
    public void the_user_should_be_successfully_logged_in() {
        WebElement dd_location = driver.findElement(By.className("search_combobox"));
        Select sd2 = new Select(dd_location);
        sd2.selectByIndex(2);

    }

}
