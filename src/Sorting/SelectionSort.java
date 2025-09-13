package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7, 6, 5};
//        int[] arr = {1,2,3,4,5};
//        int[] arr = {1};
//        int[] arr = {};
//        int[] arr = {10,-2,-5,0,12,10,11};
        System.out.println(STR."Array before sorting:\{Arrays.toString(arr)}");
        SelectionSort2(arr);
        System.out.println(STR."Array after sorting:\{Arrays.toString(arr)}");
    }

    static void Selection(int[] arr) {
        for(int i=0;i<arr.length;i++) {

            int  last = arr.length - i - 1;
            int max = MaxValue(arr,0,last);
            swap(arr,max,last);
        }
    }

    public static void SelectionSort2(int[] arr){
        for (int i=0;i< arr.length;i++){
            int min = MinValue(arr,i,arr.length-1);
            swap(arr,min,i);
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp =arr[first];
        arr[first] =arr[second];
        arr[second] = temp;
    }

    static int MaxValue(int[] arr,int start, int end) {
        int max = start;
        for(int i=start;i<=end;i++){
            if(arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }

    public static int MinValue(int[] arr, int start, int end){
        int min = start;

        for(int i=start+1;i<=end;i++){
            if(arr[min] > arr[i]) min = i;
        }

        return min;
    }
}
