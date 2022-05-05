package selenium;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LocatorsBrowsers extends  TestBase{

    @Test
    public void launchChromeBrowser() throws InterruptedException {
        getWebDriver();
        driver.get("http://register.rediff.com/register/register.php?FormName=user_details");

        WebElement createMyAccountButton = driver.findElement(By.id("Register"));
        createMyAccountButton.click();



//        driver.close();
    }

}
