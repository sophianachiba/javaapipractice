package src.api.tests;

import java.util.*;

import src.api.util.TestAPIUtil;

public class LinkedListAPITest {
    

    static public void main(String[] arg){

        // create a linked list of integer with : 1, 2, 3
        // print the head
        String yours = "";
        String expected ="1";

        TestAPIUtil.assertValue(yours, expected);

        // print the tail
        yours = "";
        expected ="3";

        TestAPIUtil.assertValue(yours, expected);

        // print list from head to tail
        yours = "";
        expected ="1 2 3 ";

        TestAPIUtil.assertValue(yours, expected);

        // print list from tail to head
        yours = "";
        expected ="3 2 1 ";

        TestAPIUtil.assertValue(yours, expected);

        // delete head and print the new head
        yours = "";
        expected = "2";

        TestAPIUtil.assertValue(yours, expected);

        // delete head and print the new tail
        yours = "";
        expected = "2";

        TestAPIUtil.assertValue(yours, expected);

        // add 1 back as the head of the list and print the list.
        yours = "";
        expected = "1 2 ";

        TestAPIUtil.assertValue(yours, expected);

    }
}
