package OopsConcepts;

import org.junit.jupiter.api.Test;

public class methods {

    @Test
    public void testingMethod(){
        openChromeBrowser();
        System.out.println(checkIfchromeBrowserisOpen());
    }

    public void openChromeBrowser(){
        System.out.println("open chrome browser");
    }

    public String checkIfchromeBrowserisOpen(){
        return "yes";
    }

    public void OpenChromeBrowser(){

    }


}
