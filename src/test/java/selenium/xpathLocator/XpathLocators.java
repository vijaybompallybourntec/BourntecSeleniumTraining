package selenium.xpathLocator;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import selenium.TestBase;

public class XpathLocators   extends TestBase {

    @Test
    public void launchChromeBrowser() throws InterruptedException {
        getWebDriver();
        driver.get("http://register.rediff.com/register/register.php?FormName=user_details");

        WebElement link1 = driver.findElement(By.xpath("terms and conditions"));


    }

}

