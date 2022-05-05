package stringFunctions;

import org.junit.jupiter.api.Test;

public class Replace {

    @Test
    public void replace() {
        String mrp = "₹65,990.00";
        String discount = "50%";
        String actualvalue = "₹32,995.00";

        double expValue ;

        expValue = convertToDecimal(mrp)*convertToDecimal(discount)/100;

        System.out.println("Expected Value "+expValue);
        System.out.println("Actual Value "+convertToDecimal(actualvalue));

        if(expValue==convertToDecimal(actualvalue)){
            System.out.println("Pass");
        }

    }

    public double convertToDecimal(String val){
        val = val.replace("₹","").replace(",","").replace("%","");
        return Double.parseDouble(val);
    }
}


