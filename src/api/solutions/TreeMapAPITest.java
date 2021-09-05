package src.api.solutions;

import java.util.*;

import src.api.util.TestAPIUtil;

public class TreeMapAPITest {
    
    //CORE APIs
    // crud: put c, putall , pollfirstentry c, polllastentry c, remove c
    // search: ceilingkey c, floorkey c, higherkey c, lowerkey c, comparator, containskey c
    // browsing: firstkey c, lastkey c, get c, size cc
    public static void main(String[] args) {

    // given the following words and definition build a dcitionnary.
    // storage : "space or a place for storing"
    // car : "a vehicle moving on wheels"
    // foot : "an invertebrate organ of locomotion or attachment"
    // print the first and last word.

    String yours = "";
    String expected = "car storage";
    
    TreeMap<String, String> tm = new TreeMap<String, String>();
    tm.put("storage", "space or a place for storing");
    tm.put("car", "a vehicle moving on wheels");
    tm.put("foot", "an invertebrate organ of locomotion or attachment");

    yours += tm.firstKey() + " " + tm.lastKey();
    TestAPIUtil.assertValue(yours, expected);

    // print word before "mouse"
    yours = "";
    expected = "foot";

    yours += tm.lowerKey("mouse");
    TestAPIUtil.assertValue(yours, expected);

    // print the word after "rose"
    yours = "";
    expected = "storage";

    yours += tm.higherKey("rose");
    TestAPIUtil.assertValue(yours, expected);

    // return the following words if they exists or the one before if not
    // store
    // car
    yours = "";
    expected = "storage car";

    yours = tm.floorKey("store") + " " + tm.floorKey("car");
    TestAPIUtil.assertValue(yours, expected);

    // return the following words if they exists or the one after if not
    // pudding
    // foot
    yours = "";
    expected = "storage foot";

    yours = tm.ceilingKey("pudding") + " " + tm.ceilingKey("foot");
    TestAPIUtil.assertValue(yours, expected);

    // does the dictionnary contains the word "fly"
    yours = "";
    expected = "false";

    yours += tm.containsKey("fly");
    TestAPIUtil.assertValue(yours, expected);

    // print the definiton of "car"
    yours = "";
    expected = "a vehicle moving on wheels";

    yours += tm.get("car");
    TestAPIUtil.assertValue(yours, expected);

    // remove the first element and print the new first
    yours = "";
    expected = "foot";

    tm.pollFirstEntry();
    yours = tm.firstKey();
    TestAPIUtil.assertValue(yours, expected);

    // remove the last element and print the total count
    yours = "";
    expected = "1";

    tm.pollLastEntry();
    yours += tm.size();
    TestAPIUtil.assertValue(yours, expected);

    // remove the key and print count
    yours = "";
    expected = "0";
    tm.remove("foot");
    yours += tm.size();
    TestAPIUtil.assertValue(yours, expected);

    // given the list of order number and name
    // print the first order and its name
    Map<Integer, String> ordername = new Hashtable<>();
    ordername.put(345, "sam");
    ordername.put(231, "paul");
    ordername.put(573, "joe");

    yours = "";
    expected = "231 paul";
    TreeMap<Integer, String> orders = new TreeMap<>();
    orders.putAll(ordername);

    yours = orders.firstEntry().getKey() + " " + orders.firstEntry().getValue();

    TestAPIUtil.assertValue(yours, expected);
    

    }
}
