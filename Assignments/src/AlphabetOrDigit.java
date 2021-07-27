/*Intialize a character variable in a program and if the value is alphabet then print
"Alphabet" if it’s a number then print "Digit" and for other characters print "Special
Character"
 */

import java.util.Scanner;

public class AlphabetOrDigit {
    public static void main(String[] args) {
       // char ch='h';      //for fixed value

        char ch;
        System.out.println("Enter any character or number or special character : ");
        Scanner input=new Scanner(System.in);
        ch=input.next().charAt(0);
        if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
            System.out.println("Alphabet : " +ch);
        else if(Character.isDigit(ch))
            System.out.println("Digit : "+ch);
        else
            System.out.println("Special Character : "+ch);
    }
}
