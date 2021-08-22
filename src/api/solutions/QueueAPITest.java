package src.api.solutions;

import java.util.*;
import src.api.util.*;

public class QueueAPITest {
    

    /*
     * Core Method: 
     *      Add
     *      peek
     *      poll: return null when empty
     * 
    */
    public static void main(String[] args){

        // CORE METHOD Test
        // add(), poll(), peek()

        String yours = "";
        String expected = "";
        // create a Queue
        Queue<Integer> q = new LinkedList<Integer>();
        // add the following : 1,2 using 2 differen way
        q.add(1);
        q.add(2);
        // print head of queue but dont take out it
        yours="";
        expected = "1";
        yours += q.peek();
        TestAPIUtil.assertValue(yours, expected);
        // take all elements out of the queue
        q.poll();
        q.poll();
        // print head
        yours="";
        expected = "null";
        yours += q.peek() == null? "null":"error";
        TestAPIUtil.assertValue(yours, expected);

    }
}
