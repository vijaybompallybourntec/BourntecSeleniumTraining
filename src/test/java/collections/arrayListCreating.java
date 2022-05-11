package collections;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class arrayListCreating {

    @Test
    public void arrayListAssignment() {

        //creating an array lists and adding the countries values to the both the lists

        ArrayList<String> browser = new ArrayList<String>();

        browser.add("London");
        browser.add("Paris");
        browser.add("ukraine");
        System.out.println("browser size" + browser.size());
        System.out.println(browser);

        Iterator itr = browser.iterator();
        while(itr.hasNext()){
            System.out.println("browser using iterator: " + itr.next());
        }

        for(int i=0;i<browser.size();i++){
            System.out.println("browser using for loop" +browser);
        }
    }
}
