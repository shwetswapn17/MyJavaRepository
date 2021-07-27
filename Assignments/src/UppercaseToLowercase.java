/*Write a program to convert from upper case to lower case and vice versa of an alphabet
        and print the old character and new character as shown in example (Ex: a->A, M->m).
 */

import java.util.Scanner;

public class UppercaseToLowercase {
    public static void main(String[] args) {
        char ch;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any character : ");
        ch = input.next().charAt(0);

        if (Character.isLetter(ch)) {
            System.out.println("Your entered character is: " + ch);
            if (Character.isLowerCase(ch))
                System.out.println("New character is: " + Character.toUpperCase(ch));
            else
                System.out.println("New character is: " + Character.toLowerCase(ch));
        }
        else
            System.out.println("You have entered wrong letter" +
                    "");
    }
}
