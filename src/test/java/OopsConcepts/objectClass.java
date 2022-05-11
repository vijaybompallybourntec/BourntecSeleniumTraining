package OopsConcepts;

import org.junit.jupiter.api.Test;

public class objectClass {


    @Test
    public void ObjectClass(){
        BaseClass baseClass = new BaseClass();

        baseClass.openBrowser();
        baseClass.closeBrowser();
        System.out.println(baseClass.browser);
    }
}