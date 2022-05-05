package selenium.xpathLocator;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import selenium.TestBase;

import java.util.List;

public class CheckBoxesRadioButtons extends TestBase {

    @Test
    public void launchChromeBrowser() throws InterruptedException {
        getWebDriver();
        driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
        String gend="f";

        WebElement checkBox = driver.findElement(By.xpath("//input[starts-with(@name,'chk_altemail')]"));
        checkBox.click();

        List<WebElement> genderRadio = driver.findElements(By.xpath("//input[starts-with(@name,'gender')]"));
        for(int i=0;i<genderRadio.size();i++){
            System.out.println(genderRadio.get(i).getAttribute("value"));
            if(genderRadio.get(i).getAttribute("value").equalsIgnoreCase(gend)){
                genderRadio.get(i).click();
            }
        }


    }

}

