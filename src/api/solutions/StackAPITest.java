package src.api.solutions;

import java.util.*;

import src.api.util.TestAPIUtil;

public class StackAPITest {
    

    public static void main(String[] args){

        // CORE METHODS
        // Push, Pop, empty, peek
        
        String yours = "";
        String expected = "";
        // create a Stack
        Stack<Integer> s = new Stack<Integer>();

        // add 1,2,3
        // print top of the stack
        yours = "";
        expected = "3";
        s.push(1);
        s.push(2);
        s.push(3);
        yours += s.peek();
        TestAPIUtil.assertValue(yours, expected);
        // add all element in the stack
        yours = "";
        expected = "6";
        int total = 0;
        while(!s.empty()){
            total += s.pop();
        }
        yours += total;
        TestAPIUtil.assertValue(yours, expected);
    }

}
