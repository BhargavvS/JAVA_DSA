package Recurssion;

public class RSB {
    public static int search(int[] arr, int target, int start, int end) {
        if(start > end) {
            return -1;
        }

        int mid = start + (end -start) /2;

        if(arr[mid] == target) {
            return mid;
        }

        if(arr[start] < arr[mid]) {
            if(target >= arr[start] && target <= arr[mid]) {
                end = mid -1;
            } else{
                start = mid +1;
            }
        }

        if(arr[start] >= arr[mid] && arr[mid] <= arr[end]) {
            if(target >= arr[mid] && target <= arr[end]) {
                start = mid +1;
            } else {
                end = mid -1;
            }
        }

        return search(arr,target,start,end);
    }

    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9,10,1,2,3};
        int target = 4;
        System.out.println(search(arr,target,0,arr.length-1));
    }
}
