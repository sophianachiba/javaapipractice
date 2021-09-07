package src.api.solutions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

public class Sorts {
    
    static public int[] mergeSort(int[] nb){
        return mergeSort(nb, 0, nb.length-1);
    }

    static private int[] mergeSort(int[] nb, int start, int end){
        
        if(start == end){
            int[] r = new int[1];
            r[0] = nb[start];
            return r;
        }

        int mid = (end-start)/2 + start;
        int[] m1 = mergeSort(nb, start, mid);
        int[] m2 = mergeSort(nb, mid+1, end);

        return merge(m1, m2);
    }


    static private int[] merge(int[] A, int[] B){

        int[] result = new int[A.length+B.length];

        int aIdx = 0;
        int bIdx = 0;
        for(int i=0; i<result.length; i++){
            if(aIdx == A.length){
                result[i] = B[bIdx];
                bIdx++;
                continue;
            }
            if(bIdx == B.length){
                result[i] = A[aIdx];
                aIdx++;
                continue;
            }
            if(bIdx == B.length || A[aIdx] < B[bIdx]){
                result[i] = A[aIdx];
                aIdx++;
            }else{
                result[i] = B[bIdx];
                bIdx++;
            }
        }

        return result;
    }

    static public void quickSort(int[] nb){
        quickSort(nb, 0, nb.length-1);
    }

    static private void quickSort(int[] nb, int start, int end){

        if(start >= end) return;
        int left = partition(nb, start, end);
        quickSort(nb, start, left-1);
        quickSort(nb, left+1, end);
    }

    static private int partition(int nb[], int start, int end){
        int pivot = nb[start];
        int left = start+1;
        int right = end;

        while(left < right){
            if(nb[left]>pivot){
                swap(nb, left, right);
                right--;
            }else{
                left++;
            }
        }

        if(nb[left] > pivot)
            left--;
        swap(nb, start, left);
        return left;
    }

    static private void swap(int[] nb, int s, int e){
        int n = nb[s];
        nb[s] = nb[e];
        nb[e] = n;
    }

    public static int[][] sort2RelativeArrays(int[] A, int[] B){
        // Sort according to the 1st array while keeping the 2nd one in line with the 1st one.
        int[][] combined = new int[A.length-1][2]; 
        IntStream.range(0, A.length-1).forEach(x -> {
            combined[x][0] = A[x];
            combined[x][1] = B[x];
        });
        Arrays.sort(combined, new Comparator<int[]>(){
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            };
        });
        return combined;
    }

    static public int  searchSortedArray(int[] nb, int v){

        int left = 0;
        int right = nb.length-1;

        while(left <= right){
            int mid = (right -left)/2 + left;
            int current = nb[mid];
            if(current == v) return mid;
            if(nb[mid] > v)
                right = mid-1;
            else
                left = mid+1;
        }
        return -1;
    }
}
