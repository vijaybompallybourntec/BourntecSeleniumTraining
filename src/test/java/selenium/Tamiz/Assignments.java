package selenium.Tamiz;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Assignments extends TestBaseTamiz {

    static Actions mouse;
    private static Wait wait;

    @BeforeClass
    public static void testStarts()
    {
        openBrowser();
        openUrl();
        wait=new WebDriverWait(driver, 30);
        mouse=new Actions(driver);
        driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
    }
    @AfterClass
    public static void testEnds()
    {
        //Test_Base.closeBrowser();
    }

    @Test
    public void fetchMenuLinks() throws InterruptedException {

        List<WebElement> mainMenu=driver.findElements(By.xpath("//div[@class=\"_37M3Pb\"]/div/a/div[2]"));
        for(WebElement div:mainMenu)
        {
            if(div.getAttribute("class").equals("xtXmba"))
            {
                System.out.println(div.getText());
            }
            else  if(div.getAttribute("class").equals("_1psGvi SLyWEo"))
            {
                System.out.println("\n"+div.findElement(By.xpath(".//div[@class='xtXmba']")).getText());
                System.out.println("================================================================");
                mouse.moveToElement(div).perform();
                Thread.sleep(1000);
                List<WebElement> subMenu=div.findElements(By.xpath("./div[2]//a"));
                for (WebElement link:subMenu)
                {
                    System.out.println(link.getText());
                }
            }
        }

    }
    @Test
    public void fetchAcDetails() throws InterruptedException {
       /* String style=driver.findElement(By.xpath("//div[@class='_3eARKq']")).getAttribute("style");
        while(!style.contains("-3999"))
        {
            driver.findElement(By.xpath("//div[@class='_2t2dSp']")).click();
            style=driver.findElement(By.xpath("//div[@class='_3eARKq']")).getAttribute("style");
        }*/

        //clicking AC banner
        WebElement acBanner= (WebElement) wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[@class='_2a3TMW']//img[@alt='AC']/../.."))));
        acBanner.click();
        Thread.sleep(2000);
        List<WebElement> products=driver.findElements(By.xpath("//div[@class='_2kHMtA']"));
        List<String> name=new ArrayList<>();
        List<String> price=new ArrayList<>();
        List<String> reviews=new ArrayList<>();

        //fetching products and filling the lists
        for (WebElement product:products)
        {
            name.add(product.findElement(By.xpath(".//div[@class='_4rR01T']")).getText().trim());
            price.add(product.findElement(By.xpath(".//div[@class='_30jeq3 _1_WHN1']")).getText().trim().replace(",",""));
            reviews.add(product.findElement(By.xpath(".//span[contains(@id,'productRating')]/div")).getText().trim());
        }
        for (int i=0;i< name.size();i++)
        {
            System.out.println(name.get(i)+" "+price.get(i)+" "+reviews.get(i));
        }

        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='_10UF8M' and contains(text(),'Low to High')]")).click();
        System.out.println("low to high clicked");
        //clicking low to high filter
        //WebElement lowToHigh= (WebElement) wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class='_10UF8M' and contains(text(),'Low to High')]"))));
        //lowToHigh.click();
        products= (List<WebElement>) wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@class='_2kHMtA']")));
        price.clear();
        List<WebElement> priceOfProducts = driver.findElements(By.xpath("//div[@class='_25b18c']/div[1]"));
        for (WebElement product:
                priceOfProducts) {
            System.out.println("inside products");
            price.add(product.getText().trim().replace(",","").replace("₹",""));

        }

        //checking if price sorted
        if(checkPriceSorted(price))
        {
            System.out.println("price is sorted");
        }
        else
        {
            System.out.println("price is not sorted");
        }



    }

    public boolean checkPriceSorted(List<String> price)
    {
        for (int i=0;i<price.size()-1;i++)
        {
            System.out.println(price.get(i));
            double first=Double.parseDouble(price.get(i));
            double second=Double.parseDouble(price.get(i+1));
            if(!(first<second))
            {
                return false;
            }
        }
        return  true;
    }



}
