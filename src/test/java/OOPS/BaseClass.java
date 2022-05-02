package OOPS;

import org.junit.jupiter.api.Test;


// does not return anything
// name should be same as class name

public class BaseClass {
    String browser = "chrome";
    static String staticBrowser = "chrome";
    String url = "www.google.com";
    int nonstatic = 0;
    static int Static= 0;

    // default constructor
    BaseClass(){  // method name and class name are same
        System.out.println("Default Constructor");
    }

    public BaseClass(String browser) {  //parameterised constructor
        if(browser.equalsIgnoreCase("chrome")){
            System.out.println("Chrome Browser is opened");
        } else
        if(browser.equalsIgnoreCase("firefox")){
            System.out.println("firefox Browser is opened");
        }
    }

    public void openBrowser(){
        nonstatic++;
        Static++;
        System.out.println("Open Chrome Browser");
    }

    public static void openStaticBrowser(){
//        nonstatic++;  // non static variables or methods cannot be called from static methods
        Static++;
        System.out.println("Open static Chrome Browser");
    }

    public void closeBrowser(){

        System.out.println("Close Chrome Browser");
    }
}
