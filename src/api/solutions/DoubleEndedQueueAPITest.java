package src.api.solutions;
import java.util.Deque;
import java.util.LinkedList;

import src.api.util.*;

public class DoubleEndedQueueAPITest {
    
    public static void main(String[] args){

        // CORE METHODS
        // add(), poll(), peek() : add to Q, poll the first Q, peek the first in Q
        // addFirst(), pollLast(), peekLast(): add the start of the Q, poll item at the end of the Q, peek item at the end
        
        String yours = "";
        String expected = "";
        // create a Qeueu

        Deque<Integer> q = new LinkedList<Integer>();
        // add the following at the end of the queue: 1, 2
        // print the queue from the front
        yours="";
        expected = "1 2 ";
        q.add(1); // Q = 1
        q.add(2); // Q = 2 -> 1
        // q= 1 -> 2
        while(!q.isEmpty()){
            yours += q.poll() +" ";
        }

        TestAPIUtil.assertValue(yours, expected);
        // add the following at the end of the qeueue: 1, 2
        // print the queue from the back
        yours="";
        expected = "2 1 ";
        q.add(1); // Q = 1
        q.add(2); // Q = 2 -> 1

        while(!q.isEmpty()){
            yours += q.pollLast() +" ";
        }
        TestAPIUtil.assertValue(yours, expected);


        // add the following at the front of the queue: 1, 2
        // print the queue from the back
        yours="";
        expected = "1 2 ";
        q.addFirst(1); // Q = 1
        q.addFirst(2); // Q = 1 -> 2
        // q= 1 -> 2
        while(!q.isEmpty()){
            yours += q.pollLast() +" ";
        }
        TestAPIUtil.assertValue(yours, expected);

        // add the following in the queue: 1, 2, 3
        // print the first and last element without removing them.
        yours="";
        expected = "1 3";
        q.add(1); //q: 1
        q.add(2); //q: 2 -> 1
        q.add(3); //q: 3 -> 2 -> 1

        yours += q.peek() + " ";
        yours += q.peekLast();
        TestAPIUtil.assertValue(yours, expected);

    }
}
