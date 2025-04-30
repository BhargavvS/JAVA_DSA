package BinarySerach;

import javax.xml.stream.events.StartDocument;

public class minimumLargestSum {
    public static void main(String[] args) {
            int[] arr = {7,2,5,8,10};
            int value = SliptArray(arr,3);
        System.out.println(value);
    }

    static int SliptArray(int[] arr, int m) {
        int start = 0, end =0;
        for(int i=0;i<arr.length;i++) {
            {
                start = Math.max(start, arr[i]);
                end += arr[i];
            }
        }

        while(start < end) {
            int mid = ( start + end ) / 2;

            int piceces = 1;
            int sum= 0;

            for(int num : arr) {
                if(num + sum > mid) {
                    piceces++;
                    sum = num;
                }
                else {
                    sum+= num;
                }
            }

            if(piceces > m) start = mid+1;
            else end = mid;
        }

        return end;
    }
}
