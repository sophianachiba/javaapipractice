package src.api.tests;

import java.util.*;

import src.api.util.TestAPIUtil;

public class MapAPITest {

    
    public static void main(String[] args){

        String yours = "";
        String expected = "";
        // create a Map and add the following
        // a:1 , b:2, c:3
        // print the list of keys
        yours = "";
        expected = "a b c ";
        
        TestAPIUtil.assertValue(yours, expected);

        // for the given kyes print their values or -1
        // a, z, c
        yours = "";
        expected = "1 -1 3";

        TestAPIUtil.assertValue(yours, expected);
        // do they keys c and d exist?
        yours = "";
        expected = "true false";

        TestAPIUtil.assertValue(yours, expected);

        //print all values (values only)
        yours = "";
        expected = "1 2 3 ";

        TestAPIUtil.assertValue(yours, expected);

    }
}
