package com.Deepak;

import java.util.Arrays;

public class BubbleSort {
    static void main(String[] args) {
        int[] arr = {32,1,6,-2,9};
        Bubble(arr);
        System.out.print(Arrays.toString(arr));
    }
    static void Bubble(int[] arr){
        boolean swapped;
        // for each step , max item will come at the last respective index
        for (int i = 0; i < arr.length ; i++) {
            swapped = false;
            // swap if the item is smaller than the previous item
            for (int j = 1 ; j < arr.length - i  ; j++) {

                if(arr[j] < arr[j-1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            // if you did not swap for a particular value of i , it means the array is sorted hence stop the program
            if(swapped == false)
                break;
        }
    }
}
