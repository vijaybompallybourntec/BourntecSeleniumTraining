package controlStatements;

import org.junit.jupiter.api.Test;

public class SwitchStatements {
    String browser = "Firefox";

    @Test
    public void switchDemo() {

        switch (browser) {
            case "chrome":
                System.out.println("This is chome browser");
                break;
            case "firefox":
                System.out.println("This is firefox browser");
                break;
            case "edge":
                System.out.println("This is edge browser");
                break;
            default:
                System.out.println("Not a valid browser");
        }

    }
}