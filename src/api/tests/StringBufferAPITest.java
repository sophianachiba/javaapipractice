package src.api.solutions;

import java.util.stream.IntStream;

import src.api.util.TestAPIUtil;

public class StringBufferAPITest {
    

    // Core API 
    // new StringBuffer() , append , charAt , delete , reverse, substring,
    static public void main(String[] arg){
    
        // create a strinbuffer add the following: 
        //5 
        //" tests a days" 
        String yours = "";
        String expected ="5 tests a days";

        TestAPIUtil.assertValue(yours, expected);

        // print the 3rd character
        yours = "";
        expected ="t";

        TestAPIUtil.assertValue(yours, expected);

        // correct the typo at the end by removing the "s"
        yours = "";
        expected ="5 tests a day";

        TestAPIUtil.assertValue(yours, expected);

        // add 0 to 4 and print it in reverse
        yours = "";
        expected = " 4 3 2 1 0";

        TestAPIUtil.assertValue(yours, expected);

        // create a stringbuffer "I can code"
        // print the last 4 letter "code"
        yours = "";
        expected ="code";

        TestAPIUtil.assertValue(yours, expected);
    }
}
