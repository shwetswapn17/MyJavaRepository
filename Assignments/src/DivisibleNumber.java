//Write a program to print first 5 values which are divisible by 2, 3, and 5.

public class DivisibleNumber {
    public static void main(String[] args) {
        int number=1,count=1,i;
        for(i=1;count<=5;i++) {
            if((number%2==0) || (number%3==0) || (number%5==0)) {
                System.out.println(number);
                count++;
            }
            number++;
        }

    }
}
