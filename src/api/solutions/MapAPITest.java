package src.api.solutions;

import java.util.*;

import src.api.util.TestAPIUtil;

public class MapAPITest {

    
    public static void main(String[] args){

        // CORE METHODS
        // containsKey, get, getorDefault, keySet, put, remove, size, values

        String yours = "";
        String expected = "";
        // create a Map and add the following
        // a:1 , b:2, c:3
        // print the list of keys
        yours = "";
        expected = "a b c ";
        
        Map<Character, Integer> m = new HashMap();
        m.put('a', 1);
        m.put('b', 2);
        m.put('c', 3);

        for(char c : m.keySet()){
            yours += c + " ";
        }

        TestAPIUtil.assertValue(yours, expected);

        // for the given kyes print their values or -1
        // a, z, c
        yours = "";
        expected = "1 -1 3";

        yours += m.getOrDefault('a', -1) + " ";
        yours += m.getOrDefault('z', -1) + " ";
        yours += m.getOrDefault('c', -1);

        TestAPIUtil.assertValue(yours, expected);
        // do they keys c and d exist?
        yours = "";
        expected = "true false";

        yours += m.containsKey('c') + " " + m.containsKey('d');
        TestAPIUtil.assertValue(yours, expected);

        //print all values (values only)
        yours = "";
        expected = "1 2 3 ";
        for(int i : m.values()){
            yours += i +" ";
        }
        TestAPIUtil.assertValue(yours, expected);

    }
}
