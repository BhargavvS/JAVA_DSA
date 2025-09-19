package TwoPointer;

import java.util.ArrayList;

public class MaxSubArray {
    public static void main(String[] args) {
        int[] nums = {1,4,6,3,7,4};
        int k = 20;
//        System.out.println(NumberOfMaxLenSubArray(nums,k));
        ArrayList<ArrayList<Integer>> list = MaxLenSubArrayArrayList(nums,k);
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }

    public static int maxLenSubArray(int[] nums, int k){
        int l=0;
        int r=0;
        int sum =0;
        int maxxLen = 0;

        while(r<nums.length){
            sum += nums[r];

            if(sum > k){
                sum -= nums[l];
                l++;
            }

            if(sum <=k) {
                maxxLen = Math.max(maxxLen,r-l+1);
                r++;
            }
        }

        return maxxLen;
    }

    public static int NumberOfMaxLenSubArray(int[] nums, int k){
        int l=0;
        int r=0;
        int sum =0;
        int maxxLen = 0;
        int cnt = 0;

        while(r<nums.length){
            sum += nums[r];


            if(sum > k){
                sum -= nums[l];
                l++;
            }

            if(sum <=k) {
                if(sum == k) cnt++;
                maxxLen = Math.max(maxxLen,r-l+1);
                r++;
            }
        }

        return cnt;
    }

    public static ArrayList<ArrayList<Integer>> MaxLenSubArrayArrayList(int[] nums, int k){
        int l=0;
        int r=0;
        int sum =0;
        int maxxLen = 0;
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();


        while(r<nums.length){
            sum += nums[r];


            if(sum > k){
                sum -= nums[l];
                l++;
            }

            if(sum <=k) {
                if(sum == k) {
                    ArrayList<Integer> list = new ArrayList<>();
                    list.add(l);
                    list.add(r);
                    result.add(list);
                }
                maxxLen = Math.max(maxxLen,r-l+1);
                r++;
            }
        }

        return result;
    }
}
