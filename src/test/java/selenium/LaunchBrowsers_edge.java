package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchBrowsers_edge {

    public static WebDriver driver;

    @Test
    public void launchEdgeBrowser() throws InterruptedException {

        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();

        Thread.sleep(3000);
        driver.manage().window().maximize();

        driver.get("https://github.com/bonigarcia/webdrivermanager");
        Thread.sleep(3000);
        System.out.println(driver.getCurrentUrl()); //fetch current url

        System.out.println(driver.getTitle());

        driver.close();
    }

}
