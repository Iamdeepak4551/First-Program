package com.Deepak;

public class OrderAgnosticBS {
    static void main(String[] args) {
//        int[] arr = {-22, -10, -5, -1, 0, 2, 5, 10, 13, 22, 32}; // asc
        int[] arr2 ={32, 22 ,13 , 5 , 2 , 0 , -1 , -5, -10, -22 }; // dec
        int target = 2;
        int ans = orderAgnosticBS(arr2 , target);
        System.out.println(ans);
    }
    static int orderAgnosticBS(int[] arr , int target){
        int start = 0;
        int end = arr.length - 1;
        // finding weather array is ascending or decending
        boolean isAsc = arr[start] < arr[end];

        while(start <= end){
            int mid = start +(end - start)/2;
            if(arr[mid] == target){
                return mid;
            }
            if(isAsc){
                if(arr[mid] < target){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }else{
                if(arr[mid] > target){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }
        }
        return  -1;
    }
}
