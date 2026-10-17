package com.Deepak;

public class BinarySearch {
    static void main(String[] args) {
        int[] arr = {-22, -10, -5, -1, 0, 2, 5, 10, 13, 22, 32};
        int target = 2;
        int ans = binarySearch(arr , target);
        System.out.println(ans);
    }
    static int binarySearch(int[] arr , int target){
        // first point the start and end
        int start = 0;
        int end = arr.length - 1;
        // now compare start and end
        while(start <= end){
            //now, locating mid(integer) by applying average of index(start and end)
            int mid = start + (end - start)/2;
            // now, we will create sub array by shifting start or end
            if(arr[mid] < target){
                start = mid + 1;
            }else if (arr[mid] > target){
                end = mid - 1;
            }else{
                return mid;
            }
        }
        return -1;
    }

}
