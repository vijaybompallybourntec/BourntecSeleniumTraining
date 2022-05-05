package selenium.Tamiz;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestBaseTamiz {
    public static WebDriver driver;
    private static FileInputStream fis;
    private static Properties test_config;


    private static void configuration_setup()
    {
        try {
            fis = new FileInputStream("src\\test\\java\\base_package\\test_configuration.properties");
            test_config=new Properties();
            test_config.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void openBrowser()
    {
//        configuration_setup();
//        String browserName=test_config.getProperty("browserName");
        String browserName="chrome";
        System.out.println(browserName);
        try {
            switch (browserName) {
                case "chrome" :
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    driver.manage().window().maximize();

            }

        }
        catch (Exception e){e.printStackTrace();}
    }

    public static void openUrl()
    {
        driver.get("https://www.flipkart.com/");
    }
    public static void closeBrowser()
    {
        driver.close();
    }
}

