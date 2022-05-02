package selenium.xpathLocator;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import selenium.TestBase;

import java.util.List;

public class MouseActions extends TestBase {

    @Test
    public void launchChromeBrowser() throws InterruptedException {
        getWebDriver();
        Thread.sleep(3000);
        driver.get("http://flipkart.com");
        WebElement closeIcon = driver.findElement(By.xpath("/html/body/div[2]/div/div/button"));
        closeIcon.click();

        WebElement electronicsLink = driver.findElement(By.xpath(" //div[text()='Electronics']"));
//        electronicsLink.click();

        Actions action = new Actions(driver);
        action.moveToElement(electronicsLink).perform();

        List<WebElement> electronicsLinks = driver.findElements(By.xpath("//div[text()='Electronics']//following::a"));

        for(int i=0;i<electronicsLinks.size();i++){
            System.out.println(electronicsLinks.get(i).getText());
        }

        for(int i=0;i<electronicsLinks.size();i++){
            if(electronicsLinks.get(i).getText().equalsIgnoreCase("Electronics GST Store")){
                electronicsLinks.get(i).click();
                break;
            }
        }


    }
}
