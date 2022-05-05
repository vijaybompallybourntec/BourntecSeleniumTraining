package javaDemo;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class JUnitDemo {

    @Test
    public void tesingJunit1(){
        System.out.println("Testing junit1");
        long mobileNumber = 98490984;
        String accNumber=  "0012345";
        String email = "vijay@bourntec.com";
        boolean testCaseStatus = true;
        long testCaseCount = 5;
        double productPrice = 798.50;
        float productPrice1 = 798;
        System.out.println("Email Value is "+email);
    }

    @Test
    public void tesingJunit2(){
        System.out.println("Testing junit2");
//        System.out.println(testCaseCount);
    }

    @Test
    public void tesingJunit3(){
/*        System.out.println("Testing junit3"); */
    }

    @Test
    public void tesingJunit4(){
//        System.out.println("Testing junit4");
    }

}
