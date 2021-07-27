import java.util.Scanner;

/*Write a program to print * in Floyds format (using for and while loop)
               *
               *  *
               *  *  *
        */
public class FloydPattern {
    public static void main(String[] args) {
        int number,i,j;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Number : ");
        number=input.nextInt();
        for(i=1;i<=number;i++){
            j=1;
            while(j<=i) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
        }
    }
}
