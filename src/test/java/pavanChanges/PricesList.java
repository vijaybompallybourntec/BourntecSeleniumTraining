package pavanChanges;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class PricesList extends BaseClass {
    @Test
    public void pricelist() throws InterruptedException {
        launch();
        driver.get("https://www.flipkart.com/");
        driver.findElement(By.xpath("//div[@class='_2Sn47c']/descendant::button[1]")).click();
        Thread.sleep(3000);
//select acs link
//Capture all the prices to a list
//capture names to a link
//capture all the ratings to a list
        driver.findElement(By.xpath("(//div[@id='container']//following-sibling::div)[35]")).click();
        driver.findElement(By.xpath("(//img[@alt='AC'])[2]")).click();
        Thread.sleep(2000);

        List<WebElement> AC_NAMES = driver.findElements(By.xpath("//div[@class='col col-7-12']/child::div[1]"));
        List<WebElement> ratings = driver.findElements(By.xpath("//div[@class='col col-7-12']/descendant::div[3]"));
        List<WebElement> prices = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
        List<WebElement> links = driver.findElements(By.xpath("//a[@target='_blank']"));


        for (int i=0;i<AC_NAMES.size();i++) {
            System.out.println(AC_NAMES.get(i).getText()+"__"+ratings.get(i).getText()+"__"+prices.get(i).getText()+"_:"+links.get(i).getAttribute("href"));

        }

        driver.close();
        driver.quit();

    }
}
