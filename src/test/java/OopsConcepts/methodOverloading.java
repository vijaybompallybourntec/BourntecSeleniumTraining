package OopsConcepts;

import org.junit.jupiter.api.Test;

public class methodOverloading {

    @Test
    public void MethodOverLoading(){
        testCaseStatus();
        testCaseStatus("pass");
        testCaseStatus("pass","ScreenshotPath1");
        testCaseStatus("pass",5,"ScreenshotPath2");
    }

    void testCaseStatus(){
        System.out.println("no parameters");
    }

    void testCaseStatus(String status){
        System.out.println(status);
    }

    void testCaseStatus(String status, String Screenshot){
        System.out.println(status);
        System.out.println(Screenshot);
    }

    void testCaseStatus(String status, int testCaseCount, String Screenshot){
        System.out.println(status);
        System.out.println(testCaseCount);
        System.out.println(Screenshot);
    }
}
