package com.Deepak;
import java.util.Arrays;
public class PassinginFunction {
    static void main(String[] args) {
        int[] nums = {22 , 63 , 89 , 5};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void change(int[] arr){
        arr[0] = 45;
    }
}
