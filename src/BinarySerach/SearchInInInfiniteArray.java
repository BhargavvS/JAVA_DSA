package BinarySerach;

public class SearchInInInfiniteArray {
    public static void main(String[] args) {
        int[] arr = { 1 , 2, 4 , 5, 12, 15 , 16, 18, 21, 23,26,29,40,45};
        
        int start = 0,end = 1,target = 16;
        int i=2, index= -1;
        
        while(start>=0) {
            if(target >= arr[start] && target <= arr[end]){
                index = BS(arr,start,end,target);
                break;
            } else {
                i= i*2;
                start = end+1;
                end = end+i;
            }
        }

        System.out.println(index);
    }

    static int BS(int[] arr, int start, int end, int target) {
        int mid=-1;
        while(start<=end){
            mid = start + (end - start) / 2;
            if(target < arr[mid]) end = mid -1;
            else if(target > arr[mid]) start = mid +1;
            else {
                return mid;
            }
        }
        return mid;
    }
}
