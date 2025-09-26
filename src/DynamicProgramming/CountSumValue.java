package DynamicProgramming;

public class CountSumValue {
    public static void main(String[] args) {
        int[] nums ={2,3,5,6,8,10};
        int sum = 10;
        int n = nums.length;
        int[][] t = new int[n+1][sum+1];
        System.out.println(count(nums,sum,t,nums.length-1));
    }

    public static int count(int[] nums, int sum,int[][] t,int n){
        if(sum == 0 && n==0 ) {
            return 1;
        }

        if(sum == 0) return 1;
        if(n==0) return 0;

//        if(t[n][sum] != -1) return t[n][sum];
        int count =0;

        if(nums[n] <= sum){
            count += count(nums,sum-nums[n],t,n-1);
            count += count(nums,sum , t, n-1);
        } else{
            count += count(nums,sum,t,n-1);
        }

        return count;
    }
}
