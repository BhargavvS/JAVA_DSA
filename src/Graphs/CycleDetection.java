package Graphs;

import java.util.ArrayList;
import java.util.List;

import static Graphs.dfsTraversal.dfs;

public class CycleDetection {
    public static void main(String[] args) {
        // cycle detection in a undirected graph
        int v = 8;
        List<List<Integer>> adj = new ArrayList<>();

        for (int i = 0; i <= v; i++) {
            adj.add(new ArrayList<>());
        }

//        addEdge(adj, 1, 2);
//        addEdge(adj, 1, 3);
//        addEdge(adj, 3, 6);
//        addEdge(adj, 2, 4);
//        addEdge(adj, 3, 7);
//        addEdge(adj, 4, 7);
//        addEdge(adj, 5, 7);

        addEdge(adj, 1, 2);
        addEdge(adj, 1, 3);
        addEdge(adj, 2, 4);
        addEdge(adj, 3, 5);
        addEdge(adj, 4, 6);
        addEdge(adj, 4, 8);
        addEdge(adj, 6 ,7);


        System.out.println(isCycle(adj,v));
    }

    private static void addEdge(List<List<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }


    public static boolean isCycle(List<List<Integer>> adj, int v){
        int[] visited = new int[v+1];

        visited[1] = 1;
        for (int i = 1; i <= v; i++) {
            for (int val : adj.get(i)){
                if(visited[val] ==0){
                    if(dfs(val,i,adj,visited)) return true;
                }
            }
        }

        return false;
    }

    private static boolean dfs(int val, int i, List<List<Integer>> adj, int[] visited) {
        visited[val] = 1;

        for(int v : adj.get(val)){
            if(visited[v] != 1){
                if(dfs(v,val,adj,visited)) return true;
            }
            else if(v != i) return true;
        }

        return false;
    }

}
