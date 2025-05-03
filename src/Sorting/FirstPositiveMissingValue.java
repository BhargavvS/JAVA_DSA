package Sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FirstPositiveMissingValue {
    public static void main(String[] args) {
        int[] nums = {1};
        System.out.println(firstMissingPositive(nums));
    }

    static int firstMissingPositive(int[] nums) {
        int i=0;
        while(i<nums.length) {

            if(nums.length ==1) break;
            int correct = nums[i] - 1;;
            if(nums[i] >0 && correct < nums.length && nums[i] != nums[correct])
            {
                swap(nums, i, correct);
            }
            else {
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));
        for(int j=0;j<nums.length;j++) {
            if(nums[j] != j+1){
                return j+1;
            }
        }
        return nums.length + 1;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] =arr[second];
        arr[second] = temp;
    }
}
