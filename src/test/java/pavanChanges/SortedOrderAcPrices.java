package pavanChanges;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortedOrderAcPrices extends BaseClass {

    @Test
    public void assign2() throws InterruptedException {
        launch();
        driver.get("https://www.flipkart.com/");
        driver.findElement(By.xpath("//div[@class='_2Sn47c']/descendant::button[1]")).click();
        Thread.sleep(3000);
//click price low to high
//capture the prices displayed
//check whether they are in sorted order
        driver.findElement(By.xpath("(//div[@id='container']//following-sibling::div)[35]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//img[@alt='AC'])[4]")).click();

        ArrayList originallist = new ArrayList();
        ArrayList  list1 = new ArrayList();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//div[@class='_5THWM1']/*[3]")).click();
        Thread.sleep(2000);
        List<WebElement> prices = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
        Thread.sleep(2000);

        for(int i=0;i< prices.size();i++){
            String list2 =prices.get(i).getText().replace("₹","").replace(",","");
            originallist.add(list2);
            list1.add(list2);
        }
        Thread.sleep(2000);
        System.out.println("original list :  "+originallist);
        Collections.sort(list1);
        System.out.println("After sorting list : "+list1);
        System.out.println("comparing"+originallist+"and"+list1+":"+originallist.equals(list1));
        driver.close();
        driver.quit();
    }
}