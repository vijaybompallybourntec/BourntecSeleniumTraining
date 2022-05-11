package OopsConcepts;

import org.junit.jupiter.api.Test;

public class Constructors {

    @Test
    public void constructors(){
        BaseClass baseClass = new BaseClass();
        BaseClass baseClassParamChrome = new BaseClass("chrome");
        BaseClass baseClassParamFirefox = new BaseClass("firefox");

        baseClass.openBrowser();
    }
}
