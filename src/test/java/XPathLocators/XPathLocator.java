package XPathLocators;

import Selenium.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class XPathLocator extends TestBase {

    @Test
    public void launchChromeBrowsers() throws InterruptedException {
        getDriver();
        driver.get("https://register.rediff.com/register/register.php?FormName=user_details");

        WebElement link1 = driver.findElement(By.xpath("terms and conditions"));
        link1.click();
    }
}
