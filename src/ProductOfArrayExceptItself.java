import java.lang.reflect.Array;
import java.util.Arrays;

public class ProductOfArrayExceptItself {
    static int product(int[] arr, int index) {
        int leftProduct = 1;
        int rightProduct = 1;

        for(int i=0;i<index;i++) {
            leftProduct *= arr[i];
        }

        for(int i=index+1;i< arr.length;i++) {
            rightProduct *= arr[i];
        }

        return leftProduct * rightProduct;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] products = new int[arr.length];

        for (int i=0;i< arr.length;i++) {
            products[i] = product(arr,i);
        }

        System.out.println("product array except itself " + Arrays.toString(products));

    }
}
