package stringFunctions;

import org.junit.jupiter.api.Test;

public class TrimDemo {
    @Test
    public void trimMethodDemo(){
        String test = " The status of the current testcase is PASS ";
        System.out.println(test);
        //trim() it will remove the before and after spaces of the String.
        System.out.println(test.trim());



    }
}
