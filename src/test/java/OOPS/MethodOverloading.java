package OOPS;

import org.junit.jupiter.api.Test;

public class MethodOverloading {

    //method with same name and different parameters

    @Test
    public void testMethodOverloading(){
        testCaseStatus();
        testCaseStatus("Pass");
        testCaseStatus("Pass", "screenshotpath1");
        testCaseStatus("Pass", 5,"screenshotpath1");
//        testCaseStatus(5 ,"Pass", "screenshotpath1");
    }

    void testCaseStatus(){
        System.out.println("No Parameters");
    }

    void testCaseStatus(String status){
        System.out.println(status);
    }

    void testCaseStatus(String status, String screenshot){
        System.out.println(status);
        System.out.println(screenshot);
    }

    void testCaseStatus(String status, int testCaseCount, String screenshot){
        System.out.println(status);
        System.out.println(testCaseCount);
        System.out.println(screenshot);
    }




}
