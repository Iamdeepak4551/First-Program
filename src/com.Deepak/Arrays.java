package com.Deepak;

public class Arrays {
    public static void main(String[] args) {
        // Array : Syntax
        //datatype[] variable_name = new int[Size];
        //|-----Compile Time-----| = |-----Runtime---|
        // or directly
        // datetype[] variable_name = {2,5,6,99,23};
        int[] rollno; // declearation of array. rollno is getting defined in the stack memory
        rollno = new int[5]; // initialization : Actually  here object in being created in Heap memory.
                            // new : use to Create an object OR we can directly using {}
        System.out.println(rollno[1]);
        String[] names = new String[5];
        System.out.println(names[0]);
    }
}
