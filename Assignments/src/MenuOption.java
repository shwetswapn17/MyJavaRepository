/*Write a program that displays a menu with options 1. Add 2. Sub Based on the options
chosen, read 2 numbers and perform the relevant operation. After performing the
operation, the program should ask the user if he wants to continue. If the user presses y
or Y, then the program should continue displaying the menu else the program should
terminate. [ Note: Use Scanner class, you can take help from the trainer regarding the
same ]
 */

import java.util.Scanner;

public class MenuOption {
    public static void main(String[] args) {
        int number1,number2;
        int option;
        char choice;
        Scanner input=new Scanner(System.in);


        do{
            System.out.println("Enter your option 1/2");
            option=input.nextInt();
        switch (option)
        {
            case 1:
                System.out.println("Enter first number: ");
                number1= input.nextInt();
                System.out.println("Enter second number: ");
                number2= input.nextInt();
                System.out.println("Addition is : "+ (number1+number2));
                break;
            case 2:
                System.out.println("Enter first number: ");
                number1= input.nextInt();
                System.out.println("Enter second number: ");
                number2= input.nextInt();
                System.out.println("Subtraction is : "+ (number1-number2));
                break;
            default:System.out.println("Invalid Option");

        }
    System.out.println("Do you want to continue : (y/n)");
    choice=input.next().charAt(0);
        }while (choice=='y'||choice=='Y');
    }
}
