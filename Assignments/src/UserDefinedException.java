package com.training.tryouts;

class MyException extends Exception{
     MyException(){
         System.out.println("Myexception is executing...");
    }
}

public class UserDefinedException {
    public static void main(String[] args) {
        try {
            MyException e=new MyException();
            throw e;
        }catch (MyException ex){
            System.out.println(ex.getMessage());
        }

    }
}
