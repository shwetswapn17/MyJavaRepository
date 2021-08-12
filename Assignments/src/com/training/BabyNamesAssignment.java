package com.training;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BabyNamesAssignment {
    public static void main(String[] args) {
        String line = "";
        String splitBy = ",";
        try
        {
//parsing a CSV file into BufferedReader class constructor
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\swapn\\IdeaProjects\\MyJavaRepository\\Assignments\\testing\\yob2012short.csv"));
            while ((line = br.readLine()) != null)   //returns a Boolean value
            {
                String[] names = line.split(splitBy);    // use comma as separator
                System.out.println( "Name " +names[0] +" Gender "+ names[1] +" Number of Children "+  names[2]);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
