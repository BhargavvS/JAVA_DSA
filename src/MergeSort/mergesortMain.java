package MergeSort;

import java.util.Arrays;

import static java.io.ObjectInputFilter.merge;

public class mergesortMain {
    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        int[] ans = mergesort(arr);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] mergesort(int[] arr){
        if(arr.length == 1) {
            return arr;
        }

        int mid = arr.length/2;

        int[] left = mergesort(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergesort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left,right);
    }

    private static int[] merge(int[] left, int[] right) {
        int[] sorted = new int[left.length + right.length];

        int i=0;
        int j=0;
        int k=0;

        while(i< left.length && j< right.length){
            if(left[i] < right[j]){
                sorted[k] = left[i];
                i++;
            } else {
                sorted[k] = right[j];
                j++;
            }
            k++;
        }

        while (i< left.length){
            sorted[k] = left[i];
            i++;
            k++;
        }

        while (j<right.length){
            sorted[k] = right[j];
            j++;
            k++;
        }


        return sorted;
    }
}


