package com.Deepak;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the operator = ");
        char op = input.next().trim().charAt(0);
        System.out.print("Enter the number1 = ");
        double num1 = input.nextDouble();
        System.out.print("Enter the number2 = ");
        double num2 = input.nextDouble();
        double answer = 0;
        if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
            if(op == '+'){
                answer = num1 + num2;
            }

            if(op == '-'){
                answer = num1 - num2;
            }

            if(op == '*'){
                answer = num1*num2;
            }

            if(num2 > 0){
                if( op == '/'){
                    answer = num1/num2;
                }
            }

            if ( op == '%'){
                answer = num1%num2;
            }
        }
        else{
            System.out.println("Enter the valid input or operator");
        }
        System.out.println(answer);

    }
}
