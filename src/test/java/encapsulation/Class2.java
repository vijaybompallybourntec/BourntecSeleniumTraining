package encapsulation;

import org.junit.jupiter.api.Test;

public class Class2 {

    @Test
    public void testEncap(){
        Class1 obj = new Class1();

        System.out.println(obj.getAccNum());
        obj.setAccNum("12345");
        System.out.println(obj.getAccNum());
    }
}
