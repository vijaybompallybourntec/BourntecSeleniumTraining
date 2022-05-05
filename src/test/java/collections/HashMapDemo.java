package collections;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HashMapDemo {

    @Test
    public void hashMapDemo() {

        List<String> browsers = new ArrayList();
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Chrome");
        map.put(1, "ie");
        map.put(2, "Firefox");

        System.out.println(map.get(1));
        System.out.println(map.get(2));

    }
}
