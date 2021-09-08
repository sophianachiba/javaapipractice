package src.api.tests;

import src.api.util.TestAPIUtil;

public class StringAPITest {
    
    static public void main(String[] arg){

        // print the 3rd character in "mytest"
        String yours = "";
        String expected ="t";

        TestAPIUtil.assertValue(yours, expected);      
        
        // print the first word in lexicographically order  "doc" "api" "test";
        yours = "";
        expected = "api";

        TestAPIUtil.assertValue(yours, expected);   

        // find the start position of "api" in "myapitesta+"
        yours ="";
        expected = "2";

        TestAPIUtil.assertValue(yours, expected); 

        // how many character in "mytest"
        yours = "";
        expected = "6";

        TestAPIUtil.assertValue(yours, expected);

        // how many words in "I always test my code"?
        yours ="";
        expected = "5";

        TestAPIUtil.assertValue(yours, expected);

         // what's the 3rd word?
         yours ="";
         expected = "test";

         TestAPIUtil.assertValue(yours, expected);

         // display the last 3 letters of the word "codingallday"
         yours = "";
         expected = "day";

         TestAPIUtil.assertValue(yours, expected);

        // display "ALMOST DONE" in lower cases
        yours = "";
        expected = "almost done";

        TestAPIUtil.assertValue(yours, expected);
    }
}
