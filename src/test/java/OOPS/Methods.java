package OOPS;

import org.junit.jupiter.api.Test;

public class Methods {

    @Test
    public void testingMethods(){
        openChromeBrowser();
        openChromeBrowser();
        openChromeBrowser();
        openChromeBrowser();
        openChromeBrowser();
        System.out.println(checkIfChromeBrowserIsOpened());
    }


    public void openChromeBrowser(){
        System.out.println("Opening chrome browser");
    }

    public boolean checkIfChromeBrowserIsOpened(){
        return true;
    }

    public void  openEdgeBrowser(){

    }


}
