package pavanChanges;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseClass {
    public static WebDriver driver;
    @Test
     public void launch() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions Options= new ChromeOptions();
        Options.addArguments("--Start-Maximized");
        driver=new ChromeDriver();

     }
}
