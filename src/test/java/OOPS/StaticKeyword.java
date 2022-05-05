package OOPS;

import org.junit.jupiter.api.Test;

public class StaticKeyword {

    @Test
    public void staticTest(){
        BaseClass baseClass = new BaseClass();  // creating object to call other class methods

        baseClass.openBrowser();

        BaseClass.openStaticBrowser();

        //browser, url , env --- static
        // page objects  create objects

    }

    @Test
    public void staticTest2(){
        BaseClass baseClass = new BaseClass();  // creating object to call other class methods

        baseClass.openBrowser();

        BaseClass.openStaticBrowser();

    }
}
