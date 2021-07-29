//unchecked exception
package com.training.tryouts;

public class ArrayIndexException {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        try{
            for(int i=0;i<=10;i++)
                System.out.println(arr[i]);
        }catch (ArrayIndexOutOfBoundsException ae){
            System.out.println(ae.getMessage());
        }
        System.out.println("shweta");
    }
}
