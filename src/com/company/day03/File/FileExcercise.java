package com.company.day03.File;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileExcercise {


    public static void main(String[] args) throws FileNotFoundException {
        //./
        File dir = new File("./");
        File[] files = dir.listFiles();

        for (File file : files) {
            System.out.println("file = " + file);
        }
    }

}
