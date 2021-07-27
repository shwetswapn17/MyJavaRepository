//Write a program to print prime numbers between 10 and 99.

import java.util.Scanner;

public class PrimeInRange {
    public static void main(String[] args) {
        int number,i;
        int flag;
        for(number=10;number<=99;number++)
        {
            flag=0;
             for(i=2;i<=number/2;i++)
             {
                if(number%i==0) {
                    flag = 1;
                    break;
                }
            }
            if(flag==0) {
                System.out.println(number);
            }
        }
    }
}
