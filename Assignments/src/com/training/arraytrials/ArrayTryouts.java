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
        System.out.println("Copied array ");
        for (int j:copiedArr) {
            System.out.print(" "+j);
        }

        System.out.println("Sorted array ");


    }
}
