package com.gos.creational.builderpattern;

/*
https://www.javabrahman.com/design-patterns/builder-design-pattern-in-java/
 */
public class XMLDocBuilder extends DocBuilder {

    private XMLDocument xmlDoc;
    public void createDocument(){
        this.xmlDoc=new XMLDocument();
    }
    public void createText(){
        System.out.println("Creating text for XML Document.");
    }
    public  void createImages(){
        System.out.println("Creating images for XML Document.");
    }
    public  Document getDocument(){
        System.out.println("Fetching PDF Document.");
        return this.xmlDoc;
    }
}
