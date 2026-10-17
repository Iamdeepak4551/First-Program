package com.Deepak;

public class LinearSearch {
    static void main(String[] args) {
        int[] nums = {45,32,25,99,6,-8,67,-58};
        int target = -58;
        int ans = linearsearch(nums , target);
        System.out.println(ans);

    }
    static int linearsearch(int[] arr , int target ){
        if(arr.length == 0){
            return -1;
        }
        for (int index = 0; index <= arr.length-1; index++) {
            if(arr[index] == target){
                return index;
            }
        }
        return -1;
    }
}
