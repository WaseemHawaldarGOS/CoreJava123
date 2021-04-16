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
        //Logic for saving the file at the diskLocation goes here
    }
}
