package com.Deepak;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[4];
        arr[0] = 45;
        arr[1] = 21;
        arr[2] = 4;
        arr[3] = 65;
        //[45 , 21 , 4 , 65]
//        System.out.println(arr[3]);

        // input using for loops
//        for(int i = 0 ; i<arr.length ; i++){
//            arr[i] = in.nextInt();
//        }
//        System.out.println(Arrays.toString(arr));

        for( int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");

        }
        System.out.println();
        for (int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();

        // Array of object
        String[] str = new String[4];
        for(int i = 0 ; i < str.length ; i++){
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));
    }
}
