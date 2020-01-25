package com.gos.java8methodreference;

/*
https://beginnersbook.com/2017/10/method-references-in-java-8/
 */


class Hello{
    public Hello(String say){
        System.out.print(say);
    }
}


public class ConstructorMethodReference {

    public static void main(String[] args) {
        //Method reference to a constructor
        MyInterface2 ref = Hello::new;
        ref.display("Hello World!");
    }


}
