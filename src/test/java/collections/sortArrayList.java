package collections;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class sortArrayList {

    @Test
    public void arrayListAssignment() {

        ArrayList<String> browser = new ArrayList<String>();

        browser.add("ukraine");
        browser.add("London");
        browser.add("paris");
        System.out.println("before sorting:"+ browser);

        Collections.sort(browser);
        System.out.println("after sorting:" + browser);

    }
}
