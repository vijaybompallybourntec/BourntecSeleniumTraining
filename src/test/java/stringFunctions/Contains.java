package stringFunctions;

import org.junit.jupiter.api.Test;

import java.util.Locale;

public class Contains {

    @Test
    public void contains() {
        String actualValue = "Record Number: '12346' Created Sucessfully";
        String expValue = "Created sucessfully";

        if(actualValue.toLowerCase().contains(expValue.toLowerCase())){
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        if(actualValue.toLowerCase().endsWith(expValue.toLowerCase())){
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        if(actualValue.toLowerCase().startsWith(expValue.toLowerCase())){
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
}


