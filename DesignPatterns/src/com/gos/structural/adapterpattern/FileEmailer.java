package com.gos.structural.adapterpattern;

import java.io.File;

/*
https://www.javabrahman.com/design-patterns/adapter-design-pattern-in-java/
 */
public class FileEmailer {

    public String emailAddress;

    public FileEmailer(String emailAddress){
        this.emailAddress=emailAddress;
    }

    public void emailFile(File file){
        //Logic for emailing the file goes here
    }
}