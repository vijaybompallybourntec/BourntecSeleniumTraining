package collections;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HashMapDemo2 {

    @Test
    public void hashMapDemo() {
        String environment = "Test" ;

        HashMap<String, String> map = new HashMap<>();

        if(environment.equalsIgnoreCase("stage")) {
            map.put("URL", "www.Stageurl.com");
        } else
        if(environment.equalsIgnoreCase("test")) {
            map.put("URL", "www.Testurl.com");
        } else
        if(environment.equalsIgnoreCase("prod")) {
            map.put("URL", "www.Produrl.com");
        }

        System.out.println(map.get("URL"));

    }
}
