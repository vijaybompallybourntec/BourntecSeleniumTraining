package OopsConcepts;

import org.junit.jupiter.api.Test;

public class methodsWithParameters {

    @Test
    public void testingMethod(){
        openBrowser("chrome");
        openBrowser("firefox");
  //      System.out.println(checkIfchromeBrowserisOpen());
        int sum1= getSumOfNumbers(5,7);
        int sum2=getSumOfNumbers(10,12);
        System.out.println("sum1 "+sum1);
        System.out.println("sum2 "+sum2);
    }

    private int getSumOfNumbers(int firstNumber, int secondNumber) {
        int sum = firstNumber+secondNumber;
        System.out.println("sum is "+ sum);
        return sum;
    }

    public void openBrowser(String browser){
        System.out.println("open browser"+ browser);
    }

    public String checkIfchromeBrowserisOpen(){
        return "yes";
    }

}
