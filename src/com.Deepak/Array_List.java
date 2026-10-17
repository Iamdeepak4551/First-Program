package com.Deepak;

import java.util.ArrayList;
import java.util.Scanner;

public class Array_List {
    static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);
        Scanner in = new Scanner(System.in);
//        list.add(45);
//        list.add(25);
//        list.add(320);
//        list.add(85);
//        list.add(86);
//
//        System.out.println(list);
//        list.set(0 , 63);
//        System.out.println(list);
//        list.remove(2);
//        System.out.println(list);
//        System.out.println(list.contains(86));
//        System.out.println(list.contains(5642));
        System.out.print("Enter your ArrayList = ");
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }
        System.out.println(list);
        System.out.print("Get element of index: ");
        System.out.println(list.get(in.nextInt()));

        // get item at any index
//        for(int i = 0 ; i < 5 ; i++){
//            System.out.println(list.get(i));
//        }

    }

}
