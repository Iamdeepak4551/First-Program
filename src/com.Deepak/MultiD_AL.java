package com.Deepak;

import javax.lang.model.type.ArrayType;
import java.util.ArrayList;
import java.util.Scanner;

public class MultiD_AL {
    public static void main(String[] args){
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        // initialization
        for(int i = 0 ; i < 3 ; i++){
            list.add(new ArrayList<>());
        }

        // add elements
        for(int i = 0 ; i < 3 ; i++){
            for(int j = 0 ; j<3 ; j++){
                list.get(i).add(in.nextInt());
            }
        }
        System.out.println(list);
    }
}
