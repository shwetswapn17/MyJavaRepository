//checked exception - abstract class instantiation

package com.training.tryouts;

abstract class AbstractDemo{
    abstract void myMethod();
}

public class ClassExceptionDemo {
    public static void main(String[] args) {
//    try {
        AbstractDemo obj;
        obj = new AbstractDemo() {
            @Override
            void myMethod() {
                System.out.println("In overrided method");
            }
        };
        System.out.println("shweta");
        }
}








