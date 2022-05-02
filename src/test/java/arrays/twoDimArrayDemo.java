package arrays;

import org.junit.jupiter.api.Test;

public class twoDimArrayDemo {

    @Test
    public void arrayDemo() {

        String tabData[][] = new String[2][3];

        tabData[0][0] = "S. No";
        tabData[0][1] = "Name";
        tabData[0][2] = "Location";

        tabData[1][0] = "1";
        tabData[1][1] = "Selenium";
        tabData[1][2] = "Hyd";

        System.out.println(tabData.length);

        for (int i = 0; i < tabData.length; i++) {
            System.out.println("Browsers listed: " + tabData[i][0]);
            System.out.println("Browsers listed: " + tabData[i][1]);
            System.out.println("Browsers listed: " + tabData[i][2]);

//        System.out.println("Browsers listed: "+tabData[1][0]);
//        System.out.println("Browsers listed: "+tabData[1][1]);
//        System.out.println("Browsers listed: "+tabData[1][2]);

        }
    }
}
