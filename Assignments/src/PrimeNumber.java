//Write a program to check if a given number is prime or not

import javax.swing.*;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int number,i;
        int flag=0;
        System.out.println("Enter any number : ");
        Scanner input=new Scanner(System.in);
        number=input.nextInt();
        if(number<=0) {
            System.out.println("Please enter a positive number..");
            number=input.nextInt();
        }
        for(i=2;i<=number/2;i++)
        {
            if(number%i==0) {
                System.out.println(number+" is Not Prime...");
                flag = 1;
                break;
            }
        }
        if(flag==0)
            System.out.println(number + "  is Prime...");

    }
}
