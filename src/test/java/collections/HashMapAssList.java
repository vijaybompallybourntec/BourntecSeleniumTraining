package collections;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HashMapAssList {

    @Test
    public void hashMapAss(){

        HashMap<String, List<String>> map = new HashMap<>();
        List<String>browsers =new ArrayList<>();
        List<String>environment =new ArrayList<>();

        browsers.add("chrome");
        browsers.add("chrome");
        browsers.add("firefox");

        environment.add("Test");
        environment.add("stage");
        environment.add("prod");

        map.put("Browsers",browsers);
        map.put("Environment", environment);

        System.out.println("browsers"+map.get("Browsers"));
        System.out.println("Environment values"+map.get("Environment"));

    }
}
