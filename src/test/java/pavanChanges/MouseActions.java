package pavanChanges;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;


public class MouseActions extends BaseClass {

    @Test
    public void Act() throws InterruptedException
    {
        launch();
        driver.get("https://www.flipkart.com/");
        driver.findElement(By.xpath("//div[@class='_2Sn47c']/descendant::button[1]")).click();
        Thread.sleep(3000);
//        Mouse over all the menus in flipkart and capture the links
        Actions act = new Actions(driver);
        act.moveToElement(driver.findElement(By.xpath("(//div[@class='eFQ30H']/*)[1]"))).build().perform();
        Thread.sleep(3000);
        act.moveToElement(driver.findElement(By.xpath("(//div[@class='eFQ30H']/*)[2]"))).build().perform();
        Thread.sleep(3000);
        act.moveToElement(driver.findElement(By.xpath("(//div[@class='eFQ30H']/*)[3]"))).build().perform();
        Thread.sleep(3000);
        act.moveToElement(driver.findElement(By.xpath("(//div[@class='eFQ30H']/*)[4]"))).build().perform();
        Thread.sleep(3000);
        act.moveToElement(driver.findElement(By.xpath("(//div[@class='eFQ30H']/*)[5]"))).build().perform();
        Thread.sleep(3000);
        act.moveToElement(driver.findElement(By.xpath("(//div[@class='eFQ30H']/*)[6]"))).build().perform();
        Thread.sleep(3000);
        act.moveToElement(driver.findElement(By.xpath("(//div[@class='eFQ30H']/*)[7]"))).build().perform();
        Thread.sleep(3000);
        act.moveToElement(driver.findElement(By.xpath("(//div[@class='eFQ30H']/*)[8]"))).build().perform();
        Thread.sleep(3000);
        act.moveToElement(driver.findElement(By.xpath("(//div[@class='eFQ30H']/*)[9]"))).build().perform();
        Thread.sleep(3000);
// links of only  main menu
        List<WebElement> WE = driver.findElements(By.xpath("//div[@class='eFQ30H']/*"));
        for (int i=0;i<WE.size();i++){
            System.out.println(WE.get(i).getText()+"__"+WE.get(i).getAttribute("href"));
        }
// name & links of each and every webelement present in webpage
        List<WebElement> links1 = driver.findElements(By.xpath("(//div[@id='container']//following-sibling::div)/*"));

        List<WebElement> links = driver.findElements(By.tagName("a"));
        for (int i=0;i<links.size();i++){
            System.out.println(links1.get(i).getText()+"_"+links.get(i).getAttribute("href"));
        }


        driver.close();
        driver.quit();

    }
}
