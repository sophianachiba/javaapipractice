package src.api.solutions;

import java.util.TreeSet;

import src.api.util.TestAPIUtil;

public class TreeSetAPITest {

    
    // CORE APIs
    // crud: add, addall, pollfirst, polllast, remove, 
    // search: ceiling, floor, higher, lower, comparator, contains 
    // browsing: first, last, iterator, descendingIterator, size
    public static void main(String[] args) {
        // create a treeset of integer with : 3, 4, 6, 1, 2
        // print the head
        String yours = "";
        String expected ="1";

        TreeSet<Integer> ts = new TreeSet();

        ts.add(3);
        ts.add(4);
        ts.add(6);
        ts.add(1);
        ts.add(2);

        yours += ts.first();
        TestAPIUtil.assertValue(yours, expected);

        // print the last element
        yours = "";
        expected ="6";

        yours += ts.last();
        TestAPIUtil.assertValue(yours, expected);

        // does the list has an integer of value 5?
        yours = "";
        expected = "false";

        yours += ts.contains(5);
        TestAPIUtil.assertValue(yours, expected);

        // what number comes before 6?
        yours = "";
        expected ="4";

        yours += ts.lower(6);
        TestAPIUtil.assertValue(yours, expected);   
        
        // what number comes after 3?
        yours = "";
        expected ="4";

        yours += ts.higher(3);
        TestAPIUtil.assertValue(yours, expected);        

        // provided the number 4 what interval does it fall in
        // inclusive at start/exclusive at end : 3 --> [3-4[
        yours = "";
        expected ="4 6";
        yours += ts.floor(4) + " " + ts.higher(4);
        TestAPIUtil.assertValue(yours, expected);        

        // provided the number 4 what interval does it fall in
        // exclusive at start/inclusive at end : 3 --> ]2-3]
        yours = "";
        expected ="3 4";
        yours += ts.lower(4) + " " + ts.ceiling(4);
        TestAPIUtil.assertValue(yours, expected);

    }
}
