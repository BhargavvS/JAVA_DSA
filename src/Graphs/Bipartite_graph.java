package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Bipartite_graph {
    public static void main(String[] args) {
        int v = 12;
        List<List<Integer>> adj = new ArrayList<>();

        for (int i = 0; i <= v; i++) {
            adj.add(new ArrayList<>());
        }

//        addEdge(adj, 1, 2);
//        addEdge(adj, 2, 3);
//        addEdge(adj, 3, 4);
//        addEdge(adj, 4, 5);
//        addEdge(adj, 4, 10);
//        addEdge(adj, 5, 6);
//        addEdge(adj, 6 ,7);
//        addEdge(adj,7,10);
//        addEdge(adj,7,8);
//        addEdge(adj,8,9);

        addEdge(adj, 1, 2);
        addEdge(adj, 2, 3);
        addEdge(adj, 3, 4);
        addEdge(adj, 4, 5);
        addEdge(adj, 4, 11);
        addEdge(adj, 5, 6);
        addEdge(adj, 6 ,7);
        addEdge(adj,7,8);
        addEdge(adj,8,9);
        addEdge(adj,9,10);
        addEdge(adj,11,12);

        System.out.println(isBipartiteGraphDFS(adj,v));


    }

    private static void addEdge(List<List<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    public static boolean isBipartiteGraphBFS(List<List<Integer>> adj , int v){
        int[] coloured = new int[v+1];
        for (int i = 0; i < coloured.length; i++) {
            coloured[i] = -1;
        }

        for (int i = 0; i < v; i++) {
            if(coloured[i] == -1) {
                if(!(colourGraphBFS(i,adj,coloured))) return false;
            }
        }

        return true;


    }

    private static boolean colourGraphBFS(int start, List<List<Integer>> adj,int[] coloured){
        Queue<Integer> q = new LinkedList<>();

        coloured[start] = 0;
        q.add(start);

        while (!q.isEmpty()){
            int i = q.peek();
            q.poll();
            for (int val : adj.get(i)){
                if(coloured[val] == -1){
                    if(coloured[i] == 0) coloured[val] = 1;
                    if(coloured[i] !=0 ) coloured[val] = 0;
                    q.add(val);
                }

                if(coloured[i] == coloured[val]) return false;
            }
        }

        return true;
    }

    public static boolean isBipartiteGraphDFS(List<List<Integer>> adj, int v){
        int[] coloured = new int[v+1];
        for (int i = 0; i < coloured.length; i++) {
            coloured[i] = -1;
        }

        for (int i = 0; i < v; i++) {
            if(coloured[i] == -1) {
                if(!(colourGraphDFS(i,0,adj,coloured))) return false;
            }
        }

        return true;
    }

    private static boolean colourGraphDFS(int start,int colour, List<List<Integer>> adj, int[] coloured) {
         coloured[start] = colour;

        for (int val: adj.get(start)){
            if(coloured[val] == -1){
                if(!colourGraphDFS(val,1-coloured[start],adj,coloured)) return false;
            }
            if(coloured[val] == coloured[start]) return false;
        }

        return true;
    }
}
