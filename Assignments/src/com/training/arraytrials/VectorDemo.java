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
//Implement this assignment with Vector.

package com.training.arraytrials;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;


class EvenNumbersVector {
    public List saveEvenNumbers(int N){
        List<Integer> myVector=new Vector<Integer>();
        for(int number=2;number<=N;number++)
        {
            if(number%2==0)
                myVector.add(number);
        }
        return myVector;
    }

    public List<Integer> printEvenNumbers(List<Integer> A1){
        List<Integer> A2=new Vector<Integer>();
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

    public int printEvenNumber(int N,List<Integer> A1){
        //  A1.stream().sequential();
        if(A1.contains(N))
            return N;
        else
            return 0;

    }
}

public class VectorDemo {
    public static void main(String[] args) {
        EvenNumbersVector obj=new EvenNumbersVector();
        int number,value;
        List<Integer> myvector=new Vector<Integer>();
        System.out.println("How many even numbers you want ?");
        Scanner input=new Scanner(System.in);
        number=input.nextInt();
        myvector=obj.saveEvenNumbers(number);
        obj.printEvenNumbers(myvector);
        System.out.println("\nWhich value you want to search in vector list ?");
        value=input.nextInt();
        int result=obj.printEvenNumber(value,myvector);
        if(result!=0)
            System.out.println(value+" is present in vector list");
        else
            System.out.println(value+" is not present in vector list");
    }


}




