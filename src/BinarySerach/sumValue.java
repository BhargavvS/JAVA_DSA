package BinarySerach;
import java.util.*;

public class sumValue {
    public static void find_flower_indices(int n, int t, int[] arr, int[] result) {
        // Write your logic here.
        int start = 0;
        int end = n-1;
        int mid, sum;
        while(start <= end) {
            mid = start + (end - start) / 2;
            sum = arr[start] + arr[mid];
            if (sum > t) {
                end = mid ;
            } else if (sum < t) {
                start++;
            } else {
                if(start == mid){
                    if(arr[mid+1] + arr[mid] == t ){
                        result[0] = mid;
                        result[1] = mid+1;
                        break;
                    }
                }
                result[0] = start;
                result[1] = mid;
                break;
            }
        }
    }

//    public static int[] sum(int[] arr, int s, int e,int t) {
////        System.out.println(s +","+ e);
//        while(s <= e){
//            if(arr[s]+arr[e] == t) {
//                return new int[]{s,e};
//            } else {
//                s++;
//                e--;
//            }
//        }
//
//        return new int[]{-1,-1};
//    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int t = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int[] result = new int[2];
        find_flower_indices(n, t, arr, result);
        System.out.println(result[0] + " " + result[1]);
    }
}
