package subset;

import java.util.ArrayList;
import java.util.List;

public class subsetMain {
    public static void main(String[] args) {
        int[] nums = {1,2,2};
        List<List<Integer>> list = subsetIterationDuplicate(nums);

        for(List<Integer> li: list){
            System.out.println(li);
        }
    }

    public  static List<List<Integer>> subsetIteration(int[] nums){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        for(int num:nums){
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }

        return outer;
    }

    public  static List<List<Integer>> subsetIterationDuplicate(int[] nums){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int start =0;
        int end =0;

        for (int i = 0; i < nums.length; i++) {
            if(i>0 && nums[i] == nums[i-1]){
                start = end+1;
            }
            end = outer.size()-1;
            int n = outer.size();
            for (int j = start; j < n; j++) {
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(nums[i]);
                outer.add(internal);
            }
        }

        return outer;
    }
}
