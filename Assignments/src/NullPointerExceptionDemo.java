//unchecked exception

package com.training.tryouts;

public class NullPointerExceptionDemo {
    public static void main(String[] args) {
        try {
            Object obj = null;
            obj.toString();
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
        System.out.println("shweta");
    }
}
