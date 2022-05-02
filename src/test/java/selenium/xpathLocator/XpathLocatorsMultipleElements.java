package selenium.xpathLocator;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import selenium.TestBase;

import java.util.List;

public class XpathLocatorsMultipleElements extends TestBase {

    @Test
    public void launchChromeBrowser() throws InterruptedException {
        getWebDriver();
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");


        List<WebElement> automationTools = driver.findElements(By.xpath("//span[text()='Automation Tools']//following-sibling::input"));
        System.out.println(automationTools.size());
        for(int i=0;i<automationTools.size();i++){
            System.out.println(automationTools.get(i).getAttribute("value"));
            if(automationTools.get(i).getAttribute("value").equalsIgnoreCase("Selenium Webdriver")){
                automationTools.get(i).click();
            }
        }


    }

}

