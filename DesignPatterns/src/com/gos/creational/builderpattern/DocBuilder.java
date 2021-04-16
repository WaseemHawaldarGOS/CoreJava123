package com.gos.creational.builderpattern;

/*
https://www.javabrahman.com/design-patterns/builder-design-pattern-in-java/
 */
public abstract class DocBuilder {

    public abstract void createDocument();
    public abstract void createText();
    public abstract void createImages();
    public abstract Document getDocument();

}
