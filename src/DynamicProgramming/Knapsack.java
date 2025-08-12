package DynamicProgramming;

public class Knapsack {

    public static void main(String[] args) {
        int[] weights = {2,3,5,7};
        int[] values = {100,200,500,900};
        int n = weights.length;
        int capacity = 17;
        int[][] t = new int[n+1][capacity+1];
        System.out.println(knapsack01(weights,values,capacity,n,t));

    }

//    static int[][] t = new int[100][1000];

    public static int knapsack01(int[] weights,int[] values, int capacity, int n,int[][] t){
        if(n==0|| capacity ==0) return 0;

        if(t[n][capacity] != 0) return t[n][capacity];

        if(weights[n-1] <= capacity){
            return t[n][capacity] = Math.max(values[n-1] + knapsack01(weights,values,capacity-weights[n-1],n-1,t),knapsack01(weights,values,capacity,n-1,t));
        }

        if(weights[n-1]> capacity){
            return t[n][capacity] = knapsack01(weights,values,capacity,n-1,t);
        }

        return t[n-1][capacity];

    }
}
