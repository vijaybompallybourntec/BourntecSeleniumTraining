package exceptions;

import org.junit.jupiter.api.Test;

public class ExceptionHandling {

    @Test
    public void exceptionHandling(){

        try {
            double amt = 100 / 0;

            System.out.println(amt);
        }
        catch(Exception e) {
            System.out.println(e);
        }

        finally {  //always get executed irrespectiv eof pass or fail condition
            System.out.println("Continue");
        }

        System.out.println("Continue");

    }

}
