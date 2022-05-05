package OOPS;

import org.junit.jupiter.api.Test;

public class Constructors {

    @Test
    public void testConstructor(){
        BaseClass baseClass = new BaseClass();

        BaseClass baseClassParamChrome = new BaseClass("chome");
        BaseClass baseClassParamFirefox = new BaseClass("firefox");

        baseClass.openBrowser();
    }
}
