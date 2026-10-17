package com.Deepak;

import java.util.Arrays;

public class SelectionSort {
    static void main(String[] args) {
        int[] arr = {4,5,2,1,3};
        Selection(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void Selection(int[] arr){
        for(int i = 0 ; i <= arr.length-1 ; i++){
            int lastIndex = arr.length-i-1;
            int maxElement = getMaxElement(arr , 0 , lastIndex);
            swap(arr , maxElement , lastIndex);
        }
    }

    static void swap(int[] arr , int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int getMaxElement(int[] arr , int start , int last){
        int max = start ;
        for (int i = start; i <= last ; i++) {
            if(arr[max] < arr[i])
                max = i;
        }
        return max ;
    }
}
