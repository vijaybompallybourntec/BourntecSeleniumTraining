package selenium.xpathLocator;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import selenium.TestBase;

import java.util.List;

public class SelectDropdown extends TestBase {

    @Test
    public void launchChromeBrowser() throws InterruptedException {
        getWebDriver();
        driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
        String gend="f";

        WebElement countryDropdown = driver.findElement(By.xpath("//select[starts-with(@name,'country')]"));

        Select select = new Select(countryDropdown);
        System.out.println("Selected Value: "+select.getFirstSelectedOption().getText());
        select.selectByIndex(8);
        System.out.println("Selected Value: "+select.getFirstSelectedOption().getText());
        select.selectByValue("7");
        System.out.println("Selected Value: "+select.getFirstSelectedOption().getText());
        select.selectByVisibleText("Benin");
        System.out.println("Selected Value: "+select.getFirstSelectedOption().getText());

        List<WebElement> dropdownValues = select.getOptions();
        System.out.println(dropdownValues.size());
        for(int i=0;i<dropdownValues.size();i++){
            System.out.println("Dropdown Values "+dropdownValues.get((i)).getText());
        }
        }


    }



