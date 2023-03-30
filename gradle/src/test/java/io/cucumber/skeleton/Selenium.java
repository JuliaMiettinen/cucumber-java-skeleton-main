package io.cucumber.skeleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium
    {
        WebDriver driver;
        @Test
        public void test() {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\yunaa\\Downloads\\chromedriver_win32\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.get("https://www.google.com");
            Assertions.assertEquals("Google", driver.getTitle());
        }
     

}
