package src.api.solutions;

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
            if(A[aIdx] < B[bIdx]){
                result[i] = A[aIdx];
                aIdx++;
            }else{
                result[i] = B[bIdx];
                bIdx++;
            }
        }

        return result;
    }

    void quickSort(int[] nb){

    }

    void searchSortedArray(int[] nb){

    }
}
