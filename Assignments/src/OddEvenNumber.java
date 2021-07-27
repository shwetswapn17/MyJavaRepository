//Write a program to check if a given number is odd or even.

import java.util.Scanner;

public class OddEvenNumber {
    public static void main(String[] args) {
        int number;
        System.out.println("Enter any number : ");
        Scanner input=new Scanner(System.in);
        number= input.nextInt();
        if(number%2==0)
            System.out.println("Number " + number+ " is EVEN.");
        else
            System.out.println("Number " + number+ " is ODD.");
    }
}
