package com.gos.structural.adapterpattern;

import java.io.File;

/*
https://www.javabrahman.com/design-patterns/adapter-design-pattern-in-java/
 */
public class FileEmailerAdapter extends FileCommiter{

    public FileEmailer fileEmailer;

    public FileEmailerAdapter(FileEmailer fileEmailer){
        this.fileEmailer=fileEmailer;
    }

    public void saveFile (File file){
        this.fileEmailer.emailFile(file);
    }
}
