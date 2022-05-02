package stringFunctions;

import org.junit.jupiter.api.Test;

public class StringComparison {

    @Test
    public void testStringComp() {
        String actualValue = "Created Sucessfully";
        String expValue = "Created sucessfully";

        if (actualValue.equalsIgnoreCase(expValue)) {
            System.out.println("Both are equal");
        } else {
            System.out.println("Actual value is not equal to expected");
        }

        if (actualValue.equals(expValue)) {
            System.out.println("Both are equal");
        } else {
            System.out.println("Actual value is not equal to expected");
        }

        int expInteger = 10;
        int actInteger = 20;

        if (expInteger == actInteger) {
            System.out.println("Both are equal");
        }

        String actualCharValue = "Australia";
        String expCharValue = "India";

        if (actualCharValue.compareTo(expCharValue) == 0) {
            System.out.println("Actual value equals expected value");
        } else if (actualCharValue.compareTo(expCharValue) < 0) {
            System.out.println("Actual value greater than expected value");
        } else if (actualCharValue.compareTo(expCharValue) > 0) {
            {
                System.out.println("Actual value less than expected value");
            }

        }
    }
}


