package Graphs;

import java.util.ArrayList;
import java.util.List;

public class courseSchedule1 {
    public static void main(String[] args) {
        int v = 4;
        int[][] prerequisite = {
                {1, 0},{2,1},{3,2}
        };

        isPossible(v,prerequisite);

    }

    public static boolean isPossible(int V, int[][] prerequisite){
        List<List<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        int m = prerequisite.length;
        for (int i = 0; i < m; i++) {
            adj.get(prerequisite[i][0]).add(prerequisite[i][1]);
        }

        for(List list : adj){
            System.out.println(list);
        }

        return true;
    }

}
