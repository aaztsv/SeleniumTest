
import Base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class HwFive extends Base {

    @Test
    public void firstTest() throws InterruptedException {

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

    }

}



