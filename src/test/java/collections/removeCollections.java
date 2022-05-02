package collections;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class removeCollections {

    @Test
    public void arrayListDemo() {

        List<String> browsers = new ArrayList();

        browsers.add("firefox");
        browsers.add("chrome");
        browsers.add("Edge");

        List<String> browsers2 = new ArrayList();

        browsers2.add("ie");
        browsers2.add("safari");
        browsers2.add("Edge");

        System.out.println(browsers);

        browsers.removeAll(browsers2);

        System.out.println(browsers);

    }
}
