package src.api.solutions;

import java.util.*;

import src.api.util.TestAPIUtil;

public class LinkedListAPITest {
    
    //CORE API
    // Add, AddFirst, DescendingIterator, getFirst, getLast, remove, removelast
    // size

    static public void main(String[] arg){

        // create a linked list of integer with : 1, 2, 3
        // print the head
        String yours = "";
        String expected ="1";

        LinkedList<Integer> list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);

        yours += list.getFirst();
        TestAPIUtil.assertValue(yours, expected);

        // print the tail
        yours = "";
        expected ="3";

        yours += list.getLast();
        TestAPIUtil.assertValue(yours, expected);

        // print list from head to tail
        yours = "";
        expected ="1 2 3 ";

        Iterator it = list.iterator();

        while(it.hasNext()){
            yours += it.next()+" ";
        }

        TestAPIUtil.assertValue(yours, expected);

        // print list from tail to head
        yours = "";
        expected ="3 2 1 ";

        it = list.descendingIterator();
        while(it.hasNext()){
            yours += it.next() + " ";
        }

        TestAPIUtil.assertValue(yours, expected);

        // delete head and print the new head
        yours = "";
        expected = "2";
        
        list.remove();
        yours += list.getFirst();

        TestAPIUtil.assertValue(yours, expected);

        // delete head and print the new tail
        yours = "";
        expected = "2";

        list.removeLast();
        yours += list.getLast();

        TestAPIUtil.assertValue(yours, expected);

        // add 1 back as the head of the list and print the list.
        yours = "";
        expected = "1 2 ";
        
        list.addFirst(1);

        it = list.iterator();
        while(it.hasNext()){
            yours += it.next() + " ";
        }

        TestAPIUtil.assertValue(yours, expected);

    }
}
