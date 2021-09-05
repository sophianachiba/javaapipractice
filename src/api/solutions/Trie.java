package src.api.solutions;
import java.util.*;

interface Trie {
    
    void insert(String word);

    boolean search(String word);

    void delete(String word);
}
