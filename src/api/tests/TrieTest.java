package src.api.tests;

import src.api.util.TestAPIUtil;

public class TrieTest {
    
    public static void main(String[] args) {
        
        // created a trie (implement the trie interface in solution package) and addd the following words:
        // house, car, backyard, kitchen, bathroom

        // look up house
        String yours = "";
        String expected = "true";

        TestAPIUtil.assertValue(yours, expected);


        // look up closet
        yours = "";
        expected = "false";
        
        TestAPIUtil.assertValue(yours, expected);

        // delete backyard

        // look up backyard
        yours = "";
        expected = "false";
        
        TestAPIUtil.assertValue(yours, expected);
    }
}
