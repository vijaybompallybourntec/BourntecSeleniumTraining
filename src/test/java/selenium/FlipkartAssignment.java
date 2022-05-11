package Selenium;

import Selenium.LaunchBrowsers;
import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static java.lang.Double.valueOf;

public class FlipkartAssignment {

    public class flipkart extends LaunchBrowsers {

        @Test
        public void getAcLink() throws InterruptedException {

            getDriver();

            driver.get("");

            WebElement closeButton = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));

            closeButton.click();

            // selecting the AC link from application

            WebElement acLinks = driver.findElement(By.xpath("(//img[@class='kJjFO0 _3DIhEh'])[3]"));

            Thread.sleep(5000);

            acLinks.click();
        }


        // capturing all the AC's names

        @Test
        public void capturingAcNames() throws InterruptedException {

            getAcLink();

            Thread.sleep(5000);

            List<WebElement> acNames = driver.findElements(By.xpath("//*[@class='_4rR01T']"));

            Thread.sleep(5000);

            System.out.println("Total AirConditioners are - " + acNames.size());

            for (int i = 0; i < acNames.size(); i++) {

                System.out.println(acNames.get(i).getText());

            }

        }


        // Capturing the ratings of AC

        @Test

        public void getRatings() throws InterruptedException {

            getAcLink();

            Thread.sleep(5000);


            List<WebElement> acRatings = driver.findElements(By.xpath("//*[@class='_3LWZlK']"));

            Thread.sleep(5000);

            System.out.println(acRatings.size());

            for (int i = 0; i < acRatings.size(); i++) {

                System.out.println(acRatings.get(i).getText());

            }


        }


        @Test

        public void getPricesAndSort() throws InterruptedException {

            getAcLink();

            Thread.sleep(5000);

            List<WebElement> prices = driver.findElements(By.xpath("//*[@class='_30jeq3 _1_WHN1']"));

            Thread.sleep(5000);


            List<Double> beforeSorting = new ArrayList<>();

            for (WebElement amt : prices) {

                beforeSorting.add(Double.valueOf(amt.getText().replace("₹", "").replace(",", "")));
            }

            Thread.sleep(3000);

            System.out.println("Actual pricelist of AC's Before sorting " + beforeSorting);

            // Hovering to price low-high option

            driver.findElement(By.xpath("//div[text()='Price -- Low to High']")).click();

            Thread.sleep(3000);

            // fetching all the prices from Low-High option

            List<WebElement> lowToHigh = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));

            List<Double> orderedPrices = new ArrayList<>();

            for (WebElement LW : lowToHigh) {

                orderedPrices.add(Double.valueOf(LW.getText().replace("₹", "").replace(",", "")));
            }

            Thread.sleep(3000);

            System.out.println("list of Ordered prices from Low-High option " + orderedPrices);

            Collections.sort(beforeSorting);

            System.out.println("After sorting original prices are " + beforeSorting);

            Assertions.assertEquals(beforeSorting, orderedPrices);

        }

    }
}
