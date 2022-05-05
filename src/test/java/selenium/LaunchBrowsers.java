package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;

public class LaunchBrowsers extends  TestBase{

    @Test
    public void launchChromeBrowser() throws InterruptedException {
        getWebDriver();
        driver.get("https://github.com/bonigarcia/webdrivermanager");
        System.out.println(driver.getCurrentUrl()); //fetch current url
        System.out.println(driver.getTitle());


        driver.close();
    }

}
