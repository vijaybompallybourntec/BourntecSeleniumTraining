package testNG;

import org.testng.annotations.*;

public class TestCaseAnnotations {

    @BeforeTest  //opening browser
    public void beforeTest(){
        System.out.println("Before Test");
    }

    @BeforeSuite  //initialise reports, logs, configs, db connections
    public void beforeSuite(){
        System.out.println("Before Suite");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("Before Class");
    }

    @AfterTest  // close browsers, closing the reports, closing db connections
    public void afterTest(){
        System.out.println("After Test");
    }

    @AfterSuite  //close the reports
    public void afterSuite(){
        System.out.println("After Suite");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("After Class");
    }

    @Test
    public void testCase1(){
        System.out.println("This is test case 1");
    }

    @Test
    public void testCase2(){
        System.out.println("This is test case 2");
    }


}
