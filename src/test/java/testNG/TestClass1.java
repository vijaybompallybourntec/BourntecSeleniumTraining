package testNG;

import org.testng.annotations.Test;

public class TestClass1 extends TestBaseTestNG{

    @Test(enabled = false)
    public void testCase1(){
        System.out.println("This is test case 1");
    }

    @Test(enabled = true)
    public void testCase2(){

        System.out.println("This is test case 2");
    }


}
