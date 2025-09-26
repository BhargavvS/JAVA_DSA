package Graphs;

import java.util.*;

import static Graphs.dfsTraversal.dfs;

public class TopologicalSorting {
    public static void main(String[] args) {
        int v = 8;
        List<List<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<>());
        }

        addEdgeDirected(adj,0,1);
        addEdgeDirected(adj,1,2);
        addEdgeDirected(adj,1,3);
        addEdgeDirected(adj,2,4);
        addEdgeDirected(adj,2,5);
        addEdgeDirected(adj,2,6);
        addEdgeDirected(adj,2,7);
        addEdgeDirected(adj,3,4);


        List<Integer> result = SortingDFS(adj,v);
//        List<Integer> result = SortingBFS(adj,v);

        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i) + " ");
        }


    }

    private static void addEdgeDirected(List<List<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
    }


    public static List<Integer> SortingDFS(List<List<Integer>> adj,int v){
        boolean[] visited = new boolean[v];
        Stack<Integer> stack = new Stack<>();
        List<Integer> TopologicalOrder = new ArrayList<>();

        for (int i = 0; i < v; i++) {
            if(!visited[i]){
                dfs(i,visited,stack,adj);
            }
        }

        while (!stack.isEmpty()){
            int val = stack.pop();
            TopologicalOrder.add(val);
        }

        return TopologicalOrder;
    }

    private static void dfs(int i, boolean[] visited, Stack<Integer> stack,List<List<Integer>> adj) {
        visited[i] = true;

        for (int val:adj.get(i)){
            if(!visited[val]){
                dfs(val,visited,stack,adj);
                stack.push(val);
            }
        }
    }

    public static List<Integer> SortingBFS(List<List<Integer>> adj,int v){
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

        return list;




    }
}
