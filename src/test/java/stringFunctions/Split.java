package stringFunctions;

import org.junit.jupiter.api.Test;

public class Split {

    @Test
    public void split() {
       String actValue = "Total amount is ₹10,400.00";

      String actValueArray[] = actValue.split("\\s");

      System.out.println(actValueArray.length);
        System.out.println(actValueArray[0]);
        System.out.println(actValueArray[1]);
        System.out.println(actValueArray[2]);
        System.out.println(actValueArray[3]);

        String amountArray[] = actValue.split("₹");
        Double amtValue = Double.parseDouble(amountArray[1].replace(",",""));

        System.out.println(amtValue);
    }

}


