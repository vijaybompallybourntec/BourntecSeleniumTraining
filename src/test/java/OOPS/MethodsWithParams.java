package OOPS;

import org.junit.jupiter.api.Test;

public class MethodsWithParams {

    @Test
    public void testingMethods(){
        openBrowser("chrome");
        openBrowser("firefox");
//        System.out.println(checkIfChromeBrowserIsOpened());
        int sum1= getSumOfNumbers(2,4);
        int sum2 = getSumOfNumbers(4,8);
        System.out.println("sum1 "+sum1);
        System.out.println("sum2 "+sum2);
        getData(1, true, "ie");
    }

    private void getData(int int1, boolean b, String ie) {

    }

    private int getSumOfNumbers(int firstNum, int secNumber) {
        int sum = firstNum + secNumber;
        System.out.println("Sum is "+sum);
        return sum;
    }


    public void openBrowser(String browser){
        System.out.println("Opening browser: "+browser);
    }

    public boolean checkIfChromeBrowserIsOpened(){
        return true;
    }



}
