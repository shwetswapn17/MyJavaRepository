/*Develop a java class with a method saveEvenNumbers(int N) using ArrayList to store
even numbers from 2 to N, where N is a integer which is passed as a parameter to the
method saveEvenNumbers().
The method should return the ArrayList (A1) created. In the same class create a method
printEvenNumbers()which iterates through the arrayList A1 in step 1, and It should
multiply each number with 2 and display it in format 4,8,12….2*N. and add these
numbers in a new ArrayList (A2). The new ArrayList (A2) created needs to be returned.
Create a method printEvenNumber(int N) parameter is a number N. This method should
search the arrayList (A1) for the existence of the number ‘N’ passed. If exists it should
return the Number else return zero.Hint: Use instance variable for storing the ArrayList
A1 and A2. NOTE: You can test the methods using a main method.
 */

package com.training.arraytrials;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

class EvenNumbersArrayList {
    public ArrayList saveEvenNumbers(int N){
        ArrayList<Integer> arrayList=new ArrayList<Integer>();
        for(int number=2;number<=N;number++)
        {
            if(number%2==0)
                arrayList.add(number);
        }
        return arrayList;
    }

    public ArrayList printEvenNumbers(ArrayList<Integer> A1){
        ArrayList<Integer> A2=new ArrayList<Integer>();
        int number,multiplication;
        for (int i = 0; i <A1.size() ; i++) {
            number=A1.get(i);
            multiplication= number*2;
            System.out.print(multiplication);
            if(i<A1.size()-1)
                System.out.print(",");
            A2.add(multiplication);
        }
        return A1;
    }

    public int printEvenNumber(int N,ArrayList<Integer> A1){
      //  A1.stream().sequential();
        if(A1.contains(N))
            return N;
        else
            return 0;

    }
}

public class DemoArrayList {
    public static void main(String[] args) {
        EvenNumbersArrayList obj=new EvenNumbersArrayList();
        int number,value;
        ArrayList<Integer> myArrayList=new ArrayList<Integer>();
        System.out.println("How many even numbers you want ?");
        Scanner input=new Scanner(System.in);
        number=input.nextInt();
        myArrayList=obj.saveEvenNumbers(number);
        obj.printEvenNumbers(myArrayList);
        System.out.println("\nWhich value you want to search in arraylist ?");
        value=input.nextInt();
        int result=obj.printEvenNumber(value,myArrayList);
        if(result!=0)
            System.out.println(value+" is present in arraylist");
        else
            System.out.println(value+" is not present in arraylist");
    }


}




