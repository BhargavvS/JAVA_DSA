package TwoPointer;

public class MaxPointsFromCards {
    public static void main(String[] args) {
        int[] nums =  {6,3,2,4,7,1,3,6,1};
        int k=5;
        System.out.println(maxPoints(nums,k));
    }

    public static int maxPoints(int[] nums, int k){
        int sum=0;
        int lsum =0;
        int rsum =0;
        int maxPoints =0;
        int rindex = nums.length-1;

        for (int i=0;i<k;i++){
            lsum += nums[i];
        }

        for (int i = k-1; i >=0 ; i--) {
            maxPoints = Math.max(maxPoints,lsum+rsum);
            lsum -= nums[i];
            rsum += nums[rindex];
            rindex--;
        }

        return maxPoints;
    }
}
