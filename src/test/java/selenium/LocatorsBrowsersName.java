package selenium;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LocatorsBrowsersName extends  TestBase{

    @Test
    public void launchChromeBrowser() throws InterruptedException {
        getWebDriver();
        driver.get("https://www.saucedemo.com/");
        Thread.sleep(5000);


        WebElement userNameEdit = driver.findElement(By.name("user-name"));
        System.out.println("Get Text: "+userNameEdit.getText());
        System.out.println("Get Value: "+userNameEdit.getAttribute("value"));
        userNameEdit.sendKeys("standard_user");

        WebElement passwordEdit = driver.findElement(By.name("password"));
        passwordEdit.sendKeys("secret_sauce");

        System.out.println(userNameEdit.getTagName());
        System.out.println(userNameEdit.getAttribute("placeholder"));
        System.out.println("Get Text: "+userNameEdit.getText());
        System.out.println("Get Value: "+userNameEdit.getAttribute("value"));


//        driver.close();
    }

}
