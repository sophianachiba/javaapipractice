package src.api.solutions;


import java.util.*;

public class TrieImpl implements Trie{

    TrieNode root = new TrieNode();

    @Override
    public void insert(String word) {
        
        TrieNode current = root;
        for(Character c : word.toCharArray()){
            TrieNode child = current.children.get(c);
            if(child == null){
                child = new TrieNode();
                current.children.put(c, child);
            }
            current = child;
        }

        current.endWord = true;
        
    }

    @Override
    public boolean search(String word) {
        
        TrieNode current = root;

        for(Character c : word.toCharArray()){
            TrieNode child = current.children.get(c);
            if(child == null) return false;
            current = child;
        }

        return current.endWord;
    }

    @Override
    public void delete(String word) {
        delete(root, word,0);
    }

    private boolean delete(TrieNode n, String word, int index){
        if(n == null) return false;
        if(index == word.length()){
            n.endWord = false;
            if(n.children.size() == 0) return true;
            return false;
        }


        TrieNode child = n.children.get(word.charAt(index));
        boolean del = delete(child, word, index +1);
        if(del){
            n.children.remove(word.charAt(index));
            if(n.children.size() == 0) return true;
        }

        return false;
    }
    
}

class TrieNode {
    Map<Character, TrieNode> children = new Hashtable<>();
    boolean endWord = false;
    List<String> completion = new ArrayList<String>();
}
