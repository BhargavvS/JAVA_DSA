package Leetcode;

import java.util.ArrayList;
import java.util.*;

//leetcode 120
public class TriangleMinSum {
    public static void main(String[] args) {
        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(Arrays.asList(-1));
        triangle.add(Arrays.asList(2, 3));
        triangle.add(Arrays.asList(1, -1, -3));
//        triangle.add(Arrays.asList(4, 1, 8, 3));

//        for (List<Integer> row : triangle) {
//            System.out.println(row);
//        }

        int min = minimumTotal(triangle);
        System.out.println("Min value = " + min);

    }

    public static int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[] dp = new int[n];
        for (int i = 0; i < n; i++) {
            dp[i] = triangle.get(n - 1).get(i);
        }

        // Start from second-last row and go upwards
        for (int row = n - 2; row >= 0; row--) {
            for (int col = 0; col <= row; col++) {
                dp[col] = triangle.get(row).get(col) + Math.min(dp[col], dp[col + 1]);
            }
        }

        // dp[0] now contains the minimum path sum
        return dp[0];
    }
}
