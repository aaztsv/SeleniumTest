import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class PractiseNine {

    @Test

    public void firstTest() throws InterruptedException {

    System.setProperty("webdriver.chrome.driver", "/Users/nastiazaitseva/Downloads/chromedriver");

    WebDriver driver = new ChromeDriver();

    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    driver.manage().window().maximize();

    driver.get("https://selectorshub.com/xpath-practice-page/");
//    Thread.sleep(3000);
//
//    String titleActual = driver.getTitle();
//    String titleExpected =
//            Assert.assertEquals(titleActual, titleExpected);
//    System.out.println("названия вкладки совпадают. тест пройден.");


        WebElement userEmail = driver.findElement(By.id("userId"));
        userEmail.sendKeys("test@test.com");
        Thread.sleep(5000);

        WebElement password = driver.findElement(By.id("pass"));
        password.sendKeys("test@test.com");
        Thread.sleep(5000);

        WebElement company = driver.findElement(By.name("company"));
        company.sendKeys("qa company");
        Thread.sleep(5000);

        WebElement submit = driver.findElement(By.xpath("//input[@type='submit']"));
        submit.click();
        Thread.sleep(5000);

        driver.quit();
}
}
