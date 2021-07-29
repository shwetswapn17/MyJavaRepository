
//when we divide by zero- ArithmeticException- not checked by compiler (it's detected at runtime) - so UNCHECKED Exception

package com.training.tryouts;

public class DivideByZeroException {
    public static void main(String[] args){
        int number1,number2,result;
        number1=10;
        number2=0;
      //  result=number1/number2;
        try {

            result = number1 / number2;
            System.out.println("Number1 = " + number1);
            System.out.println("Number2 = " + number2);
           System.out.println("Result = " + result);
        }catch (ArithmeticException ae){
            System.out.println(ae.getMessage());
        }
        System.out.println("Shweta");
    }

}
