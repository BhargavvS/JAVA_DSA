package Recurssion;

public class SumOfdigits {
    public static void main(String[] args) {
        int sum = sumofdigits(12345);
        System.out.println(sum);
//        System.out.println(1%10); => 1
//        System.out.println(1/10); => 0

    }

    static int sumofdigits(int n) {
        if(n%10 == n) {
            return n;
        }

        return n % 10 + sumofdigits(n/10);
    }
}
