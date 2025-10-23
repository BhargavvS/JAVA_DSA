package DynamicProgramming;

import org.w3c.dom.ranges.Range;

import java.util.*;

public class minDiffernce {
    public static void main(String[] args) {
        int[] nums = {1,2,7};
        int min = minDiff(nums);
        System.out.println("Min Diff value = " + min);
    }

    public static int minDiff(int[] nums){
        int n = nums.length;
        int Range =0;
        int min =  Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            Range += nums[i];
        }

        boolean[][] t = new boolean[n+1][Range+1];

        subsetSum(nums,Range,n,t);
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < t.length/2; i++) {
            if(t[n][i]){
                list.add(i);
            }
        }

        for (int i = 0; i < list.size(); i++) {
            min = Math.min(min , Range- 2 * list.get(i));
        }

        return min;
    }

    private static Boolean subsetSum(int[] nums, int Range,int n ,boolean[][] t){
        if(Range == 0 && n==0 ) {
            return true;
        }

        if(Range == 0) return true;
        if(n==0) return false;

        if(t[n][Range]) return t[n][Range];

        if(nums[n] <= Range){
            Boolean left = subsetSum(nums,Range-nums[n],n-1,t) ;
            Boolean right = subsetSum(nums,Range,n-1,t);
            return t[n][Range] = left || right;
        } else{
            return t[n][Range] =  subsetSum(nums,Range,n-1,t);
        }
    }
}
