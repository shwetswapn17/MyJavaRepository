package com.training;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class MyMethods {
    private BufferedReader br = null;
    private String line = "";
    private String splitBy = ",";
    private String[] names;

    //readFile() - read contents of .csv file
    public void readFile(String fileName) {
        try {
//parsing a CSV file into BufferedReader class constructor
            br = new BufferedReader(new FileReader(fileName));
            while ((line = br.readLine()) != null)   //returns a Boolean value
            {
                names = line.split(splitBy);    // use comma as separator
                System.out.println("Name " + names[0] + " Gender " + names[1] + " Number of Children " + names[2]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*totalBirths() - print the number of unique girls names,
                      the number of unique boys names and
                      the total names in the file
     */
    public void totalBirths(String fileName) {
        int totalOfNames = 0;
        try {
//parsing a CSV file into BufferedReader class constructor
            br = new BufferedReader(new FileReader(fileName));
            while ((line = br.readLine()) != null)   //returns a Boolean value
            {
                names = line.split(splitBy);    // use comma as separator
                System.out.println("Name " + names[0]);
                totalOfNames++;
            }
            System.out.println("Total number of names in the file =  " + totalOfNames);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*int getRank(int year,String name,String gender) -
     (gender = F/M (female/male))
     This method returns the rank of the name in the file for the given gender,
     where rank 1 is the name with the largest number of births.
     If the name is not in the file, then -1 is returned.
     For example, in the file "yob2012short.csv", given the name Mason, the year 2012 and the
    gender ‘M’, the number returned is 2, as Mason is the boys name with the second highest
    number of births. Given the name Mason, the year 2012 and the gender ‘F’, the number
    returned is -1 as Mason does not appear with an F in that file.
     */
    int getRank(int year, String name, String gender) {
        int maleCount = 0, femaleCount = 0;

        try {
//parsing a CSV file into BufferedReader class constructor
            br = new BufferedReader(new FileReader("C:\\Users\\swapn\\IdeaProjects\\MyJavaRepository\\Assignments\\testing\\yob" + year + "short.csv"));
            while ((line = br.readLine()) != null) {
                names = line.split(splitBy);
                if (names[1].equalsIgnoreCase("m")) {
                    maleCount++;
                } else {//if(names[1].equalsIgnoreCase("f")){
                    femaleCount++;
                }
                if (names[0].equalsIgnoreCase(name) && gender.equalsIgnoreCase("m")) {
                    return maleCount;
                } else if (names[0].equalsIgnoreCase(name) && gender.equalsIgnoreCase("f")) {
                    return femaleCount;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return -1;
    }

    /* String getName(int year,int rank,String gender)
     This method returns the name of the person in the file at this rank, for the given gender, where
     rank 1 is the name with the largest number of births. If the rank does not exist in the file,
     then “NO NAME” is returned.
     */
    String getName(int year, int rank, String gender) {
        int maleCount = 0, femaleCount = 0;
        try {
//parsing a CSV file into BufferedReader class constructor
            br = new BufferedReader(new FileReader("C:\\Users\\swapn\\IdeaProjects\\MyJavaRepository\\Assignments\\testing\\yob" + year + "short.csv"));
            while ((line = br.readLine()) != null) {
                names = line.split(splitBy);
                if ((names[1]).equalsIgnoreCase("m")) {
                    maleCount++;
                    if (maleCount == rank && names[1].equalsIgnoreCase(gender)) {
                        return names[0];
                    }
                } else if ((names[1]).equalsIgnoreCase("f")) {
                    femaleCount++;
                    if (femaleCount == rank && names[1].equalsIgnoreCase(gender)) {
                        return names[0];
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "No Name";
    }


    /*What would your name be if you were born in a different year? ,
     This method determines what name would have been named if they were born in a different year,
     based on the same popularity.
     That is, you should determine the rank of name in the year they were born, and then print the
    name born in newYear that is at the same rank and same gender. For example, using the
    files "yob2012short.csv" and "yob2014short.csv", notice that in 2012 Isabella is the third
    most popular girl's name. If Isabella was born in 2014 instead, she would have been named
    Sophia, the third most popular girl's name that year. The output might look like this:
    Isabella born in 2012 would be Sophia if she was born in 2014.
    void whatIsNameInYear(String name,int bornYear,int newYear,String Gender)
     */
    void whatIsNameInYear(String name, int bornYear, int newYear, String gender) {
        int rank;
        String newName;
        rank=getRank(bornYear,name,gender);
        newName=getName(newYear,rank,gender);
        System.out.println(name+" born in "+bornYear+ " would be "+newName +" if born in " + newYear);
    }

    /*Write the method yearOfHighestRank that has two parameters: a string name, and a
    string named gender(F for female and M for male). This method selects a range of files to
    process and returns an integer, the year with the highest rank for the name and gender. If
    the name and gender are not in any of the selected files, it should return -1. For example,
    calling yearOfHighestRank with name Mason and gender ‘M’ and selecting the three test
    files above results in returning the year 2012. That is because Mason was ranked the 2nd
    most popular name in 2012, ranked 4th in 2013 and ranked 3rd in 2014. His highest
    ranking was in 2012.
     int yearOfHighestRank(String name,String gender)
     */
    int yearOfHighestRank(String name,String gender){
        return -1;
    }
}

public class BabyNamesAssignment {
    public static void main(String[] args) {
        MyMethods myObject=new MyMethods();
       // myObject.readFile("C:\\Users\\swapn\\IdeaProjects\\MyJavaRepository\\Assignments\\testing\\yob2012short.csv");

        // myObject.totalBirths("C:\\Users\\swapn\\IdeaProjects\\MyJavaRepository\\Assignments\\testing\\yob2012short.csv");

        /*int rank=myObject.getRank(2014,"olivia","f");
        if(rank==-1)
            System.out.println("Name not present in the file...");
        else
            System.out.println("Rank for given name = "+rank);
         */

        /*String result=myObject.getName(2014,3,"m");
        System.out.println(result);
        */

        myObject.whatIsNameInYear("Olivia",2013,2012,"f");


    }
}
