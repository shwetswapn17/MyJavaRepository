/*Write a program to check if the program has received command line arguments or not.
        If the program has not received the values then print "No Values", else print all the
        values in a single line separated by ,(comma). Eg1) java Example O/P: No values Eg2)
        java Example Mumbai Bangalore O/P: Mumbai,Bangalore [Note: You can use length
        property of an array to check its length*/

public class CommandLineArguments {
    public static void main(String[] args) {
       // System.out.println("Command line arguments are " + args[0] + args[1]);
        int arrayLength=args.length;
        System.out.println("Number of arguments = " + arrayLength);
        int i=0;
        if(arrayLength!=0) {
            System.out.println("You have entered commandline arguments ");
            while(i<arrayLength) {
                System.out.print(args[i]);
                i++;
                if(i<arrayLength)
                    System.out.print(",");
            }
        }
        else
            System.out.println("No Values");
    }

}
