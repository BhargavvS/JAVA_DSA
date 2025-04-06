package linearSearch;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {10 , 20 , 30, 40 , 50 };
       int  target = 30;

       boolean exist = ls(arr, target);
       if(exist == true) {
           System.out.println("element exists in the array");
       } else {
           System.out.println("element doesnot exists");
       }

        System.out.println("element exists " + ls2(arr, target));
    }

    static boolean ls(int[] arr , int target) {
        boolean exist = false;
        for (int i=0;i<arr.length;i++) {
            if(target == arr[i]) {
                exist = true;
                break;
            }
            else{
                continue;
            }
        }

        return exist;
    }

    static int ls2(int[] arr , int target) {
        boolean exist = false;
        for (int j : arr) {
            if (target == j) {
                return j;
            }
        }

        return -1;
    }

}
