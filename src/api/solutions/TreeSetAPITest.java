package src.api.solutions;

import java.util.*;

import src.api.util.TestAPIUtil;

public class TreeSetAPITest {

    
    // CORE APIs
    // crud: add , addall , pollfirst , polllast , remove , 
    // search: ceiling , floor , higher , lower , comparator , contains
    // browsing: first , last , iterator , descendingIterator , size
    public static void main(String[] args) {
        // create a treeset of integer with : 3, 4, 6, 1, 2
        // print the first element
        String yours = "";
        String expected ="1";

        TreeSet<Integer> ts = new TreeSet<Integer>();

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

        // how large is the list?
        yours = "";
        expected = "5";

        yours += ts.size();
        TestAPIUtil.assertValue(yours, expected);

        // print the whole list
        yours = "";
        expected ="1 2 3 4 6 ";
        
        Iterator<Integer> it = ts.iterator();

        while(it.hasNext()){
            yours += it.next() + " ";
        }
        TestAPIUtil.assertValue(yours, expected);

        // print the whole list in reverse order
        yours = "";
        expected ="6 4 3 2 1 ";
        
        it = ts.descendingIterator();

        while(it.hasNext()){
            yours += it.next() + " ";
        }
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

        // delete the element 4 print the value below 5
        yours = "";
        expected = "3";

        ts.remove(4);
        yours += ts.floor(5);
        TestAPIUtil.assertValue(yours, expected);

        // given the collection below
        // add items in inverted order and print the result;
        Collection<Integer> l = Arrays.asList(1,2,3,3);
        yours = "";
        expected ="3 2 1 ";        
        
        ts = new TreeSet<Integer>(Collections.reverseOrder());
        ts.addAll(l);

        it = ts.iterator();

        while(it.hasNext()){
            yours += it.next() + " ";
        }
        TestAPIUtil.assertValue(yours, expected);

    }
}
