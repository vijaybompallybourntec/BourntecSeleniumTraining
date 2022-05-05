package controlStatements;

import org.junit.jupiter.api.Test;

public class WhileLoop {

    String browser = "Firefox";

    @Test
    public void switchDemo() {
        int maxLoops = 10;
        for(int i=0;i<maxLoops;i++){
            System.out.println(i);
        }

        int j=0;
        while(j<maxLoops){
            System.out.println(j);
            j++;
        }

    }
}
