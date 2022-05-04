package stringFunctions;

import org.junit.jupiter.api.Test;

public class StringConversion {
    @Test
    public void stringToDouble(){
        String prodmrp = "₹57,990.00";
        String disc ="41%";
        String Disprice ="₹23,990.00 ";
        double expDisPrice;

        prodmrp= (prodmrp.replace("₹","").replace(",",""));
        disc = disc.replace("%","");
        Disprice = Disprice.replace("₹","").replace(",","");

        //convert String value into Decimal value.

        double mrp =Double.parseDouble(prodmrp);
        double discount = Double.parseDouble(disc);
        double actDiscount = Double.parseDouble(Disprice);

        //calculate the discountPrice after getting discount
          expDisPrice = mrp*discount/100;
         System.out.println("Expected Discount price" +expDisPrice);

         if(actDiscount==expDisPrice){
             System.out.println(actDiscount+","+expDisPrice +","+"No calculation mistake");
         }
         else{
             System.out.println("Actual Discount"+" " +actDiscount+"," +"Expected Discount"+" "+expDisPrice);
             System.out.println("Actual discount and expected discount price not matched Calculation Mistake");
         }
    }
}
