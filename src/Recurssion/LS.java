package Recurssion;

import java.util.ArrayList;
import java.util.List;

public class LS {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,4,6};
        int target = 4;
//        System.out.println(find(arr,target,0));
//        System.out.println(findIndex(arr,target,0));
        System.out.println(findAll(arr,target,0,new ArrayList<>()));
    }


    static boolean find(int[] arr, int target,int index) {
        if(index == arr.length) {
            return false;
        }

        return arr[index] == target || find(arr, target, index+1);
    }

    static int findIndex(int[] arr, int target,int index) {
        if(index == arr.length) {
            return -1;
        }

       if(arr[index] == target) {
           return index;
       }
       return findIndex(arr,target,index+1);
    }

    static List<Integer> findAll(int[] arr, int target, int index, List<Integer> list) {
        if(index == arr.length) {
            return list;
        }

        if(arr[index] == target) {
            list.add(index);
        }

        findAll(arr, target, index+1, list);
        return list;
    }
}
