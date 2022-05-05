package selenium;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LocatorsLinks extends  TestBase{

    @Test
    public void launchChromeBrowser() throws InterruptedException {
        getWebDriver();
        driver.get("http://register.rediff.com/register/register.php?FormName=user_details");

        WebElement link1 = driver.findElement(By.linkText("terms and conditions"));
        link1.click();

        System.out.println(link1.getText());

        WebElement link2 = driver.findElement(By.partialLinkText("terms"));
        link2.click();





    }
}
