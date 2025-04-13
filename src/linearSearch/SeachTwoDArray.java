package linearSearch;

public class SeachTwoDArray {
    public static void main(String[] args) {
        int[][] nums = {
                {23, 4, 1},
                {18, 12, 3, 9},
                {78, 99, 34, 56},
                {18, 12}
        };
        int target = 34;
        System.out.println("target element exist: "+ Search(nums,target));

        System.out.println("Max value of the array: " + FindMax(nums));
    }
    static boolean Search(int[][] nums , int target) {
        for(int i=0;i<nums.length;i++) {
            for(int j=0;j<nums[i].length;j++) {
                if(target == nums[i][j]) return true;
            }
        }

        return false;
    }

    static int FindMax(int[][] nums) {
        int max= Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if(nums[i][j] > max) max= nums[i][j];
            }
        }
        return max;
    }
}


