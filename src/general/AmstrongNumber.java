package general;

public class AmstrongNumber {
    public static void main(String[] args) {
//        System.out.println(isAmstrong(135));
        printAmstrong(100000);
    }

    public static void printAmstrong(int number){
        for (int i=1;i<=number;i++){
            if(isAmstrong(i)) System.out.println(i);
        }
    }

    public static boolean isAmstrong(int n){

        int sum = 0;
        int temp = n;
        int len = String.valueOf(n).length();
        while(n>0){
            int number = n%10;
            sum += Math.pow(number,len);
            n = n/10;
        }

        if(sum == temp) return true;
        else return false;
    }
}
