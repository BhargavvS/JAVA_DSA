package Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        // decalaration of array
        int[]  arr = new int[5];
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the values");
        for(int i=0;i<5;i++)  {
            arr[i]  = sc.nextInt();
        }

        // method 1 to print
        // for(int i=0;i<5;i++)  {
        //     System.out.print(arr[i] + " ");
        // }

        // method 2 , best way to print
        System.out.println(Arrays.toString(arr));

        // method 3 to print
        // for (int i : arr) {
        //     System.out.println(i);
        // }
    }
}
