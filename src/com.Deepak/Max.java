package com.Deepak;

public class Max {
    static void main(String[] args) {
        int[] arr = {56 , 36 , 12 ,99 , 67 };
        System.out.println("max val of array = "+max(arr));
    }
    static int max(int[] arr){
        int MaxVal = arr[0];
        for (int i = 1; i < arr.length ; i++) {
            if(arr[i] > MaxVal){
                MaxVal = arr[i];
            }
        }
        return MaxVal;
    }
}
