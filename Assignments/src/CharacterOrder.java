/*Initialize two character variables in a program and display the characters in alphabetical
        order. Eg1) if first character is s and second is e O/P: e,s Eg2) if first character is a and
        second is e O/P:a,e*/

import java.util.Scanner;

public class CharacterOrder {
    public static void main(String[] args) {
        char ch1='z',ch2='d';

        /*if user wants to enter
        char ch1,ch2;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter first character : ");
        ch1=input.next().charAt(0);
        System.out.println("Enter second character : ");
        ch2=input.next().charAt(0);*/

        if(ch1<ch2)
            System.out.print(ch1+","+ch2);
        else
            System.out.print(ch2+","+ch1);


    }
}
