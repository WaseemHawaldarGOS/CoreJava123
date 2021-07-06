package com.gos.primitivesverseswrapper;


/**
 * Java is pass by value and it is not possible to pass integer by reference in Java directly. Objects created in Java are references which are passed by value.
 * Thus it can be achieved by some methods which are as follows:
 *
 * By creating Wrapper Class: As we know that Integer is an immutable class, so we wrap an integer value in a mutable object through this method.
 * Approach:
 *
 * Get the integer to be passed
 * Create an object of another class with this integer
 * Using wrapper class so as to wrap integer value in mutable object which can be changed or modified
 * Now whenever you need the integer, you have to get it through the object of the class
 * Hence the Integer has been passed by reference
 */
public class PassByReference {

    int data=50; //make it int or Integer, the behavior is same

    void change(PassByReference op){
        op.data=op.data+100;//changes will be in the instance variable
    }


    public static void main(String args[]){
        PassByReference op=new PassByReference();

        System.out.println("before change "+op.data);
        op.change(op);//passing object
        System.out.println("after change "+op.data);

    }
}
