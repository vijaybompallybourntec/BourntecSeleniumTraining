package collections;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SortArrayListDemo {

    @Test
    public void arrayListDemo() {

        List<String> browsers = new ArrayList();

        browsers.add("firefox");
        browsers.add("chrome");
        browsers.add("safari");


        System.out.println("Before sort "+browsers);

        Collections.sort(browsers);  //sorting array list values

        System.out.println("After Sort " +browsers);


    }
}
