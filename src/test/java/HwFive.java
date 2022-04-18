
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

    public class HwFive {

        @Test
        public void firstTest() throws InterruptedException {

            System.setProperty("webdriver.chrome.driver", "/Users/nastiazaitseva/Downloads/chromedriver");

            WebDriver driver = new ChromeDriver();

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.manage().window().maximize();

            driver.get("https://skims.com/account/login");
            Thread.sleep(3000);


            WebElement Email = driver.findElement(By.id("customerEmail"));
            Email.sendKeys("test@test.com");
            Thread.sleep(3000);

            WebElement password = driver.findElement(By.id("customerPassword"));
            password.sendKeys("pass123");
            Thread.sleep(3000);

            WebElement signinButton = driver.findElement(By.xpath("//button[contains(text(),'sign in')]"));
            signinButton.click();
            Thread.sleep(3000);

            driver.quit();

        }

    }



