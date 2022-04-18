

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class FirstTest {

    @Test

    public void firstTest(){

        System.setProperty("webdriver.chrome.driver", "/Users/nastiazaitseva/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.manage().window().maximize();

        driver.get("https://www.google.com");

        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys("Java language");
        element.submit();

        System.out.println(driver.getTitle());

        driver.quit();
    }
}