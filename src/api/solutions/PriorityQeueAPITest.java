package src.api.solutions;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

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

        q = new PriorityQueue<>(new Comparator<Integer>(){
            public int compare(Integer i1 , Integer i2){
                return i2 - i1;
            }
        });

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
        expected ="20 3"; // $36 and 8h job

        int[][] hoursAndCost = new int[hourlyCost.length][2];

        for(int i=0; i<hourlyCost.length; i++){
                hoursAndCost[i][0] = hourlyCost[i];
                hoursAndCost[i][1] = nbofHours[i];
        }

        Queue<int[]> cost = new PriorityQueue<>(new Comparator<int[]>(){
            public int compare(int[] o1, int[] o2){
                return o2[0]*o2[1] - o1[0]*o1[1];
            }});

        for(int[] nb : hoursAndCost){
            if(cost.size() == 2){
                int maxcost = cost.peek()[0] * cost.peek()[1];
                int currentcost = nb[0] * nb[1];
                if(maxcost > currentcost){
                    cost.poll();
                    cost.add(nb);
                }
            }else{
                cost.add(nb);
            }
        }
        
        int totalcost = 0;
        int totalhours = 0;
        System.out.println(cost.size());
        while(cost.size() > 0){
            int[] hc = cost.poll();
            System.out.println(hc[0] + " " + hc[1]);
            totalcost += hc[0]*hc[1];
            totalhours += hc[1];
        }

        yours += totalcost + " " + totalhours;
        TestAPIUtil.assertValue(yours, expected);

    }

}
