package src.api.tests;

import java.util.*;

import src.api.util.TestAPIUtil;

public class TreeSetAPITest {

    public static void main(String[] args) {
        // create a treeset of integer with : 3, 4, 6, 1, 2
        // print the first element
        String yours = "";
        String expected ="1";

        TestAPIUtil.assertValue(yours, expected);

        // print the last element
        yours = "";
        expected ="6";

        TestAPIUtil.assertValue(yours, expected);

        // how large is the list?
        yours = "";
        expected = "5";

        TestAPIUtil.assertValue(yours, expected);

        // print the whole list
        yours = "";
        expected ="1 2 3 4 6 ";
        
        TestAPIUtil.assertValue(yours, expected);

        // print the whole list in reverse order
        yours = "";
        expected ="6 4 3 2 1 ";
        
        TestAPIUtil.assertValue(yours, expected);

        // does the list has an integer of value 5?
        yours = "";
        expected = "false";

        TestAPIUtil.assertValue(yours, expected);

        // what number comes before 6?
        yours = "";
        expected ="4";

        TestAPIUtil.assertValue(yours, expected);   
        
        // what number comes after 3?
        yours = "";
        expected ="4";

        TestAPIUtil.assertValue(yours, expected);        

        // provided the number 4 what interval does it fall in
        // inclusive at start/exclusive at end : 3 --> [3-4[
        yours = "";
        expected ="4 6";

        TestAPIUtil.assertValue(yours, expected);        

        // provided the number 4 what interval does it fall in
        // exclusive at start/inclusive at end : 3 --> ]2-3]
        yours = "";
        expected ="3 4";

        TestAPIUtil.assertValue(yours, expected);

        // delete the element 4 print the value below 5
        yours = "";
        expected = "3";

        TestAPIUtil.assertValue(yours, expected);

        // given the collection below
        // add items in inverted order and print the result;
        Collection<Integer> l = Arrays.asList(1,2,3,3);
        yours = "";
        expected ="3 2 1 ";        
        
        TestAPIUtil.assertValue(yours, expected);

    }
}
