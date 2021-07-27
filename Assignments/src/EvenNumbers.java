/*Write a program to print even numbers between 23 and 57, each number should be
printed in a separate row.

 */
public class EvenNumbers {
    public static void main(String[] args) {
        int number;
        for(number=23;number<=57;number++)
        {
            if(number%2==0)
                System.out.println(number);
        }
    }

}
