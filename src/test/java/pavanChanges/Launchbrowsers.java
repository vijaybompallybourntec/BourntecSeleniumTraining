package pavanChanges;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class Launchbrowsers {

    public static WebDriver driver;
   @Test
    public void launchedgebrowser() throws InterruptedException {
        WebDriverManager.edgedriver().setup();
        driver=new EdgeDriver();

        Thread.sleep(2000);
        driver.get("https://mvnrepository.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.getCurrentUrl();
        Thread.sleep(3000);
        driver.getTitle();
//        driver.getPageSource();
       driver.close();
       driver.quit();
    }
    @Test
 public void launchchromebrowser() throws InterruptedException {
       WebDriverManager.chromedriver().setup();
     ChromeOptions options = new ChromeOptions();
     options.addArguments("--start-maximized");
     driver =new ChromeDriver(options);
     driver.get("https://www.google.com/");
     Thread.sleep(5000);
        System.out.println(driver.getTitle());
     Thread.sleep(2000);
        System.out.println(driver.getCurrentUrl());
        Thread.sleep(2000);

     driver.close();
     driver.quit();

 }

}
