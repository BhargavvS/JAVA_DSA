package BinarySerach;

public class minValueDuplicateArray {
    public static void main(String[] args) {
        int[] nums = {3,3,1,3,3,3,3};
        int min = findMin(nums);
        System.out.println(min);
    }
    static int findMin(int[] nums) {
        int peak = peakValue(nums);
        System.out.println(peak);
        int min = 0;
        if(peak != -1) {
            min = BS(nums, peak+1,nums.length-1);
        } else {
            min = BS(nums, 0 , nums.length-1);
        }

        return min;
    }

    static int peakValue(int[] arr) {
        int start = 0;
        int end = arr.length-1;

        while(start <  end) {
            int mid = start + (end - start) / 2;

            if(arr[start] ==  arr[mid] && arr[end] == arr[mid]) {
                if(arr[start] > arr[start+1]) {
                    System.out.println(arr[start] > arr[start+1]);
                    return start;
                }

                start++;

                if(arr[end] <  arr[end-1]) {
                    return end-1;
                }
                end--;
            }
            else if(start < end && arr[mid] > arr[mid+1]) return mid;
            else if(end > 0 && start > 0 && arr[mid] < arr[mid -1]) return mid-1;
            else if(arr[mid] >= arr[start]) start = mid +1 ;
            else end = mid -1;
        }

        return -1;
    }

    static int BS(int[] arr, int start, int end) {
        int min =Integer.MAX_VALUE;

        while(start <= end) {
            int mid = start + (end-start)/2;

            if(arr[mid] > min) end = mid-1;
            else {
                min = arr[mid];
                end = mid -1;
            }
        }

        return min;
    }
}
