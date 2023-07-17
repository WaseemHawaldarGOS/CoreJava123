package com.gos.creational.builderpattern;

/*
https://www.javabrahman.com/design-patterns/builder-design-pattern-in-java/
 */
public class Client {

    public static void main(String args[]){
        DocCreationEngine engine=new DocCreationEngine();

        //Creating PDF Document
        PDFDocBuilder pdfDocBuilder=new PDFDocBuilder();
        engine.generateDocument(pdfDocBuilder);

        //Creating XML Document
        XMLDocBuilder xmlDocBuilder=new XMLDocBuilder();
        engine.generateDocument(xmlDocBuilder);
    }
}
