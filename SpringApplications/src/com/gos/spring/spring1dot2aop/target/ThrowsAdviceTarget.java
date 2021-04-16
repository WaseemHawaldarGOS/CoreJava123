package com.gos.spring.spring1dot2aop.target;

import com.gos.spring.spring1dot2aop.throwsadvice.MyExceptions1;
import com.gos.spring.spring1dot2aop.throwsadvice.MyExceptions2;
import java.sql.SQLException;

public class ThrowsAdviceTarget {

    public String targetMethod(int id) throws Exception{

        System.out.println("Inside MyBusiness: ");
        if(id == 0){
            System.out.println("inside test1 . .");
            System.out.println("throwing  MyExceptions1 . .");
            throw new MyExceptions1("MyExceptions1");

        }
        else if(id == 1){
            System.out.println("inside test2");
            System.out.println("throwing  MyExceptions2 . .");
            throw new MyExceptions2("MyExceptions2");
        }
        else{
            System.out.println("Inside general test");
            System.out.println("throwing  SQLException . .");
            throw new SQLException("SQLException");
        }
    }
}
