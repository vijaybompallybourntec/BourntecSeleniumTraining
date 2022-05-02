package collections;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class AddCollections {

    @Test
    public void arrayListDemo() {

        List<String> browsers = new ArrayList();

        browsers.add("firefox");
        browsers.add("chrome");

        List<String> browsers2 = new ArrayList();

        browsers2.add("ie");
        browsers2.add("safari");


        System.out.println(browsers);

        browsers.addAll(browsers2);

        System.out.println(browsers);

    }
}
