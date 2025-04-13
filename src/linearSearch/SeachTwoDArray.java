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
    }
    static boolean Search(int[][] nums , int target) {
        for(int i=0;i<nums.length;i++) {
            for(int j=0;j<nums[i].length;j++) {
                if(target == nums[i][j]) return true;
            }
        }

        return false;
    }
}


