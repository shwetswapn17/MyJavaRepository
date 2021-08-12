//checked exception - abstract class instantiation
//just a tryout...


package com.training.tryouts;

import java.util.Arrays;

abstract class AbstractDemo{
    abstract void myMethod();
}

public class ClassExceptionDemo {
    public static void main(String[] args) {
    try {
        //AbstractDemo obj=new AbstractDemo();  //error-AbstractDmeo
        /*AbstractDemo obj;
            obj = new AbstractDemo() {
            @Override
            void myMethod() {
                System.out.println("In overrided method");
            }
        };

         */
    }catch(Exception e){
        System.out.println(e.getMessage());
    }
        System.out.println("shweta");
        }
}








