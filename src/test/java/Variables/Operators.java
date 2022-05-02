package Variables;

import org.junit.jupiter.api.Test;

public class Operators {

    @Test
    public void operators(){

        int age = 21;

        if(age == 20){
            System.out.println("Age is 20");
        } else
        if(age >= 21){
            System.out.println("Age is greater than or equal to 21");
        } else
        if(age < 20){
            System.out.println("Age is less than 20");
        }

    }
}
