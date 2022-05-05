package selenium.xpathLocator;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import selenium.TestBase;

import java.util.List;

public class MouseActions2 extends TestBase {


    // This method is used to launch chrome browser
    //
    @Test
    public void launchChromeBrowser() throws InterruptedException {
        getWebDriver();
        Thread.sleep(3000);
        driver.get("http://flipkart.com");
        WebElement closeIcon = driver.findElement(By.xpath("/html/body/div[2]/div/div/button"));
        closeIcon.click();

        WebElement electronicsLink = driver.findElement(By.xpath(" //div[text()='Electronics']"));

        Actions action = new Actions(driver);
        action.contextClick(electronicsLink).perform();
    }
}
