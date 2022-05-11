package collections;

import org.junit.jupiter.api.Test;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class arrayListAssignment {

    @Test
    public void arrayListAssignment() {

        //creating an array lists and adding the countries values to the both the lists

        ArrayList<String> List1 = new ArrayList<String>();

        List1.add("London");
        List1.add("Paris");
        List1.add("ukraine");
        System.out.println("list before sorting an array list1" + List1);

        ArrayList<String> List2 = new ArrayList<String>();

        List2.add("India");
        List2.add("USA");
        List2.add("Pakistan");
        System.out.println("List before sorting an array list2" + List2);

        //comparing the both lists

        System.out.print("compared data"+ List1.equals(List2));

        //sorting both the lists

        Collections.sort(List1);
        Collections.sort(List2);

        System.out.println("after sorting List1" + List1);
        System.out.println("after sorting List2" + List2);
        System.out.println("compared data after sorting"+List1.equals(List2));


    }
}
