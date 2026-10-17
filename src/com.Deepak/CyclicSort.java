package com.Deepak;

import java.util.Arrays;

import static com.Deepak.SelectionSort.swap;

public class CyclicSort {
    static void main(String[] args) {
        int[] arrr = {3,5,1,4,2};
        sort(arrr);
        System.out.println(Arrays.toString(arrr));
    }

    static void sort(int[] arr){
        int i = 0;
        while(i<arr.length){
            int correct = arr[i]-1;
            if(arr[i] != arr[correct])
                swap(arr , i , correct);
            else
                i++;
        }
    }
}
