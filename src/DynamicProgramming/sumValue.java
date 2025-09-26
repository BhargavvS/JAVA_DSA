package DynamicProgramming;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.List;

public class sumValue {
    public static void main(String[] args) {
//        int[] nums = {3,2,6,8,10,1,1,5,6,1,5,7,6,0,9,1,2,4,5,6,8,2,4,7,9,1,2,3,10,11,36,35,41,1000,1800,20000,30000000};
//        int sum = 1999;
        int[] nums ={2,3,5,6,8,10};
        int sum = 10;
        int n = nums.length;
        Boolean[][] t = new Boolean[n+1][sum+1];
        System.out.println(sumValueBoolean(nums,sum,nums.length-1,t));
    }

    public static Boolean sumValueBoolean(int[] nums,int sum,int n,Boolean[][] t){
        if(sum == 0 && n==0 ) {
            return true;
        }

        if(sum == 0) return true;
        if(n==0) return false;

        if(t[n][sum] != null) return t[n][sum];

        if(nums[n] <= sum){
            Boolean left = sumValueBoolean(nums,sum-nums[n],n-1,t) ;
            Boolean right = sumValueBoolean(nums,sum,n-1,t);
            return t[n][sum] = left || right;
        } else{
          return t[n][sum] =  sumValueBoolean(nums,sum,n-1,t);
        }

    }

//    public static void  sumValuePrint(int[] nums,int sum,int n,Integer[][] t){
//        if(sum == 0 && n==0 ) {
//            System.out.println(nums[n]);
//            return;
//        }
//
//        if(sum == 0){
//            System.out.println(nums[n]);
//            return;
//        }
//        if(n==0){
//            return;
//        }
//
////        if(t[n][sum] != null) System.out.println(t[n][sum]);
//
//        List<List<Integer>> ans = new ArrayList<>();
//        if(nums[n] <= sum){
//            sumValuePrint(nums,sum-nums[n],n-1,t) ;
//            sumValuePrint(nums,sum,n-1,t);
//
//
//        } else{
//            sumValueList(nums,sum,n-1,t);
//        }
//    }
}
