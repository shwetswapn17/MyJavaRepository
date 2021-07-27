/*Write a program to reverse a given number and print Eg1) I/P: 1234 O/P:4321 Eg2)
I/P:1004 O/P:4001
 */

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        int number,digit,sum=0;
        System.out.println("Enter any number : ");
        Scanner input=new Scanner(System.in);
        number=input.nextInt();
        while(number!=0){
            digit=number%10;
            sum=sum*10+digit;
            number=number/10;
        }
        System.out.println("Reverse number is : "+sum);
    }
}
