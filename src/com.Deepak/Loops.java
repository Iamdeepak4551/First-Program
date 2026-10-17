package com.Deepak;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args){
        // for loop
//        for(initilization ; conditions ; increment/decrement){
//            // body
//        }
        // print till n
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println("");


        //while loop
        /*
        -> syntax
        initislization
        while(condition){
        // body
        incerment/decrement
        }
         */
        //print till n
        System.out.print("from where you want to start = ");
        int a = in.nextInt();
        System.out.print("Where you want to end = ");
        int b = in.nextInt();
        while(a<=b){
            System.out.print(a + " ");
            a++;
        }

        //do-while
        /*
        -> it execute once
        -> syntax
        do{
        //body
        increment / decrement
        }whlie(condition);

         */
        int me = in.nextInt();
        do{
            System.out.println("Hello Deepak");
            me++;
        }while(me<=10);

    }
}
