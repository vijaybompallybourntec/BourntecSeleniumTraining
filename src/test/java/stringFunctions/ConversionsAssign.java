package StringFunctions;

import org.junit.jupiter.api.Test;

public class ConversionsAssign {

    // Conversion of String to Double by using parse method
    @Test
    public void conversions(){

        String ActualValue ="20,000";
        int expVal = 20000;    //we can get this value after conversion

        ActualValue = ActualValue.replace(",", "");//Replacing the value of String's special characters
        double Actual = Double.parseDouble(ActualValue);
        System.out.println(Actual);
    }

    //Conversion of String to Integer
    @Test
    public void stingConversions(){

        String actualValue ="98745";

        Integer actualVal = Integer.parseInt(actualValue);
        System.out.println(actualValue);
        }
    }

