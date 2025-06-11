package Recurssion;

import java.util.Arrays;

public class SelectionSort {
    public static void  selectionSort(int[] arr , int r, int c, int max) {
        if(r==0) {
            return;
        }

        if(c<=r) {
            if(arr[c] > arr[max]) {
               max = c;
            }
            selectionSort(arr,r,c+1,max);

        } else {
            int temp = arr[r];
            arr[r] = arr[max];
            arr[max] = temp;
            selectionSort(arr, r-1,0,0);
        }

    }

    public static void main(String[] args) {
//        p2(4,0);
        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
        selectionSort(arr,arr.length-1,0,0);
        System.out.println(Arrays.toString(arr));
    }
}
