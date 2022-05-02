package OOPS;

import org.junit.jupiter.api.Test;

public class Inheritance extends BaseClass{
String browser = "firefox";
    //acquire all properties from parent object

    @Test
    public void inhDemo(){
        System.out.println("Current class Browser: "+this.browser);
        System.out.println("Parent Class Browser: "+super.browser);
        openBrowser();
    }

}
