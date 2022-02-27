package com.gos;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FileMethods {

    /**
     * it's now easier to read and write Strings from files.
     *
     * We can use the new readString and writeString static methods from the Files class:
     *
     */
    public static void main(String[] args) {
        try {
            /*
            Option 1 - Default location for file creation will be windows temporary dir
             */
            String tmpdir = System.getProperty("java.io.tmpdir");
            System.out.println("Temp file path: " + tmpdir);
            Path tempFile = Files.createTempFile("MyTempFile", ".txt");
            System.out.println("File is created at "+tmpdir+tempFile.getFileName());

            /*
            Option 2 - Provide custom path to existing directory
             */
            /*Path path = Paths.get("D://Waseem//Git code//coreJava//CoreJava123//Java11Examples//TempDir");
            Path tempFile = Files.createTempFile(path,"MyTempFile", ".txt");*/

            Path filePath = Files.writeString(tempFile, "Sample text");
            String fileContent = null;
            fileContent = Files.readString(filePath);
            assertEquals(fileContent, "Sample text");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
