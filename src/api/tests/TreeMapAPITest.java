package src.api.tests;

import java.util.*;

import src.api.util.TestAPIUtil;

public class TreeMapAPITest {
    
    public static void main(String[] args) {

    // given the following words and definition build a dcitionnary.
    // storage : "space or a place for storing"
    // car : "a vehicle moving on wheels"
    // foot : "an invertebrate organ of locomotion or attachment"
    // print the first and last word.

    String yours = "";
    String expected = "car storage";
    
    TestAPIUtil.assertValue(yours, expected);

    // print word before "mouse"
    yours = "";
    expected = "foot";

    TestAPIUtil.assertValue(yours, expected);

    // print the word after "rose"
    yours = "";
    expected = "storage";

    TestAPIUtil.assertValue(yours, expected);

    // return the following words if they exists or the one before if not
    // store
    // car
    yours = "";
    expected = "storage car";

    TestAPIUtil.assertValue(yours, expected);

    // return the following words if they exists or the one after if not
    // pudding
    // foot
    yours = "";
    expected = "storage foot";

    TestAPIUtil.assertValue(yours, expected);

    // does the dictionnary contains the word "fly"
    yours = "";
    expected = "false";

    TestAPIUtil.assertValue(yours, expected);

    // print the definiton of "car"
    yours = "";
    expected = "a vehicle moving on wheels";

    TestAPIUtil.assertValue(yours, expected);

    // remove the first element and print the new first
    yours = "";
    expected = "foot";

    TestAPIUtil.assertValue(yours, expected);

    // remove the last element and print the total count
    yours = "";
    expected = "1";

    TestAPIUtil.assertValue(yours, expected);

    // remove the key and print count
    yours = "";
    expected = "0";

    TestAPIUtil.assertValue(yours, expected);

    // given the list of order number and name
    // print the first order and its name
    Map<Integer, String> ordername = new Hashtable<>();
    ordername.put(345, "sam");
    ordername.put(231, "paul");
    ordername.put(573, "joe");

    yours = "";
    expected = "231 paul";

    TestAPIUtil.assertValue(yours, expected);
    

    }
}
