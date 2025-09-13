package general;

public class fibonaaciNumbers {
    public static void main(String[] args) {
        System.out.println("sum " + fibonacci(10));
    }

    public static int fibonacci(int n){
        if(n==0){
            System.out.println(0);
            return 0;
        }

        if(n==1){
            System.out.println(1);
            return 1;
        }

        int n1 = 0;
        int n2 =1;
        int sum=0;
        while(n>0){
            System.out.println(n1);
            sum = n1+n2;
            n1 = n2;
            n2 = sum;
            n--;
        }

        return sum;

    }
}
