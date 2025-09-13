package DynamicProgramming;

public class equalSum {
    public static void main(String[] args) {
        int[] nums = {1,5,11,5,2};
        System.out.println(isEqualSum(nums));
    }

    public static boolean isEqualSum(int[] nums){
        int sum=0;
        int n = nums.length;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        Boolean[][] t = new Boolean[n+1][(sum/2 )+1 ];

        if(sum % 2 !=0) return false;
        else return validEqaulSumTabluer(nums,sum/2,n-1,t);
    }

    private static boolean validEqaulSum(int[] nums, int sum,int n, Boolean[][] t) {
        if(sum == 0 && n==0 ) {
            return true;
        }

        if(sum == 0) return true;
        if(n==0) return false;

        if(t[n][sum] != null) return t[n][sum];

        if(nums[n] <= sum){
            Boolean left = validEqaulSum(nums,sum-nums[n],n-1,t) ;
            Boolean right = validEqaulSum(nums,sum,n-1,t);
            return t[n][sum] = left || right;
        } else{
            return t[n][sum] =  validEqaulSum(nums,sum,n-1,t);
        }
    }

    private static boolean validEqaulSumTabluer(int[] nums, int sum,int n, Boolean[][] t){

        for (int i = 0; i <n+1; i++) {
            for (int j = 0; j <sum+1 ; j++) {
                if(i ==0 && j==0 || j==0) t[i][j] = true;
                else t[i][j] = false;
            }
        }

        for (int i = 0; i < n+1 ; i++) {
            for (int j = 0; j < sum +1; j++) {
                if(nums[i] <= j) {
                    if(i>0) {
                        t[i][j] = t[i - 1][j - nums[i]] || t[i - 1][j];
                    }
                } else {
                    if(i>0) {
                        t[i][j] = t[i - 1][j];
                    }
                }
            }
        }

        return t[n][sum];
    }
}
