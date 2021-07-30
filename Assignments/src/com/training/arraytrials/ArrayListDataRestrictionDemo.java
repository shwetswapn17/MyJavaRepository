/*Create an ArrayList which will be able to store only numbers like int,float,double,etc, but
not any other data type.
 */

package com.training.arraytrials;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDataRestrictionDemo {
    public static void main(String[] args) {
        List<Number> myList=new ArrayList<Number>();
        myList.add(11);
        myList.add(12.3f);
        myList.add(123);
        myList.add(null);
        //myList.add('S');      Number - allows only numerical values,not char or string
        //myList.add("Shweta");
        //myList.add(new Object());

       Iterator itr=myList.iterator();
       while(itr.hasNext()){
           Object element = itr.next();
           System.out.print(element + " ");
       }
    }
}

//Iterator goes in only forward direction
//ListIterator goes in forward as well as backward direction
//Iterator doesn't allow to replace value
//ListIterator allows to replace value