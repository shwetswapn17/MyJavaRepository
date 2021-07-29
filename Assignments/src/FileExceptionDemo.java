//checked exception

package com.training.tryouts;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileExceptionDemo {
    public static void main(String[] args) {//throws FileNotFoundException {
       try {
            File myfile = new File("C://file.txt");
            FileReader fr = new FileReader(myfile);
            fr.close();
       }catch (FileNotFoundException e)
        {
            System.out.println(e.getMessage());
       } catch (IOException e) {
           e.printStackTrace();
           System.out.println("in IOexception block..");
       }


        System.out.println("shweta");
    }
}
