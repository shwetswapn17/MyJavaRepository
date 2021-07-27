/*Write a program to print the color name, based on color code. If color code in not valid
then print "Invalid Code". R->Red, B->Blue, G->Green, O->Orange, Y->Yellow,
W->White.
 */

import java.util.Scanner;

public class ColorCode {
    public static void main(String[] args) {
        char colorCode;
        System.out.println("Enter color code (R/B/G/W/Y/O)");
        Scanner input=new Scanner(System.in);
        colorCode=input.next().charAt(0);
        switch (colorCode)
        {
            case 'R':System.out.println("Red");
                        break;
            case 'B':System.out.println("Blue");
                break;
            case 'G':System.out.println("Green");
                break;
            case 'Y':System.out.println("Yellow");
                break;
            case 'W':System.out.println("White");
                break;
            case 'O':System.out.println("Orange");
                break;
            default:System.out.println("Invalid Code...");
        }

    }
}
