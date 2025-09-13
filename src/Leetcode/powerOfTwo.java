package Leetcode;

public class powerOfTwo {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(32));
    }

    public static boolean isPowerOfTwo(int n) {
//        return ptwo(n,0);
        if(n==1) return true;
        if(n<1 || n%2!=0) return false;
        return isPowerOfTwo(n/2);
    }

    public static int isPowerOfTwoValue(int n) {
        return ptwoValue(n,0)-1;
    }


    private static int ptwoValue(int n , int p){
        double number = Math.pow(2,p);
        if(n == number ) return 1;
        if(number > n) return 0;
        int power =1;
        power += ptwoValue(n,p+1);
        return power;
    }
}
