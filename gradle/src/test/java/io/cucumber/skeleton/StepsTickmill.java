package io.cucumber.skeleton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepsTickmill {
    WebDriver driver;

    @Given("I open Chrome browser")
    public void i_open_chrome_browser() {
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\yunaa\\Downloads\\chromedriver_win32\\chromedriver.exe");
    driver = new ChromeDriver();}
    
    @When("I open Tickmill Sign-up page")
public void i_open_tickmill_sign_up_page() {
    driver.get("https://secure.tickmill.co.uk/en/sign-up");
}
@Then("I select account type and click Proceed button")
public void i_select_account_type_and_click_proceed_button() {
    driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/div[1]/div[2]/section[2]/form[1]/div[1]/div[1]/input[1]")).click();
    driver.findElement(By.xpath("//span[contains(text(),'Proceed')]")).click();
}
}
