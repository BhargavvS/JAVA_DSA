package Graphs;

import java.util.ArrayList;

public class dfsTraversal {
    public static void main(String[] args) {
        int v = 10;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<>());
        }

        addEdge(adj,1,2);
        addEdge(adj,1,6);
        addEdge(adj,2,3);
        addEdge(adj,2,4);
        addEdge(adj,4,5);
        addEdge(adj,5,8);
        addEdge(adj,6,7);
        addEdge(adj,6,9);
        addEdge(adj,7,8);

        for (int i = 0; i < adj.size(); i++) {
            System.out.println("Vertex " + i + " -> " + adj.get(i));
        }

        System.out.println("DFS traversal of the above graph with stating node as 1: ");
        ArrayList<Integer> BFS = dfs(v,adj);
        for(int val : BFS){
            System.out.print(val + " , ");
        }


    }

    private static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    public static ArrayList<Integer> dfs(int v, ArrayList<ArrayList<Integer>> adj){
        ArrayList<Integer> DFS = new ArrayList<>();
        boolean[] visited = new boolean[v+1];

        dfstravel(1,adj,DFS,visited);
        return DFS;
    }

    private static void dfstravel(int val, ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> dfs, boolean[] visited) {
        dfs.add(val);
        visited[val] = true;
        for(int v:adj.get(val)){
            if(!visited[v]){
                dfstravel(v,adj,dfs,visited);
            }
        }
    }
}
