package stringFunctions;

import org.junit.jupiter.api.Test;

public class SplitDemo {
    @Test
    public void splitMethodDemo()
    {
        String str ="The amount of the product is rs10000";
        String arr[]= str.split("rs",0);//It will split the string based on any value.
        System.out.println(arr.length);
        System.out.println(arr[0]);
        System.out.println(arr[1]);

        String name = "My name is Pooja Solanki";
       String splitString[]= name.split("\\s");//It will split the string based on the spaces by using "\\s".
       System.out.println(splitString.length);
        System.out.println(splitString[0]);
        System.out.println(splitString[1]);
        System.out.println(splitString[2]);
        System.out.println(splitString[3]);
        System.out.println(splitString[4]);


    }
}
