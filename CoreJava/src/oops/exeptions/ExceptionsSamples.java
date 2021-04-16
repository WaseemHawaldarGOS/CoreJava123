package oops.exeptions;

import java.io.FileInputStream;
import java.io.IOException;

public class ExceptionsSamples {

    public static void main(String[] args) {

        /**
         * Checked and unchecked exceptions.
         * arithmetic, nullPointer and arrayIndexOutOfBounds are unchecked exceptions,
         * so you may comment out catch block and add just finally, it would still compile.
         *
         * IOException or FileNotfound exception is a checked exception,
         * we need to necessary add catch block which would otherwise the code won't compile.
         */

        /*
        ArithmeticException
         */
        //ExceptionsSamples.arithmeticExceptionOccurence(0);
        //ExceptionsSamples.arithmeticExceptionOccurence(100);


        /*
        NullPointerException
         */
         //ExceptionsSamples.nullPointerExceptionOccurence(null);
        //ExceptionsSamples.nullPointerExceptionOccurence("Hello");


        /*
        ArrayIndexOutOfBoundsException
         */
        //int inputArray1[] = {1,2};
        //int inputArray2[] = {1,2,3};
        //ExceptionsSamples.arrayIndexOutOfBoundsExceptionOccurence(inputArray1);
        //ExceptionsSamples.arrayIndexOutOfBoundsExceptionOccurence(inputArray2);

        /*
        IOException
         */
        //String validFilePath = "D:\\java_training_workspace\\SampleFiles\\test.txt";
        //String invalidFilePath = "D:\\abc\\jjj";
        //ExceptionsSamples.IOExceptionOccurence(validFilePath);
        //ExceptionsSamples.IOExceptionOccurence(invalidFilePath);


    }

    public static void arithmeticExceptionOccurence(int divideBy){

        try{
            System.out.println(1000/divideBy);

        }catch(ArithmeticException e){
            e.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }
        finally{

        }
    }


    public static void nullPointerExceptionOccurence(String inputString){

        try{
            System.out.println(inputString.toString());

        }catch(NullPointerException e){
            e.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }finally{

        }
    }


    public static void arrayIndexOutOfBoundsExceptionOccurence(int[] inputArray){

        try{
            System.out.println(inputArray[2]);

        }catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }finally{

        }
    }

    public static void IOExceptionOccurence(String filePath){
        FileInputStream fin=null;
        int i;

        try{
            fin=new FileInputStream(filePath);
            while((i=fin.read())!=-1)
                System.out.print((char)i);
        }catch(IOException e){
            e.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            try {
                fin.close();
            }catch(IOException e){
                e.printStackTrace();
            }
        }
    }



}
