package Arrays;

import java.util.ArrayList;
import java.util.List;

public class MigratoryBirds {
    public static int migratoryBirds(List<Integer> arr) {
        // Write your code here
        int max = 0;
        List<Integer> li = new ArrayList<>();

        for (int val : arr) {
            li.add(val, li.get(val) + 1);
        }

        for(int i=1;i<li.size();i++) {
            if(li.get(max) < li.get(i)) {
                max = i;
            }
        }

        return max;

    }

    public static void main(String[] args) {

    }
}
