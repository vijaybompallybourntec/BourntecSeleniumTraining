package stringFunctions;

import org.junit.jupiter.api.Test;

public class StringToIntegerDemo {
    @Test
    public void stringToInt()
    {
        String s= "200,00";
        s= s.replace(",","");
        System.out.println(s);
        int i = Integer.parseInt(s);
        System.out.println(i);

        String prodmrp = "₹19,990.00";
        String disc = "17%";
        String actprice = "₹16,650.00 ";
        int Price;
        int disprice;
        prodmrp = prodmrp.replace("₹","").replace(",","");
        System.out.println(prodmrp);
        int mrp = Integer.parseInt(prodmrp);
        System.out.println(mrp);


    }
}
