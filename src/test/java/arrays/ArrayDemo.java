package arrays;

import org.junit.jupiter.api.Test;

public class ArrayDemo {

    @Test
    public void arrayDemo(){
        String browsers[] = {"Chrome","Firefox","safari"};

        System.out.println(browsers[1]);
        System.out.println("Tot Num of browsers: "+browsers.length);

        for(int i=0;i<browsers.length;i++){
            System.out.println("Browsers listed: "+browsers[i]);
        }


    }


}
