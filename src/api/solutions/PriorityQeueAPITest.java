package src.api.solutions;

import java.util.*;
import java.util.stream.*;

import src.api.util.TestAPIUtil;

public class PriorityQeueAPITest {
    public static void main(String[] args){
    
        // Core Methods:
        // add, peek, poll, size
        String yours = "";
        String expected = "";
        // create a Priority Queue and add 5 4 3 2 1
        PriorityQueue<Integer> q = new PriorityQueue<Integer>();
        q.add(5);
        q.add(4);
        q.add(3);
        q.add(2);
        q.add(1);
        // print all elements but the last 2
        yours = "";
        expected ="1 2 3 ";

        while(q.size() >2){
            yours += q.poll() +" ";
        }
        TestAPIUtil.assertValue(yours, expected);

        // print the new head of the poll
        yours = "";
        expected ="4";

        yours += q.peek();
        TestAPIUtil.assertValue(yours, expected);

        // print the size of the Q
        yours = "";
        expected ="2";

        yours += q.size();
        TestAPIUtil.assertValue(yours, expected);

        // given the data: 4, 1, 3, 6, 8
        // print the 3 largest elements seen
        yours = "";
        expected = "4 6 8 ";
        int[] inputs = {4, 1, 3, 6, 8};

        q = new PriorityQueue<>();

        for(int nb : inputs){
            if(q.size() == 3){
                if(q.peek() < nb){
                    q.poll();
                    q.add(nb);
                }
            }else{
                q.add(nb);
            }
        }

        while(q.size() > 0){
            yours += q.poll() +" ";
        }
        TestAPIUtil.assertValue(yours, expected);

        // given the data: 4, 1, 3, 6, 8
        // print the 3 smallest elements seen
        yours = "";
        expected ="4 3 1 ";

        q = new PriorityQueue<>(Collections.reverseOrder());

        for(int nb : inputs){
            if(q.size() == 3){
                if(q.peek() > nb){
                    q.poll();
                    q.add(nb);
                }
            }else{
                q.add(nb);
            }
        }

        while(q.size() > 0){
            yours += q.poll() +" ";
        }
        TestAPIUtil.assertValue(yours, expected);
        

        // given a construction project that needs 2 contractors
        //  find the cheapest cost and how long it will take
        int[] hourlyCost = {4, 5, 10, 6};
        int[] nbofHours = {3, 2, 1, 3};
        yours = "";
        expected ="20 3"; // $20 and 3h job

        Integer[][] totalCost = new Integer[hourlyCost.length][2];
        IntStream.range(0,hourlyCost.length).forEach(x -> {
            totalCost[x][0] = hourlyCost[x] * nbofHours[x];
            totalCost[x][1] = nbofHours[x];
        });

        PriorityQueue<Integer[]> costRank = new PriorityQueue<Integer[]>(hourlyCost.length, new Comparator<Integer[]>(){
            public int compare(Integer[] o1, Integer[]o2){
                return o1[0] - o2[0];
            }
        });

        for(Integer cost[] : totalCost)
            costRank.add(cost);

        Integer[] costHour = {0,0};

        IntStream.range(0,2).forEach( x ->{
            Integer[] cost = costRank.poll();
            costHour[0] += cost[0];
            costHour[1] += cost[1];
        });

        yours += costHour[0] + " " + costHour[1];
        TestAPIUtil.assertValue(yours, expected);

    }

}
