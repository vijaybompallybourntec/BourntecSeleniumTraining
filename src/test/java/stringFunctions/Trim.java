package stringFunctions;

import org.junit.jupiter.api.Test;

public class Trim {

    @Test
    public void trim() {
        String actValue = " Total amount is ₹10,400.00 ";

        System.out.println(actValue);
        System.out.println(actValue.trim());
    }
}


