package src.api.tests;
import src.api.util.*;

public class QueueAPITest {
    
    public static void main(String[] args){

        String yours = "";
        String expected = "";
        // create a Qeueu

        // add the following : 1,2 using 2 differen way

        // print head of queue using 2 different ways
        yours="";
        expected = "1 1";

        TestAPIUtil.assertValue(yours, expected);
        // remove both element using 2 different way;

        // print head 2 different ways
        yours="";
        expected = "null null";

        TestAPIUtil.assertValue(yours, expected);

        // CORE METHOD Test
        // created a linkedlist, add: 1,2, print head and remove head, print new head (not removed).
        yours = "";
        expected = "1 2";
        
        TestAPIUtil.assertValue(yours, expected);
    }
}
