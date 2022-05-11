package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MouseActionsAssignment {
    public static WebDriver driver;


    @BeforeAll
    public static void flipkartAcAssignment () throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");
        Thread.sleep(5000);
        WebElement closeLoginWindow = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
        closeLoginWindow.click();
        Thread.sleep(3000);
    }
    @Test
    public void electronics() throws InterruptedException {

        WebElement electronics = driver.findElement(By.xpath("//div[text()='Electronics']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(electronics).perform();
        // List<WebElement> eList = driver.findElements(By.xpath("//div[text()='Electronics']//following::a"));
        List<WebElement> displayedlist = driver.findElements(By.xpath("//a[@class = '_6WOcW9']"));
        for (int i = 0; i < displayedlist.size(); i++) {
            System.out.println(displayedlist.get(i).getText());
        }

    }

    @Test
    public void fashions() throws InterruptedException {

        WebElement fashion = driver.findElement(By.xpath("//div[text()='Fashion']"));
        Actions actions1 = new Actions(driver);
        actions1.moveToElement(fashion).perform();
        List<WebElement> fashionList = driver.findElements(By.xpath("//div[text()='Fashion']//following:: a"));
        for (int j = 0; j < fashionList.size(); j++) {
            System.out.println(fashionList.get(j).getText());
        }
    }

    @Test
    public void home() throws InterruptedException {

        WebElement home = driver.findElement(By.xpath("//div[text()='Home']"));
        Actions actions2 = new Actions(driver);
        actions2.moveToElement(home).perform();
        List<WebElement> hList = driver.findElements(By.xpath("//div[text()='Home']//following:: a"));
        for (int k = 0; k < hList.size(); k++) {
            System.out.println(hList.get(k).getText());
        }
    }

    @Test
    public void beauty() throws InterruptedException {

        WebElement beauty = driver.findElement(By.xpath("//div[text()='Beauty, Toys & More']"));
        Actions actions3 = new Actions(driver);
        actions3.moveToElement(beauty).perform();
        List<WebElement> bList = driver.findElements(By.xpath("//div[text()='Beauty, Toys & More']//following:: a"));
        for (int l = 0; l < bList.size(); l++) {
            System.out.println(bList.get(l).getText());
        }

    }

    @Test
    public void appliances() throws InterruptedException {
        WebElement appliances = driver.findElement(By.xpath("//div[text()='Appliances']"));
        Actions actions4 = new Actions(driver);
        actions4.moveToElement(appliances).perform();
        List<WebElement> aList = driver.findElements(By.xpath("//div[text()='Appliances']//following:: a"));
        for (int m = 0; m < aList.size(); m++) {
            System.out.println(aList.get(m).getText());

        }
    }

}


