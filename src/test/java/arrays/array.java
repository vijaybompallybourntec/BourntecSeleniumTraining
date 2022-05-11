package arrays;

import org.junit.jupiter.api.Test;

public class array {

    @Test
    public void testArrays() {

        String browsers[] = {"chrome", "firefox", "safari"};

        System.out.println(browsers[1]);
        System.out.println("total no of browsers: "+ browsers.length);

        for (int i=0;i<browsers.length;i++){
            System.out.println("browsers listed: " + browsers[i]);
        }
    }
}
