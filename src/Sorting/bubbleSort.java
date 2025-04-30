package Sorting;

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7, 6, 5};
//        int[] arr = {1,2,3,4,5};
        System.out.println(STR."Array before sorting:\{Arrays.toString(arr)}");
        BSort(arr);
        System.out.println(STR."Array after sorting:\{Arrays.toString(arr)}");
    }

    static void BSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            boolean valid = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    valid = true;
                }
            }

            if(!valid) {
                break;
            }
        }
    }
}
