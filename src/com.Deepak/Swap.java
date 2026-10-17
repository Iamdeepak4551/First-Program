package com.Deepak;
import java.util.Arrays;
public class Swap {
    static void main(String[] args) {
        int[] arr = {45 , 65 , 96 , 6 , 3};
        System.out.println("normal " + Arrays.toString(arr));
//        swap(arr , 1 , 4);
//        System.out.println("Swapped "+Arrays.toString(arr));
        reverse(arr);

        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr ){
        int start = 0 ;
        int end = arr.length - 1 ;
        while(start < end){
            swap(arr , start , end );
            start++;
            end--;
        }
    }

    static void swap(int[] arr , int index1 , int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
