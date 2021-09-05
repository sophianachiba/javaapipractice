package src.api.solutions;

import src.api.util.TestAPIUtil;

public class TrieTest {
    
    public static void main(String[] args) {
        
        // Creer a trie and addd the following words:
        // house, car, backyard, kitchen, bathroom

        Trie mytrie = new TrieImpl();
        mytrie.insert("house");
        mytrie.insert("car");
        mytrie.insert("backyard");
        mytrie.insert("kitchen");
        mytrie.insert("bathroom");

        // look up house
        String yours = "";
        String expected = "true";
        boolean found = mytrie.search("house");
        yours += found;
        TestAPIUtil.assertValue(yours, expected);


        // look up closet
        yours = "";
        expected = "false";
        found = mytrie.search("closet");
        yours += found;
        TestAPIUtil.assertValue(yours, expected);

        // delete house
        mytrie.delete("backyard");

        // look up house
        yours = "";
        expected = "false";
        found = mytrie.search("backyard");
        yours += found;
    }
}
