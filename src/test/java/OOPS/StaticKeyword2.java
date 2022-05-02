package OOPS;

import org.junit.jupiter.api.Test;

public class StaticKeyword2 {

    int count = 0;
    static int countStatic = 0;

    StaticKeyword2(){
        count++;
        System.out.println("non Static "+count);

        countStatic++;
        System.out.println("Static: "+countStatic);
    }

    @Test
    public void staticTest() {
        StaticKeyword2 staticKeyword1=new StaticKeyword2();
        StaticKeyword2 staticKeyword2=new StaticKeyword2();
        StaticKeyword2 staticKeyword3=new StaticKeyword2();
    }
}
