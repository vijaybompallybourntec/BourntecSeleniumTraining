package arrays;

import org.junit.jupiter.api.Test;

public class twoDimensionalArray {

    @Test
    public void testArrays() {

        String tableData[][] = new String[2][3];

        tableData[0][0] = "s.no";
        tableData[0][1] = "name";
        tableData[0][2] = "location";

        tableData[1][0] = "1";
        tableData[1][1] = "selenium";
        tableData[1][2] = "hyd";

        System.out.println(tableData.length);

        for (int i = 0; i < tableData.length; i++) {

            System.out.println("browsers listed: " + tableData[i][0]);
            System.out.println("browsers listed: " + tableData[i][1]);
            System.out.println("browsers listed: " + tableData[i][2]);
          //  System.out.println("browsers listed: " + tableData[1][0]);
            //System.out.println("browsers listed: " + tableData[1][1]);
            //System.out.println("browsers listed: " + tableData[1][2]);
        }

    }
}
