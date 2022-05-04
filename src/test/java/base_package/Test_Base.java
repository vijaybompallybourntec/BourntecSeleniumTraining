package base_package;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Test_Base {
   public static WebDriver driver;
   private static FileInputStream fis;
   private static Properties test_config;


   private static void configuration_setup()
    {
        try {
            fis = new FileInputStream("src\\test_configuration.properties");
            test_config=new Properties();
            test_config.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void openBrowser()
    {
        configuration_setup();
        String browserName=test_config.getProperty("browserName");
        System.out.println(browserName);
        try {
            switch (browserName) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    driver.manage().window().maximize();
                    break;

                case "ie":
                    WebDriverManager.iedriver().setup();
                    driver = new InternetExplorerDriver();
                    break;

                case "mozilla":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                default:
                    throw new Exception("no suitable driver found");
            }

        }
        catch (Exception e){e.printStackTrace();}
    }

    public static void openUrl()
    {
        driver.get(test_config.getProperty("url"));
    }
    public static void closeBrowser()
    {
        driver.close();
    }
}
