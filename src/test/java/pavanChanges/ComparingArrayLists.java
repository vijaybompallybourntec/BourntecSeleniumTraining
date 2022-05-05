package pavanChanges;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;

 public class ComparingArrayLists {
    @Test
    public void arraylist() {

        ArrayList<String> list1 = new ArrayList<>();

        list1.add("Algeria");
        list1.add("Brazil");
        list1.add("Canada");
        list1.add("Denmark");
        list1.add("Europe");

        System.out.println(list1);

        ArrayList<String> list2 = new ArrayList<>();
        // list2.addAll(list1);
        list2.add("Europe");
        list2.add("Denmark");
        list2.add("Canada");
        list2.add("Brazil");
        list2.add("Algeria");
        System.out.println(list2.size());

        System.out.println(list1);
        Collections.sort(list2);

        System.out.println("comparing"+list1+"and"+list2+":"+list1.equals(list2));
//        System.out.println(list1.equals(list2));

    }
}
