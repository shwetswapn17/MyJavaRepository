//unchecked

package com.training.tryouts;

public class ArrayNegativeSizeDemo {
    public static void main(String[] args) {
        try {
            int[] arr = new int[-3];

            for (int i = 0; i < 3; i++)
                System.out.println(arr[i]);
        }catch (NegativeArraySizeException e){
            System.out.println(e.getMessage()+" Please create array with positive size value....");
        }
        System.out.println("shweta");
    }
}
