package DynamicProgramming;

public class minPacketsRemoved {
    public static void main(String[] args) {
        int[] nums = {1,0,1,1,0,1,1};
        int n = nums.length;
        int target = 2;
        System.out.println(removedPackerCount(nums,n,0,n-1,target,0));
    }

//    static int[][] t = new int[100][100];

    public static int removedPackerCount(int[] nums,int n,int i,int j,int target,int removed){
        if(n==0 || i == nums.length -1|| j==0) return 0;

        int count =0;
        for (int k=i;k<=j;k++){
            if(nums[k] == 1) count++;
        }

        if(target > count) return -1;
        if(count == target) return removed;


//        if(t[i][j] != 0) return t[i][j];

        if(nums[j] == 0){
            return removedPackerCount(nums,n-1,i,j-1,target,removed+1);
        }
        else if(nums[i] == 0){
           return removedPackerCount(nums,n-1,i,j-1,target,removed+1);
        } else{
            return removedPackerCount(nums,n-1,i+1,j,target,removed+1);
        }

//        return removed;
    }
}
