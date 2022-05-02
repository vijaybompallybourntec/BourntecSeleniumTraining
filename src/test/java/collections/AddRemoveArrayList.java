package collections;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddRemoveArrayList {

    @Test
    public void arrayListDemo() {

        List<String> browsers = new ArrayList();

        browsers.add("firefox");
        browsers.add("chrome");
        browsers.add("safari");


        System.out.println(browsers);

        browsers.remove(0);
        System.out.println(browsers);

        browsers.remove("safari");
        System.out.println(browsers);
    }
}
