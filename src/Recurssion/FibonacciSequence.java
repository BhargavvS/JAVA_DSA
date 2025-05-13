package Recurssion;

public class FibonacciSequence {
    public static void main(String[] args) {

//        System.out.println("Total sum value = " + fibonacci(10));
//        System.out.println("Nth value = " + fibonacci(10));
        System.out.println(Nthfibo(10));
    }

    static int fibonacci(int n) {
        if(n==1) {
            System.out.println(0);
            return 0;
        }
        if(n==2) {
            System.out.println(1);
            return 1;
        }
        System.out.println(0);
        System.out.println(1);
        int f1=0;
        int f2=1;
        int fsum = 0;
        int finalsum = 0;
        while(n>2){
            fsum = f1+f2;
            finalsum += fsum;
            System.out.println(fsum);
            f1=f2;
            f2=fsum;
            n--;
        }

        return finalsum;
//        return fsum;
    }

    static int Nthfibo(int n) {
        if(n==0) return 0;
        if(n == 1) return 1;

        return Nthfibo(n-1) + Nthfibo(n-2);
    }

}
