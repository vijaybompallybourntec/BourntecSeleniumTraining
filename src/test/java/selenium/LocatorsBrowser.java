package Selenium;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LocatorsBrowser extends TestBase {

    @Test
    public void launchChromeBrowsers() throws InterruptedException {
        getDriver();
        driver.get("https://www.facebook.com/login/");

        WebElement LoginButton = driver.findElement(By.id("loginbutton"));
        LoginButton.click();
        //driver.close();

    }
}
