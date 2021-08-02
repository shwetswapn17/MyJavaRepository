public class DivideByZero {
    public static void main(String[] args) {
        System.out.println("17.0 / 0.0 = " + (17.0 / 0.0));  // infinity
        System.out.println("17.0 % 0.0 = " + (17.0 % 0.0));  // not a number
        //System.out.println("17 / 0 = " + (17 / 0));          // ERROR - ArithmeticException - (runtime exception)
        //System.out.println("17 % 0 = " + (17 % 0));          // ERROR - ArithmeticException - (runtime exception)
    }
}
