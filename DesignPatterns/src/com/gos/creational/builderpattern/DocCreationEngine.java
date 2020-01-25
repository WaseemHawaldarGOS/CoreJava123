package com.gos.creational.builderpattern;

/*
https://www.javabrahman.com/design-patterns/builder-design-pattern-in-java/
 */
public class DocCreationEngine {

    public void generateDocument(DocBuilder builder){
        builder.createDocument();
        builder.createText();
        builder.createImages();
    }

}
