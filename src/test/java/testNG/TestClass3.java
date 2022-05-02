package testNG;

import org.testng.annotations.Test;

public class TestClass3 extends TestBaseTestNG{

    @Test(groups={"SMOKETEST"})
    public void testCase4(){
        System.out.println("This is test case 4");
    }

    @Test(groups={"REGRESSIONTEST"})
    public void testCase5(){
        System.out.println("This is test case 5");
    }

    @Test(groups={"SMOKETEST"})
    public void testCase6(){
        System.out.println("This is test case 6");
    }

    @Test(groups={"REGRESSIONTEST"})
    public void testCase7(){
        System.out.println("This is test case 7");
    }

}
