package Variables;

import org.junit.jupiter.api.Test;

public class OperatorsAndOr {

    @Test
    public void operators() {

        int age = 20;
        String browser = "ie";

        if ((age > 0) && (age < 21)) {
            System.out.println("Minor");
        }

        if ((browser.equalsIgnoreCase("chrome")) || (browser.equalsIgnoreCase("firefox"))) {
            System.out.println("valid browser");
        } else {
            System.out.println("Invalid browser");
        }
    }
}
