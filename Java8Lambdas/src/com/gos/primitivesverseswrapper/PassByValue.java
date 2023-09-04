package com.gos.primitivesverseswrapper;

public class PassByValue {

    int data=50;

    void change(int data){
        data=data+100;//changes will be in the local variable only because primitives like integers are always pass by value
    }

    public static void main(String args[]){
        PassByValue op=new PassByValue();

        System.out.println("before change "+op.data);
        op.change(op.data);
        System.out.println("after change "+op.data);

    }
}
