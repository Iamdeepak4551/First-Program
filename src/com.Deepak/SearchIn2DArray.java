package com.Deepak;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class SearchIn2DArray {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr2D = {
                {23,89,54,-8},
                {56,29,32,},
                {-23,3,71}
        };
        System.out.print("Enter your requirement = ");
        int target = in.nextInt();
        int[] ans = Search2D(arr2D , target );
        System.out.println(Arrays.toString(ans));
        System.out.println(Max(arr2D));
        System.out.println(Integer.MAX_VALUE);
    }
    static int[] Search2D(int[][] arr2D , int target){
        for(int row = 0 ; row < arr2D.length ; row++){
            for(int col = 0 ; col < arr2D[row].length ; col++){
                if(arr2D[row][col] == target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
    static int Max(int[][] arr2D ){
        int max = Integer.MIN_VALUE;
        for(int row = 0; row< arr2D.length ; row++){
            for(int col = 0 ; col<arr2D[row].length ; col++){
                if(arr2D[row][col] > max){
                    max = arr2D[row][col];
                }
            }
        }
        return max;
    }

}
