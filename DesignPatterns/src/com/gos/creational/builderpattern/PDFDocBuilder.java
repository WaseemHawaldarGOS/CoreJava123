package com.gos.creational.builderpattern;

/*
https://www.javabrahman.com/design-patterns/builder-design-pattern-in-java/
 */
public class PDFDocBuilder extends DocBuilder {
    private PDFDocument pdfDoc;
    public void createDocument(){
        this.pdfDoc=new PDFDocument();
    }
    public void createText(){
        System.out.println("Creating text for PDF Document.");
    }
    public  void createImages(){
        System.out.println("Creating images for PDF Document.");
    }
    public  Document getDocument(){
        System.out.println("Fetching PDF Document.");
        return this.pdfDoc;
    }
}
