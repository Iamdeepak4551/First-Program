import java.sql.SQLOutput;
import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args){
        // if-Statements
        /*
         if(condition T or F){
            // body will execute if conditions will T
         }
         else{
         // body will execute if condidions will F
         }
        */

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Salary = ");
        int salary = input.nextInt();
        if(salary > 25000){
            salary = salary + 2000;
        }else{
            salary = salary + 1000;
        }
        System.out.println(salary);

        //else-if Statement
        System.out.print("Enter your bonus = ");
        int bonus = input.nextInt();
        if(bonus >=2000){
            System.out.println("Excellent");
        } else if (bonus >= 1000) {
            System.out.println("good");
        }
        else{
            System.out.println("do some Work");
        }
    }
}
