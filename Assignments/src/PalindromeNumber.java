/*Write a Java program to find if the given number is palindrome or not
Example1:
C:\>java Sample 110011

 O/P Expected : 110011 is a palindrome
 */

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        int number,digit,reverseNumber=0,originalNumber;
        System.out.println("Enter any number : ");
        Scanner input=new Scanner(System.in);
        number=input.nextInt();
        originalNumber=number;
        while(number!=0){
            digit=number%10;
            reverseNumber=reverseNumber*10+digit;
            number=number/10;
        }
        System.out.println("Reverse number is : "+reverseNumber);
        if(reverseNumber==originalNumber)
            System.out.println("It's Palindrome number");
        else
            System.out.println("It's NOT Palindrome number");
    }
}
