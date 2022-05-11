package OopsConcepts;

import org.junit.jupiter.api.Test;

public class inheritance extends BaseClass{
    String browser ="firefox";

    @Test
    public void inheritance (){
        System.out.println("child class browser" + this.browser);
        System.out.println("parent class browser" + super.browser);
        openBrowser();
    }
}
