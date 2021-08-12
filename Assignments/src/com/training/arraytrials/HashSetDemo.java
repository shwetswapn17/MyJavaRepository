package com.training.arraytrials;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        Set mySet=new HashSet();
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
        System.out.println("Size of HashSet = "+mySet.size());
        mySet.remove(null);
        Iterator itr1=mySet.iterator();
        while(itr1.hasNext()){
            System.out.println( itr1.next());
        }
        System.out.println("Size of HashSet = "+mySet.size());
    }
}


//HashSet
//duplicates are not allowed
//insertion order is not maintained
//accepts null value
//accepts all type of data at a time
