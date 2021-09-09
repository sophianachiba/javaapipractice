package src.api.tests;

import src.api.util.TestAPIUtil;

public class PriorityQeueAPITest {
    public static void main(String[] args){
    
        String yours = "";
        String expected = "";
        // create a Priority Queue and add 5 4 3 2 1
        // print all elements but the last 2
        yours = "";
        expected ="1 2 3 ";
        TestAPIUtil.assertValue(yours, expected);

        // print the new head of the poll
        yours = "";
        expected ="4";
        TestAPIUtil.assertValue(yours, expected);

        // print the size of the Q
        yours = "";
        expected ="2";
        TestAPIUtil.assertValue(yours, expected);

        // given the data: 4, 1, 3, 6, 8
        // print the 3 largest elements seen
        yours = "";
        expected = "4 6 8 ";
        int[] inputs = {4, 1, 3, 6, 8};

        TestAPIUtil.assertValue(yours, expected);

        // given the data: 4, 1, 3, 6, 8
        // print the 3 smallest elements seen
        yours = "";
        expected ="4 3 1 ";

        TestAPIUtil.assertValue(yours, expected);
        

        // given a construction project that needs 2 contractors
        //  find the cheapest cost and how long it will take
        int[] hourlyCost = {4, 5, 10, 6};
        int[] nbofHours = {3, 2, 1, 3};
        yours = "";
        expected ="20 3"; // $20 and 3h job

        TestAPIUtil.assertValue(yours, expected);

    }

}
