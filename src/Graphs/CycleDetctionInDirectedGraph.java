package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CycleDetctionInDirectedGraph {
    public static void main(String[] args) {
        int v = 6;
        List<List<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<>());
        }

       addEdgeDirected(adj,1,2);
        addEdgeDirected(adj,2,3);
        addEdgeDirected(adj,3,4);
        addEdgeDirected(adj,3,5);
        addEdgeDirected(adj,4,5);

        boolean isCycle = hasCycle(adj,v);
        System.out.println("Cycle exist: " + isCycle);



    }

    private static void addEdgeDirected(List<List<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
    }


    public static boolean hasCycle(List<List<Integer>> adj, int v){
        List<Integer> list = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        int[] inDegree = new int[v];

        for (int i = 0; i < v; i++) {
            for(int val:adj.get(i)){
                inDegree[val] +=1;
            }
        }

        for (int i = 0; i < v; i++) {
            if(inDegree[i] ==0) q.add(i);
        }

        while (!q.isEmpty()){
            int val = q.poll();
            list.add(val);
            for (int value: adj.get(val)){
                inDegree[value] -=1;

                if(inDegree[value] == 0) q.add(value);
            }
        }

        if (list.size() ==v) return false;
        return true;
    }
}
