package OopsConcepts;

import jdk.dynalink.beans.StaticClass;
import org.junit.jupiter.api.Test;

public class BaseClass {
    String browser = "chrome";
    static String staticBrowser = "Chrome";
    String url = "www.google.com";
    static int nonStatic =0;
    static int Static =0;

    BaseClass() {
        System.out.println("default browser");
    }

    public BaseClass(String browser) {
        if (browser.equalsIgnoreCase("chrome")) {
            System.out.println("chrome browser is opened");
        } else if (browser.equalsIgnoreCase("firefox")) {
            System.out.println("firefox browser is opened");
        }

    }

    public static void openBrowser() {
        nonStatic++;
        Static++;
        System.out.println("open chrome browser");
    }

    public static void OpenStaticBrowser() {
       // nonstatic++;
        Static++;
        System.out.println("open Static chrome browser");
    }

    public void closeBrowser() {
        System.out.println("close chrome browser");
    }

}