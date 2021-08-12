//same as HashSet,however it maintains insertion order (linked meaning maintains insertion order)
//accepts null(same as HashSet)

package com.training.arraytrials;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        Set mySet=new LinkedHashSet();
        Set<Integer> mySet1=new LinkedHashSet<Integer>();
        mySet.add(10);
        mySet.add(1);
        mySet.add(23.3f);
        mySet.add(12);
        mySet.add(null);
        mySet.add(1);
        mySet.add(10);
        mySet.add("shweta");

        Iterator itr=mySet.iterator();
        while(itr.hasNext()){
            System.out.println( itr.next());
        }
        System.out.println("Size of LinkedHashSet = "+mySet.size());
        mySet.remove(null);
        Iterator itr1=mySet.iterator();
        while(itr1.hasNext()){
            System.out.println( itr1.next());
        }
        System.out.println("Size of LinkedHashSet = "+mySet.size());
        mySet1.add(99);
        mySet1.addAll(mySet);   //?now it accepts all types of values ?how
        mySet1.add(199);
        Iterator itr2=mySet1.iterator();
        while(itr2.hasNext()){
            System.out.println( itr2.next());
        }
        System.out.println("Size of mySet1 LinkedHashSet = "+mySet1.size());

    }
}
