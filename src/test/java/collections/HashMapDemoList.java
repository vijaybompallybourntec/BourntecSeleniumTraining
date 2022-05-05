package collections;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HashMapDemoList {

    @Test
    public void hashMapDemo() {

        HashMap<String, List<String>> map = new HashMap<>();

        List<String> browsers = new ArrayList();
        List<String> envir = new ArrayList();

        browsers.add("Chrome");
        browsers.add("Chrome");
        browsers.add("Firefox");

        envir.add("Test");
        envir.add("Stage");
        envir.add("Prod");

        map.put("BROWSERS", browsers);
        map.put("ENV",envir );

        System.out.println("Browsers "+map.get("BROWSERS"));
        System.out.println("Environment values "+map.get("ENV"));
    }
}
