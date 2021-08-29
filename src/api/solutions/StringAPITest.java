package src.api.solutions;

import src.api.util.TestAPIUtil;

public class StringAPITest {
    
    //CORE API
    // charAt, compareTo, indexof(string), length, split, subString(start, end), toLowercase
    static public void main(String[] arg){

        // print the 3rd character in "mytest"
        String yours = "";
        String expected ="t";

        String test = "mytest";
        yours += test.charAt(2);
        TestAPIUtil.assertValue(yours, expected);      
        
        // print the first word in lexicographically order  "doc" "api" "test";
        yours = "";
        expected = "api";

        yours = "doc".compareTo("api") < 0? "doc" : "api";
        yours = yours.compareTo("test") < 0? yours : "test";
        TestAPIUtil.assertValue(yours, expected);   

        // find the start position of "api" in "myapitesta+"
        yours ="";
        expected = "2";

        yours += "myapitesta+".indexOf("api");
        TestAPIUtil.assertValue(yours, expected); 

        // how many character in "mytest"
        yours = "";
        expected = "6";

        yours += "mytest".length();
        TestAPIUtil.assertValue(yours, expected);

        // how many words in "I always test my code"?
        yours ="";
        expected = "5";
        String[] split = "I always test my code".split(" ");
        yours += split.length;
        TestAPIUtil.assertValue(yours, expected);

         // what's the 3rd word?
         yours ="";
         expected = "test";
         yours += split[2];
         TestAPIUtil.assertValue(yours, expected);

         // display the last 3 letters of the word "codingallday"
         yours = "";
         expected = "day";
         String word = "codingallday";
         yours += "codingallday".substring(word.length() - 3, word.length());
         TestAPIUtil.assertValue(yours, expected);

        // display "ALMOST DONE" in lower cases
        yours = "";
        expected = "almost done";

        yours += "ALMOST DONE".toLowerCase();
        TestAPIUtil.assertValue(yours, expected);
    }
}
