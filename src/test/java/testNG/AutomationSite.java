package testNG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AutomationSite {

    public static WebDriver driver;
    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);

    }
    @Test
    public void openURL() throws InterruptedException {
        driver.get("http://demo.automationtesting.in/Register.html");
        System.out.println(driver.getTitle());
        Assert.assertEquals("Register","Register");
       WebElement file = driver.findElement(By.id("imagesrc"));
       file.sendKeys("D:\\pexels-pixabay-60597.jpg");
       Thread.sleep(3000);
    }
    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
