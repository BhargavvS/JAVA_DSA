package Recurssion;

public class reverseANumber {
    static long rev=0;
    static void reverse(int n) {
        if(n % 10 == 0) return;
        rev = rev * 10 + n %10;
        if (rev < Integer.MIN_VALUE || rev > Integer.MAX_VALUE) {
            rev = 0;
        }

        reverse(n/10);
    }

    public static void main(String[] args) {
        reverse(1534236469);
        System.out.println(rev);
    }

}
