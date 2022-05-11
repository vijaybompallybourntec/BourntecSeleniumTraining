package OopsConcepts;

import org.junit.jupiter.api.Test;

public class StaticKeyWord2 {

    int count = 0;
    static int countStatic =0;

    StaticKeyWord2() {
        count++;
        System.out.println("non Static"+ count);

        countStatic++;
        System.out.println("static: "+ countStatic);
    }

    @Test
    public void staticTest() {
        StaticKeyWord2 staticKeyWord1 =new StaticKeyWord2();
        StaticKeyWord2 staticKeyWord2 =new StaticKeyWord2();
        StaticKeyWord2 staticKeyWord3 =new StaticKeyWord2();

    }
}
