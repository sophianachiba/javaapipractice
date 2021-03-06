package src.api.solutions;

import java.util.stream.IntStream;

import src.api.util.TestAPIUtil;

public class StringBufferAPITest {
    

    // Core API 
    // new StringBuffer() , append , charAt , delete , reverse, substring,
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

        // add 0 to 4 and print it in reverse
        yours = "";
        expected = " 4 3 2 1 0";
        buff.setLength(0);
        IntStream.range(0, 5).forEach(x -> buff.append(x + " "));
        yours += buff.reverse();
        TestAPIUtil.assertValue(yours, expected);

        // create a stringbuffer "I can code"
        // print the last 4 letter "code"
        yours = "";
        expected ="code";
        buff.setLength(0);
        buff.append("I can code");
        yours += buff.substring(buff.length()-4, buff.length());
        TestAPIUtil.assertValue(yours, expected);
    }
}
