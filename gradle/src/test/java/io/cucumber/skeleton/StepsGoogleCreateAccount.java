package io.cucumber.skeleton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepsGoogleCreateAccount {
    WebDriver driver;

    @Given("I launch Chrome browser")
    public void i_launch_chrome_browser() {
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\yunaa\\Downloads\\chromedriver_win32\\chromedriver.exe");
    driver = new ChromeDriver();}

    @When("I open Google sign-up webpage")
public void i_open_google_sign_up_webpage() {
    driver.get("https://accounts.google.com/signup");
}
@Then("I enter user data and press next button")
public void i_enter_user_data_and_press_next_button() {
    driver.manage().deleteAllCookies();
    driver.findElement(By.name("firstName")).sendKeys("Julia");
    driver.findElement(By.name("lastName")).sendKeys("Miettinen");
    driver.findElement(By.name("Username")).sendKeys("JuliaMiettinenNarvaCollege");
    driver.findElement(By.name("Passwd")).sendKeys("JuliaMiettinenNarvaCollege123");
    driver.findElement(By.name("ConfirmPasswd")).sendKeys("JuliaMiettinenNarvaCollege123");
    driver.findElement(By.xpath("//*[@id='accountDetailsNext']/div/button")).click();
}

@Then("Close browser")
public void close_browser() {
    driver.quit();
    System.out.println("end");
}

}