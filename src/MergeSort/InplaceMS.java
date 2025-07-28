package MergeSort;

import java.util.Arrays;

public class InplaceMS {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1};
        mergesortInplace(arr,0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    public static void mergesortInplace(int[] arr, int start, int end){
        if(end-start == 1) {
            return;
        }

        int mid = (start+end)/2;

       mergesortInplace(arr,start,mid);
       mergesortInplace(arr,mid,end);

        merge(arr, start,mid,end);
    }

    private static void merge(int[] arr, int start,int mid, int end) {
        int[] sorted = new int[end - start];

        int i=start;
        int j=mid;
        int k=0;

        while(i< mid && j< end){
            if(arr[i] < arr[j]){
                sorted[k] = arr[i];
                i++;
            } else {
                sorted[k] = arr[j];
                j++;
            }
            k++;
        }

        while(i< mid){
            sorted[k] = arr[i];
            i++;
            k++;
        }

        while(j<end){
            sorted[k] = arr[j];
            j++;
            k++;
        }


        for (int l = 0; l < sorted.length; l++) {
            arr[start+l] = sorted[l];
        }
    }
}
