package io.cucumber.skeleton;

//import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepsNarva {
    WebDriver driver;

 //@Given("I launch Chrome browser")
//public void i_launch_chrome_browser() {
   // System.setProperty("webdriver.chrome.driver", "C:\\Users\\yunaa\\Downloads\\chromedriver_win32\\chromedriver.exe");
   // driver = new ChromeDriver();
    
    //driver.navigate().to("https://narva.ut.ee/et");
    //driver.navigate().to("https://utlib.ut.ee/en");


@When("I open Narva college Webpage")
public void i_open_narva_college_webpage() {
    //System.out.println("Website title is = "+ driver.getTitle());
    //driver.findElement(By.xpath("//button[@aria-label='lülita sisse kontaktiotsing']")).click();

}
@Then("I verify the title of the webpage")
public void i_verify_the_title_of_the_webpage() {

   //Assertions.assertEquals ("Esileht | Tartu Ülikool", driver.getTitle());
   System.out.println("end");
}
//@Then("Close browser")
//public void close_browser() {
  //driver.quit();
//    System.out.println("end");
//}
}
