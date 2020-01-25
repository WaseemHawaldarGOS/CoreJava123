package com.gos.structural.adapterpattern;

import java.io.File;

public class FileEmailerAdapter extends FileCommiter{

    public FileEmailer fileEmailer;

    public FileEmailerAdapter(FileEmailer fileEmailer){
        this.fileEmailer=fileEmailer;
    }

    public void saveFile (File file){
        this.fileEmailer.emailFile(file);
    }
}
