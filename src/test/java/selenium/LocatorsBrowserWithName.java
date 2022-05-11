package Selenium;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LocatorsBrowserWithName extends TestBase {

    @Test
    public void locatorsWithBrowsers() throws InterruptedException {
        getDriver();
        driver.get("https://www.saucedemo.com/");
        Thread.sleep(3000);

        WebElement userNameEdit = driver.findElement(By.name("user-name"));
        userNameEdit.sendKeys("standard_user");

        WebElement passwordEdit = driver.findElement(By.name("password"));
        passwordEdit.sendKeys("secret_sauce");

        System.out.println(userNameEdit.getTagName());
        System.out.println(userNameEdit.getAttribute("data-test"));
        System.out.println(userNameEdit.getText());
        System.out.println(userNameEdit.getAttribute("value"));


        //driver.close();

    }
}
