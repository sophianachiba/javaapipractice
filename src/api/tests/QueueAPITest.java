package src.api.tests;
import src.api.util.*;
import java.util.*;

public class QueueAPITest {
    
    public static void main(String[] args){

        String yours = "";
        String expected = "";
        // create a Queue
        
        // add the following : 1,2

        // print head of queue but dont take out it
        yours="";
        expected = "1";

        TestAPIUtil.assertValue(yours, expected);

        // take all elements out of the queue

        // print head
        yours="";
        expected = "null";

        TestAPIUtil.assertValue(yours, expected);
    }
}
