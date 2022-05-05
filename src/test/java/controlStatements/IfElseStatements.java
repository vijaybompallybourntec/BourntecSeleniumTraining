package controlStatements;

import org.junit.jupiter.api.Test;

public class IfElseStatements {
    String browser = "firefox";

    @Test
    public void ifElseDemo(){

        if(browser.equalsIgnoreCase("chrome"))
        {
            System.out.println("Open Chrome browser");
        } else
        {
            System.out.println("This is not chrome browser");
        }

    }

    @Test
    public void ifElseIfDemo(){

        if(browser.equalsIgnoreCase("chrome"))
        {
            System.out.println("Open Chrome browser");
        } else
        if(browser.equalsIgnoreCase("ie"))
        {
            System.out.println("Open IE browser");
        } else
        if(browser.equalsIgnoreCase("firefox"))
        {
            System.out.println("Open firefox browser");
        } else
        {
            System.out.println("Not a valid browser");
        }

    }
}
