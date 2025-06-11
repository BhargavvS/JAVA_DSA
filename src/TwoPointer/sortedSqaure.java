package TwoPointer;

public class sortedSqaure {
   static public int[] sortedSquares(int[] nums) {
       int[] result = new int[nums.length];
       int l = 0;
       int r = nums.length - 1;
       int k = nums.length - 1; // Start filling from the end

       while (l <= r) {
           int leftSq = nums[l] * nums[l];
           int rightSq = nums[r] * nums[r];

           if (leftSq > rightSq) {
               result[k] = leftSq;
               l++;
           } else {
               result[k] = rightSq;
               r--;
           }
           k--;
       }

       return result;
   }


    public static void main(String[] args) {
        int[] nums = {-7,-3,2,3,11};

        int[] result = sortedSquares(nums);
        for(int i : result) {
            System.out.println(i);
        }

    }
}
