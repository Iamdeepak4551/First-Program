package com.Deepak;

import java.util.Arrays;

public class BinarySearch2D {
    static void main(String[] args){
        int[][] arr2D = {
                {5,10,15,20},
                {6,11,16,21},
                {7,12,17,22},
                {8,13,18,23}
        };
        System.out.println(Arrays.toString(Search2D(arr2D , 10)));

    }

    static int[] Search2D(int[][] arr2D , int target){
        int row = 0;
        int col = arr2D.length-1;
        while(row<= arr2D.length-1 && col>=0){
            if(arr2D[row][col] == target) {
                return new int[]{row, col};
            }
            if(arr2D[row][col] < target){
                row++;
            }else {
                col--;
            }

        }
        return new int[]{-1,-1};
    }
}
