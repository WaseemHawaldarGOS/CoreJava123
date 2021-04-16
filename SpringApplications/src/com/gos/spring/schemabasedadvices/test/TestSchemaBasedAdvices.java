package com.gos.spring.schemabasedadvices.test;

import com.gos.spring.schemabasedadvices.afteradvice.AfterTarget;
import com.gos.spring.schemabasedadvices.aroundadvice.AroundTarget;
import com.gos.spring.schemabasedadvices.beforeadvice.BeforeTarget;
import com.gos.spring.schemabasedadvices.throwsadvice.ThrowsTarget;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSchemaBasedAdvices {


    /**
     * In order to use the advanced AOP concepts we need to make use of
     * ClassPathXmlApplicationContext, else the test class won't be able
     * to invoke the before advice
     */

    public static void main(String[] args) {
        try {
            ApplicationContext context = new ClassPathXmlApplicationContext("conf/schemaadvices-beans.xml");

            /*
            To test before advice
             */
/*            BeforeTarget beforeTarget = (BeforeTarget) context.getBean("beforeTarget");
            System.out.println("Inside main");
            System.out.println("Making a call to MyBusiness of BeforeTarget");
            beforeTarget.MyBusiness(0);*/


            /*
            To test after advice
             */
/*            AfterTarget afterTarget = (AfterTarget) context.getBean("afterTarget");
            System.out.println("Inside main");
            System.out.println("Making a call to MyBusiness of AfterTarget");
            afterTarget.MyBusiness(0);*/

            /*
            To test throws advice
             */
/*            ThrowsTarget throwsTarget = (ThrowsTarget) context.getBean("throwsTarget");
            System.out.println("Inside main");
            System.out.println("Making a call to MyBusiness of ThrowsTarget");
            //below line should call throws advice
            throwsTarget.MyBusiness(0);
            //below line should not call throws advice
            //throwsTarget.MyBusiness(1);*/

            /*
            To test around advice
             */
            AroundTarget aroundTarget = (AroundTarget) context.getBean("aroundTarget");
            System.out.println("Inside main");
            System.out.println("Making a call to MyBusiness of BeforeTarget");
            aroundTarget.MyMethod(0);

        }catch(Exception e){
            e.printStackTrace();
        }
    }


}
