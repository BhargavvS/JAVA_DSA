package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFSTraversal {
    public static void main(String[] args) {
        int v = 10;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<>());
        }

        // starting node as 0
//        addEdge(adj,0,1);
//        addEdge(adj,0,5);
//        addEdge(adj,1,2);
//        addEdge(adj,1,3);
//        addEdge(adj,3,4);
//        addEdge(adj,4,7);
//        addEdge(adj,5,6);
//        addEdge(adj,5,8);
//        addEdge(adj,6,7);

        // starting node as 1
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


//        System.out.println("BFS traversal of the above graph with stating node as 0: ");
//        ArrayList<Integer> BFS = bfs(v,adj);
//        for(int val : BFS){
//            System.out.print(val + " , ");
//        }

        System.out.println("BFS traversal of the above graph with stating node as 1: ");
        ArrayList<Integer> BFS = bfs(v,adj);
        for(int val : BFS){
            System.out.print(val + " , ");
        }

    }

    private static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    public static ArrayList<Integer> bfs(int v, ArrayList<ArrayList<Integer>> adj){
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[v];
        ArrayList<Integer> BFS = new ArrayList<>();

        //starting node 0
        // q.add(0)

        //starting node 1
        q.add(1);

        while(!q.isEmpty()){
            int node = q.poll();
            BFS.add(node);
            visited[node] = true;

            for(int value : adj.get(node)){
                if(!visited[value]){
                    visited[value] = true;
                    q.add(value);
                }
            }
        }

        return BFS;

    }
}
