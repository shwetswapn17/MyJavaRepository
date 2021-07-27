//Write a program to check if a given number is Positive, Negative, or Zero.

import java.util.Scanner;

public class PositiveNumber {
    public static void main(String[] args) {
        int number;
        System.out.println("Enter any number : ");
        Scanner input= new Scanner(System.in);
        //number= input.nextInt();      //query: which one should be used nextInt() or nextByte()
        number= input.nextByte();
        if(number > 0)
            System.out.println("Number " +number+ " is a positive number.");
        else if(number<0)
            System.out.println("Number " +number+ " is a negative number.");
        else System.out.println("You entered zero.");
    }
}
