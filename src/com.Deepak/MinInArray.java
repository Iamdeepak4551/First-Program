package com.Deepak;

public class MinInArray {
    static void main(String[] args) {
        int[] arr ={28,32,-18,32,86,92,2};
        System.out.println(Min(arr));
    }
    static int Min(int[] arr ){
        if(arr.length == 0){
            return -1;
        }
        int ans = arr[0];
        for (int i = 1; i < arr.length ; i++) {
            if(arr[i] < ans){
                ans =  arr[i];
            }
        }
        return ans;
    }
}
