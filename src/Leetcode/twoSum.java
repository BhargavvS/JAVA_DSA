package Leetcode;

import java.util.Arrays;

public class twoSum {
    public static void main(String[] args) {
        int[] nums = {2,7,8,10};
        int[] ans = pair(nums,9);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] pair(int[] nums, int target){
        int i=0;
        int j= nums.length -1;
        int sum=0;
        int[] ans = new int[2];

        for (int k = 0; k < nums.length; k++) {
            sum = nums[i] + nums[j];
            if(sum>target) j--;
            else if(sum < target) i++;
            else{
                break;
            }
        }

        return new int[]{i,j};
    }
}
