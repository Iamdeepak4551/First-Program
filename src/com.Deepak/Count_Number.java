import java.util.Scanner;

public class Count_Number {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number = ");
        int num = sc.nextInt();
        int count =0;
        System.out.print("Enter a digit to count = ");
        int reqDigit = sc.nextInt();
        while(num>0){
            int rem = num%10;
            if(rem == reqDigit){
                count++;
            }
            num /= 10;

        }
        System.out.println("Count of " + reqDigit + " is " + count);
    }
}
