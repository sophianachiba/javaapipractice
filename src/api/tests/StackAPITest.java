package src.api.tests;

import src.api.util.TestAPIUtil;

public class StackAPITest {
    

    public static void main(String[] args){
        
        String yours = "";
        String expected = "";
        // create a Stack

        // add 1,2,3
        // print top of the stack
        yours = "";
        expected = "3";

        TestAPIUtil.assertValue(yours, expected);
        // add up all element in the stack together
        yours = "";
        expected = "6";
 
        TestAPIUtil.assertValue(yours, expected);
    }

}
