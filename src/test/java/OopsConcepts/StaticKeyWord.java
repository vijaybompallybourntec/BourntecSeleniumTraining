package OopsConcepts;

import org.junit.jupiter.api.Test;

public class StaticKeyWord {

    @Test
    public void staticTest(){
        BaseClass baseclass = new BaseClass();

        baseclass.openBrowser();

        BaseClass.OpenStaticBrowser();

    }

    @Test
    public void staticTest2(){
        BaseClass baseclass = new BaseClass();

        baseclass.openBrowser();

        BaseClass.OpenStaticBrowser();

    }
}
