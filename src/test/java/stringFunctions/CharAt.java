package stringFunctions;

import org.junit.jupiter.api.Test;

public class CharAt {
    @Test
    public void test01(){
        String s1 = "manoj";
        System.out.println("given string contains "+s1.length()+" characters");
        System.out.println(s1.charAt(4));
    }
}
