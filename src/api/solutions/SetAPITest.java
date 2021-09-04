package src.api.solutions;

import java.util.*;

import src.api.util.TestAPIUtil;

public class SetAPITest {
    public static void main(String[] args){
    
        // Core Methods:
        // add, contains, iterator, remove, size
        String yours = "";
        String expected = "";

        // create a set and add 1,2,3
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);

        // print out all element in the set
        yours = "";
        expected = "1 2 3 ";
        Iterator<Integer> it = set.iterator();
        while(it.hasNext()){
            yours += it.next() + " ";
        }
        TestAPIUtil.assertValue(yours, expected);
        // look for 3 and then 4
        yours = "";
        expected ="true false";
        yours += set.contains(3) + " ";
        yours += set.contains(4);
        TestAPIUtil.assertValue(yours, expected);

        // delete 1 and 2 and print the new size
        yours = "";
        expected ="1";
        set.remove(1);
        set.remove(2);
        yours += set.size();
        TestAPIUtil.assertValue(yours, expected);
    }
}
