package stringFunctions;

import org.junit.jupiter.api.Test;

public class ReplaceDemo {
    @Test
    public void replace(){
        String prodmrp = "₹57,990.00";
        String disc ="41%";
        String actprice ="₹34,000.00";

       prodmrp= prodmrp.replace("₹","");
        System.out.println(prodmrp);
      prodmrp= prodmrp.replace(",","");
        System.out.println(prodmrp);
        prodmrp=prodmrp.replace("990","123");
        System.out.println(prodmrp);
    }
}
