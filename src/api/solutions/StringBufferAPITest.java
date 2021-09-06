package src.api.solutions;

import src.api.util.TestAPIUtil;

public class StringBufferAPITest {
    

    // Core API 
    // new StringBuffer(), append, charAt, delete, reverse, substring, to String
    static public void main(String[] arg){
    
        // create a strinbuffer, at the following: 5 " tests a days" 
        String yours = "";
        String expected ="5 tests a days";

        StringBuffer buff = new StringBuffer();
        buff.append(5);
        buff.append(" tests a days");
        yours = buff.toString();
        TestAPIUtil.assertValue(yours, expected);

        // print the 3rd character
        yours = "";
        expected ="t";

        yours += buff.charAt(2);
        TestAPIUtil.assertValue(yours, expected);

        // correct the typo at the end by removing the "s"
        yours = "";
        expected ="5 tests a day";

        buff.delete(buff.length()-1, buff.length());
        yours = buff.toString();
        TestAPIUtil.assertValue(yours, expected);

        // add int from 0 to 5 and print it in reverse order.
        
    }
}
