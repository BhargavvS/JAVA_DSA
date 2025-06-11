package Recurssion;

public class peoductofdigits {
    public static void main(String[] args) {
        int product = prod(12345);
        System.out.println(product);
//        System.out.println(1%10); => 1
//        System.out.println(1/10); => 0

    }

    static int prod(int n) {
        if(n%10 == n) {
            return n;
        }

        return n % 10 * prod(n/10);
    }
}
