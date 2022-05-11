package collections;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapAss2 {

    @Test
    public void hashMapAss(){
        String environment = "prod";

        HashMap<String,String> map = new HashMap<>();

        if(environment.equalsIgnoreCase("stage")){
            map.put("url","www.stageurl.com");
        } else if(environment.equalsIgnoreCase("test")){
            map.put("url","www.testurl.com");
        }else if(environment.equalsIgnoreCase("prod")) {
            map.put("url", "www.produrl.com");
        }

        System.out.println(map.get("url"));

    }
}
