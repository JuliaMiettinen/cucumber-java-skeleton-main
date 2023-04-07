package io.cucumber.skeleton;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SwitchtoWindow {
    WebDriver driver; 

    @Given("users launch Chrome browser")
public void users_launch_chrome_browser() {
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\yunaa\\Downloads\\chromedriver_win32\\chromedriver.exe");
    driver = new ChromeDriver();

    driver.manage().window().maximize();
}

@When("users open Narva college webpage")
public void users_open_narva_college_webpage() {
    driver.get("https://narva.ut.ee/et");
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
}
@Then("users click Moodle button")
public void users_click_moodle_button() {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Moodle")));
    driver.findElement(By.linkText("Moodle")).click();
}
@Then("users switch window back to narva college webpage")
public void users_switch_window_back_to_narva_college_webpage() {
    ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
    driver.switchTo().window(tabs.get(0));
}
@Then("users click SIS2 button")
public void users_click_sis2_button() {
    driver.findElement(By.linkText("ÕIS2")).click();
}
}
