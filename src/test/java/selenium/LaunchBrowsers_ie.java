package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LaunchBrowsers_ie {

    public static WebDriver driver;

    @Test
    public void launchIEBrowser() throws InterruptedException {

        WebDriverManager.iedriver().setup();
        driver = new InternetExplorerDriver();

        Thread.sleep(3000);
        driver.manage().window().maximize();

        driver.get("https://github.com/bonigarcia/webdrivermanager");
        Thread.sleep(3000);
        System.out.println(driver.getCurrentUrl()); //fetch current url

        System.out.println(driver.getTitle());

        driver.close();
    }

}
