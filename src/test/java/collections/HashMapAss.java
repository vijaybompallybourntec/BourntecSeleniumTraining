package collections;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapAss {

    @Test
    public void hashMapAss(){

        ArrayList<String> browser = new ArrayList<String>();
        HashMap<Integer,String> map = new HashMap<>();

        map.put(1,"chrome");
        map.put(2,"firefox");

        System.out.println(map.get(1));
        System.out.println(map.get(2));

    }
}
