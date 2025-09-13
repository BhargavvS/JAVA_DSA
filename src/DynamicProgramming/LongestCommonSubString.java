package DynamicProgramming;

public class LongestCommonSubString {
    public static void main(String[] args) {
        String s1 = "abcdefh";
        String s2 = "abcdefhf";

        System.out.println(lcstring(s1,s2,0,0));
    }

    public static int lcstring(String s1,String s2,int n , int m){
        if(n == s1.length() || m == s2.length()){
            return 0;
        }

        if(s1.charAt(n) == s2.charAt(m)){
            return 1 + lcstring(s1,s2,n+1,m+1);
        }else{
            return Math.min(lcstring(s1,s2,n,m+1),lcstring(s1,s2,n+1,m));
        }
    }
}
