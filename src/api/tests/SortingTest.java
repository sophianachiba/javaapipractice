package src.api.tests;

import java.util.*;

import src.api.util.TestAPIUtil;

public class SortingTest {
    
    public static void main(String[] args) {
        int[] mergesort = {7, 4, 6, 8};
        int[] quicksort = {2, 6, 3, 4, 1};

        // Implement the mergeSort method
        int[] result = Sorts.mergeSort(mergesort);
        String yours = Arrays.toString(result);
        String expected = "[4, 6, 7, 8]";
        TestAPIUtil.assertValue(yours, expected);

        // Implement the quicksort method
        Sorts.quickSort(quicksort);
        yours = Arrays.toString(quicksort);
        expected = "[1, 2, 3, 4, 6]";
        TestAPIUtil.assertValue(yours, expected);

        // using the quicksort array
        // look up the index of number 6
        int index = Sorts.searchSortedArray(quicksort, 6);
        yours = "";
        expected = "4";
        yours += index;
        TestAPIUtil.assertValue(yours, expected);

        // given the following 2 array
        // knowing that there is a relation between the 2
        // ie A[1] linked to B[1]
        // sort the 1st one keeping the relationship.
        int[] A = {5,7,1,3,9};
        int[] B = {7,2,1,1,2};

        int[][] r = Sorts.sort2RelativeArrays(A, B);
        // print the 3rd element for A and its related B value
        //
        yours = r[2][0] + " " + r[2][1];
        expected = "5 7";
        TestAPIUtil.assertValue(yours, expected);

    }
}
