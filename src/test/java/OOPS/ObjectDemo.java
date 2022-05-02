package OOPS;

import org.junit.jupiter.api.Test;

public class ObjectDemo {

    @Test
    public void objectDemo(){

        BaseClass baseClass = new BaseClass();

        baseClass.openBrowser();
        baseClass.closeBrowser();
        System.out.println(baseClass.browser);
    }
}
