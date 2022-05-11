

import Base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class FirstTest extends Base {

    @Test

    public void firstTest(){

        driver.get("https://www.google.com");

        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys("Java language");
        element.submit();

        System.out.println(driver.getTitle());

    }
}