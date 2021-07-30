package com.training.arraytrials;

import java.util.Arrays;

public class ArrayTryouts {
    public static void main(String[] args) {
        int[] arr;
        arr= new int[]{100, 20, 34, 5, 56};
      /* for (int i=0;i<arr.length;i++) {
            arr[i]=i+10;
        }*/

       /*array initialization with for each loop is not possible
        because we access i in loop which is not any location to store value in that array
       exa. ->
        for (int i : arr) {
            i = i+10;
        }*/
        //use for each to access elements
        for (int i : arr) {
            System.out.print(i +"  ");
        }
        System.out.println("Array length  = "+arr.length);
        System.out.println("Array Max element  = "+Arrays.stream(arr).max().getAsInt());
        System.out.println("Array Min element  = "+ Arrays.stream(arr).min().getAsInt());
        double average = Arrays.stream(arr).average().getAsDouble();
        System.out.println("Array Average  = "+ average);
        System.out.println("******** Array Copy ********");
       int[] copiedArr=new int[5];
       System.arraycopy(arr,2,copiedArr,0,3);
        System.out.println("Original array ");
        for (int element:arr) {
            System.out.print(" "+element);
        }
        System.out.println();
        System.out.println("Copied array ");
        for (int j:copiedArr) {
            System.out.print(j+ " ");
        }
        System.out.println();
        System.out.println("********************");
        //comparison
        int[] arr1;
        arr1= new int[]{100, 20, 34, 5, 56};
        //int result=Arrays.compare(arr,arr1);
        int result=Arrays.compare(arr,copiedArr);
        if(result==0)
            System.out.println("Same arrays");
        else if(result<0)
            System.out.println("Second array has bigger elements");
        else
            System.out.println("First array has bigger elements");

        //equals()
        if(arr.equals(copiedArr)==true)
            System.out.println("Same arrays");
        else
            System.out.println("Different arrays");

        System.out.println("******Sorted Array ***********");
      // Arrays.stream(arr).sequential(); ?what it does???????
       // Arrays.sort(arr);     //sorts complete array
        System.out.println("Before Sorting");
        for (int i : arr) {
            System.out.print(i +"  ");
        }
        System.out.println("\nAfter sorting");
        Arrays.sort(arr,2,5); //sorts array from given index range
        for (int i : arr) {
            System.out.print(i +"  ");
        }
        Arrays.sort(arr);
        System.out.println("Whole sorted array");
        for (int i : arr) {
            System.out.print(i +"  ");
        }
        //to use binraySrearch() array must be sorted first
        int serachResult=Arrays.binarySearch(arr,58);   //if key is present -it returns its index
                                                            //if key is not present- it returns possible insertion position
                                                            //in that sorted array as negative value
        System.out.println("Search Result = "+serachResult);

    }
}
