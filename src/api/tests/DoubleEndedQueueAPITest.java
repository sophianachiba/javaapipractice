package src.api.tests;
import java.util.Deque;
import java.util.LinkedList;

import src.api.util.*;

public class DoubleEndedQueueAPITest {
    
    public static void main(String[] args){

        String yours = "";
        String expected = "";
        // create a Qeueu

        Deque<Integer> q = new LinkedList<Integer>();
        // add the following at the end of the queue: 1, 2
        // print the queue from the front
        yours="";
        expected = "1 2 ";

        TestAPIUtil.assertValue(yours, expected);
        // add the following at the end of the qeueue: 1, 2
        // print the queue from the back
        // q= 3->4
        yours="";
        expected = "2 1 ";

        TestAPIUtil.assertValue(yours, expected);

        // add the following at the front of the queue: 1, 2
        // print the queue from the front
        yours="";
        expected = "2 1 ";

        TestAPIUtil.assertValue(yours, expected);

        // add the following at the front of the queue: 1, 2
        // print the queue from the back
        yours="";
        expected = "1 2 ";

        TestAPIUtil.assertValue(yours, expected);

        // add the following in the queue: 1, 2, 3
        // print the first and last element without removing them.
        yours="";
        expected = "1 3";

        TestAPIUtil.assertValue(yours, expected);

    }
}
