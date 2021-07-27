/* Write a program to accept gender ("Male" or "Female") and age (1-120) from command
line arguments and print the percentage of interest based on the given conditions.
Interest == 8.2% Gender ==> Female Age ==>1 to 58 Interest == 7.6% Gender ==>
Female Age ==>59 -120 Interest == 9.2% Gender ==> Male Age ==>1-60 Interest ==
8.3% Gender ==> Male Age ==>61-120

 */

public class MaleFemale {
    public static void main(String[] args) {
        String gender=args[0];
        int age=Integer.parseInt(args[1]);

       // String gender="female";
        //int age=23;
        System.out.println(gender);
        System.out.println(age);
        if((gender.equalsIgnoreCase("female")))
        {
            if(age>=1 && age<=58)
                System.out.println("Interest = 8.2%");
            else if(age>=59 && age<=120)
                System.out.println("Interest = 7.6%");
        }
        else if((gender.equalsIgnoreCase("male")))
        {
            if(age>=1 && age<=60)
                System.out.println("Interest = 9.2%");
            else if(age>=61 && age<=120)
                System.out.println("Interest = 8.3%");
        }
        else
            System.out.println("Gender is wrong...");

    }
}
