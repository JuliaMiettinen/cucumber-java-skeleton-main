package io.cucumber.skeleton;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Form {
    WebDriver driver;
    @Given("user launches Chrome browser")
public void user_launches_chrome_browser() {
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\yunaa\\Downloads\\chromedriver_win32\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().window().maximize();
}
@When("user opens form webpage")
public void user_opens_form_webpage() {
    driver.get("https://automationexplore.com/selenium-automation-practice-page/");
}
@Then("user enters username")
public void user_enters_username() {
    driver.findElement(By.id("firstname")).sendKeys("Julia");
    driver.findElement(By.id("lastname")).sendKeys("Miettinen");
}
@Then("user enters email")
public void user_enters_email() {
    driver.findElement(By.id("email")).sendKeys("julia.miettinen@gmail.com");
}
@Then("user chooses gender and profession")
public void user_chooses_gender_and_profession() {
    driver.findElement(By.xpath("//*[@id='post-253']/div[2]/form/fieldset/input[5]")).click();
    driver.findElement(By.xpath("/html/body/div[1]/div/div/main/article/div[2]/form/fieldset/input[6]")).click();
}
@Then("user enters country and skill")
public void user_enters_country_and_skill() {
    Select country = new Select(driver.findElement(By.name("country")));
    country.selectByVisibleText("USA");
    Select skill = new Select(driver.findElement(By.id("skillsmultiple")));
    skill.selectByVisibleText("Automation Testing");
}
@Then("user clicks the button")
public void user_clicks_the_button() {
    driver.findElement(By.id("alertbutton")).click();
    Alert alertobj = driver.switchTo().alert();
    alertobj.accept();
}

}
