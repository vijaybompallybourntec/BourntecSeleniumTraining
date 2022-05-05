package pavanChanges;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class Locators extends BaseClass {
    @Test
    public void setlaunch() throws InterruptedException {
        launch();
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("pavan");
        Thread.sleep(5000);
        driver.findElement(By.id("password")).sendKeys("1234");
        Thread.sleep(5000);

        System.out.println(driver.getTitle());

            driver.close();
            driver.quit();
        }
        @Test
        public void rediff() throws InterruptedException {
            launch();
            driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
            driver.findElement(By.xpath("(//td[.='Full Name']/../..//td[3])[1]")).sendKeys("rediff");
            driver.findElement(By.xpath("((//td[.='Password']/../..)//td[3])[3]/*[1]")).sendKeys("rediff123");
            driver.findElement(By.xpath("((//td[.='Password']/../..)//td[3])[3]/*[5]")).sendKeys("rediff123");
            driver.findElement(By.xpath("((//td[.='Password']/../..)//td[3])[3]/*[6]")).sendKeys("rediff123");
            driver.findElement(By.xpath("((//td[.='Password']/../..)//td[3])[3]/*[8]")).sendKeys("rediff123");
            driver.findElement(By.xpath("((//td[.='Password']/../..)//td[3])[3]/*[15]")).sendKeys("rediff123");

//            Select select =new Select(driver.findElement(By.xpath("((//td[.='Password']/../..)//td[3])[16]/*/*")));
//            select.deselectByIndex(5);


            driver.findElement(By.xpath("((//td[.='Password']/../..)//td[3])[16]/*[1]")).click();
            driver.findElement(By.xpath("((//td[.='Password']/../..)//td[3])[16]/*[1]/*[5]")).click();
            driver.findElement(By.xpath("((//td[.='Password']/../..)//td[3])[16]/*[2]")).click();
            driver.findElement(By.xpath("((//td[.='Password']/../..)//td[3])[16]/*[2]/*[5]")).click();
            driver.findElement(By.xpath("((//td[.='Password']/../..)//td[3])[16]/*[3]")).click();
            driver.findElement(By.xpath("((//td[.='Password']/../..)//td[3])[16]/*[3]/*[5]")).click();

            driver.findElement(By.xpath("((//td[.='Password']/../..)//td[3])[17]/*[1]")).click();
            driver.findElement(By.xpath("((//td[.='Password']/../..)//td[3])[18]/*/*[1]")).click();
            driver.findElement(By.xpath("((//td[.='Password']/../..)//td[3])[19]")).click();
            driver.findElement(By.xpath("((//td[.='Password']/../..)//td[3])[19]/*/*[31]")).click();




        }

    }

