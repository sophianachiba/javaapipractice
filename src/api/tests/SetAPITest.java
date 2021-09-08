package src.api.tests;

import java.util.*;

import src.api.util.TestAPIUtil;

public class SetAPITest {
    public static void main(String[] args){
    
        String yours = "";
        String expected = "";

        // create a set and add 1,2,3

        // print out all element in the set
        yours = "";
        expected = "1 2 3 ";

        TestAPIUtil.assertValue(yours, expected);
        // look for 3 and then 4
        yours = "";
        expected ="true false";

        // delete 1 and 2 and print the new size
        yours = "";
        expected ="1";

        TestAPIUtil.assertValue(yours, expected);
    }
}
