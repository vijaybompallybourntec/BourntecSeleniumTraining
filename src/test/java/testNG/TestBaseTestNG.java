package testNG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;

public class TestBaseTestNG {
    public static WebDriver driver ;

    //this will run before all tests
    @BeforeSuite
    public void getEnvironmentVariables(){
        System.out.println("Get environment variables");
        System.out.println("Browser is chrome");
        System.out.println("Environment is Stage");
        System.out.println("URL is xyz");
    }

    @BeforeMethod
    public WebDriver getWebDriver() {
        System.out.println("Opening chrome browser");
        String browser = "Chrome";

        if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--start-maximized");
            driver = new ChromeDriver(chromeOptions);
        } else if (browser.equalsIgnoreCase("edge")) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }
        return driver;
    }

    @AfterMethod
    public void closeBrowser(){
        driver.close();
    }
}
