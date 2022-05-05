package collections;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

    @Test
    public void arrayListDemo(){

        List<String> browsers = new ArrayList();

        browsers.add("firefox");
        browsers.add("chrome");
        browsers.add("safari");

        System.out.println("Browsers size: "+browsers.size());
        System.out.println(browsers);

//        iterator

        Iterator itr = browsers.iterator();
        while(itr.hasNext()){
            System.out.println("Browsers using Iterator: "+itr.next());
        }

        for(int i=0;i<browsers.size();i++){
            System.out.println("Browsers using for loop: "+browsers.get(i));
        }

    }
}
