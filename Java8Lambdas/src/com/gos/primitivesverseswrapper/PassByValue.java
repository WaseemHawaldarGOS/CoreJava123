package com.gos.primitivesverseswrapper;

public class PassByValue {

    static int data=50;

    void change(int data){
        data=data+100;//changes will be in the local variable only
    }

    public static void main(String args[]){
        PassByValue op=new PassByValue();

        System.out.println("before change "+data);
        op.change(data);
        System.out.println("after change "+data);

    }
}
