package com.gos.structural.adapterpattern;

import java.io.File;

/*
https://www.javabrahman.com/design-patterns/adapter-design-pattern-in-java/
 */
public class FileCommiter {

    String diskLocation;

    public FileCommiter(){
        //default constructor
    }

    public FileCommiter(String diskLocation){
        this.diskLocation=diskLocation;
    }

    public void saveFile(File file){
        System.out.println("File saved to disk using FileCommiter at location "+diskLocation);
    }
}
