package DynamicProgramming;

import linkedList.Main;

public class LongestCommonSubsequence {
    public static void main(String[] args) {
        String s1 = "abcdefghijkll";
        String s2 = "abcdefghijll";

        int n = s1.length();
        int m = s2.length();

        int[][] t = new int[n+1][m+1];
//        for (int i = 0; i < n+2; i++) {
//            for (int j = 0; j < m+2; j++) {
//                t[i][j] = -1;
//            }
//        }

//        System.out.println(lcseq(s1,s2,n,m)+1);
//        System.out.println(lcseqMemo(s1,s2,n,m,t)+1);
//        System.out.println(lcseqTable(s1,s2,n,m,t));
        System.out.println(lcseqPrint(s1,s2,n,m,t));
    }


    public static int lcseq(String s1, String s2 , int n, int m){
        if(n==0 || m==0) {
            return 0;
        }

//        if(t[n][m] !=0) return t[n][m];

        if(s1.charAt(n) == s2.charAt(m)){
            return  1+lcseq(s1,s2,n-1,m-1);
        }
        else{
           return Math.max(lcseq(s1, s2, n, m - 1), lcseq(s1, s2, n - 1, m));
        }
    }

    public static int lcseqMemo(String s1, String s2 , int n, int m , int[][] t){
        if(n==0 || m==0) {
            return 0;
        }

        if(t[n][m] !=-1) return t[n][m];

        if(s1.charAt(n) == s2.charAt(m)){
            return t[n][m] =  1+lcseqMemo(s1,s2,n-1,m-1,t);
        }
        else{
            return t[n][m] = Math.max(lcseqMemo(s1, s2, n, m - 1,t), lcseqMemo(s1, s2, n - 1, m,t));
        }
    }

    public static int lcseqTable(String s1, String s2,int n , int m, int[][] t){
        for (int i = 0; i < n+1; i++) {
            for (int j = 0; j < m+1; j++) {
                if(i ==0 || j==0){
                    t[i][j] = 0;
                }
            }
        }


        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < m+1; j++) {
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    t[i][j] = t[i-1][j-1] +1;
                }
                else{
                    t[i][j] = Math.max(t[i-1][j],t[i][j-1]);
                }
            }
        }

        return t[n][m];
    }

    public static String lcseqPrint(String s1, String s2,int n , int m, int[][] t){
        for (int i = 0; i < n+1; i++) {
            for (int j = 0; j < m+1; j++) {
                if(i ==0 || j==0){
                    t[i][j] = 0;
                }
            }
        }


        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < m+1; j++) {
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    t[i][j] = t[i-1][j-1] +1;
                }
                else{
                    t[i][j] = Math.max(t[i-1][j],t[i][j-1]);
                }
            }
        }

        return lcsString(s1,s2,n,m,t);
    }

    private static String lcsString(String s1, String s2, int i, int j, int[][] t) {
        StringBuilder sb = new StringBuilder(t[i][j]);
        while(i>0 && j>0){
            if(s1.charAt(i-1) == s2.charAt(j-1)){
                sb.append(s1.charAt(i-1));
                i--;
                j--;
            }else{
                if(t[i][j-1] > t[i-1][j]){
                    j--;
                }else{
                    i--;
                }
            }
        }

        return sb.reverse().toString();
    }


}
