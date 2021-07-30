/*Create an ArrayList which will be able to store only Strings. Create a printAll method
which will print all the elements using an Iterator.
 */

package com.training.arraytrials;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListForStrings {
    public static void printAll(List<String> list){
        Iterator itr=list.iterator();
        while(itr.hasNext()){
            Object obj=itr.next();
            System.out.println(obj);
        }
    }
    public static void main(String[] args) {
        List<String> myList=new ArrayList<String>();
        myList.add("Shweta");
        myList.add("Swapnil Patil");
        myList.add("Ovi Swapnil Patil");
        //myList.add(123); -not allowed because arraylist restricted to string
        //myList.add('s');  -not allowed because arraylist restricted to string
        //myList.add(12.3);  -not allowed because arraylist restricted to string

        printAll(myList);

    }
}
