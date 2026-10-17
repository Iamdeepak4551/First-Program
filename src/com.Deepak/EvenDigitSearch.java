package com.Deepak;

public class EvenDigitSearch {
    static void main(String[] args) {
        int[] arr = {12,345,2,6,-45,7896,333,26};
        System.out.println(findNumber(arr));

    }
    // count the digits
    static int Count(int nums){
        int count = 0;
        if (nums<0){
            nums = nums*-1;
        }else{
            nums = nums;
        }
        while(nums > 0){
            nums = nums / 10 ;
            count++;
        }
        return count;
    }

    static int findNumber(int[] nums){
        int result = 0;
        for(int i = 0 ; i < nums.size ; i++){
            int digits = Count(nums[i]);
            if(digits%2==0){
                result++;
            }
        }
        return result;
    }
}
