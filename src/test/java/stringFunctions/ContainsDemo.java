package stringFunctions;

import org.junit.jupiter.api.Test;

import java.util.Locale;

public class ContainsDemo {
    @Test
    public void contains(){
        String actualResult = "Record no: '1245' updated successfully";
        String expResult ="updated successfully";
// contains() method will check the value which we given is present or not. It checks as it is which we give.
  //      It is case-sensitive.

        if (actualResult.contains(expResult))
        {
            System.out.println("Test Pass");
        }
        else{
            System.out.println("Test Fail");
        }

    }

    @Test
    public void containsToLowerCase(){
        String actualResult = "Record no: '1245' updated successfully";
        String expResult ="Updated Successfully";
// toLowerCase() method converts String or value which we give in lowercase.

        if (actualResult.toLowerCase().contains(expResult.toLowerCase()))
        {
            System.out.println("Test Pass");
        }
        else{
            System.out.println("Test Fail");
        }

    }

    @Test
    public void containsToUpperCase(){
        String actualResult = "Record no: '1245' updated successfully";
        String expResult ="updated successfully";
   //     toUpperCase() method converts String or value in uppercase.

        if (actualResult.toUpperCase().contains(expResult.toUpperCase()))
        {
            System.out.println("Test Pass");
        }
        else{
            System.out.println("Test Fail");
        }

    }
}

