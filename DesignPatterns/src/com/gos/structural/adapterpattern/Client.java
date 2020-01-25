package com.gos.structural.adapterpattern;

import java.io.File;

/*
https://www.javabrahman.com/design-patterns/adapter-design-pattern-in-java/
 */
public class Client{

    public static void main(String args[]){
        File file=new File(args[0]);
        FileCommiter fileCommiter=new FileCommiter("C:\\");
        fileCommiter.saveFile(file);//This will save the file on the disk location C: drive
        //Now we want to email with the same Target class FileCommiter
        fileCommiter=new FileEmailerAdapter(new FileEmailer("abcd@javabrahman.com"));
        fileCommiter.saveFile(file);//This will email the file to abcd@javabrahman.com
    }

}
