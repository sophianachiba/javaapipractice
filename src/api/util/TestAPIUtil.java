package src.api.util;

public class TestAPIUtil {
    
    static public void assertValue(String yours, String expected){
        System.out.println(expected.equals(yours)? "Correct" : "*** WRONG ***");
        System.out.println("   Yours: " + yours);
        System.out.println("Expected: " + expected);
    }
}
