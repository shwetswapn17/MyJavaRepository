//Write a program to add all the values in a given number and print. Ex: 1234->10

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        int number,digit,sum=0,originalNumber;
        System.out.println("Enter a positive number : ");
        Scanner input=new Scanner(System.in);
        originalNumber=input.nextInt();
        for(number=originalNumber;number!=0;number=number/10){
            digit=number%10;
            sum=sum+digit;
        }
        System.out.println("Sum of digits in given number "+ originalNumber +" is "+ sum);
    }
}
