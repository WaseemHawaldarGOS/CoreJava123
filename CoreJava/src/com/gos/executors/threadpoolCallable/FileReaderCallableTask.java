package com.gos.executors.threadpoolCallable;

import java.io.FileInputStream;
import java.util.concurrent.Callable;

public class FileReaderCallableTask  implements Callable<String> {

    private String filePath;

    public FileReaderCallableTask(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public String call() throws Exception {
        FileInputStream fin=null;
        StringBuilder stringBuilder = new StringBuilder();

        try{
            fin=new FileInputStream(filePath);
            int i;
            while((i=fin.read())!=-1){
                //System.out.print((char)i);
                stringBuilder.append((char)i);
            }
            Thread.sleep(2000);

            fin.close();
        }catch(Exception e){
            System.out.println(e);
        }

        System.out.println("String Builder output is "+stringBuilder.toString());
        return stringBuilder.toString();
    }
}
