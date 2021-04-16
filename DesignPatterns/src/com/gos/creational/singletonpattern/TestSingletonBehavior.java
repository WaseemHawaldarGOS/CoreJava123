package com.gos.creational.singletonpattern;

public class TestSingletonBehavior {

    public static void main(String[] args) {

        /*
        Lazy loading single threaded singleton test - Positive case
         */

        LazyLoadingSingleThreadedSingleton lazyLoadingSingleThreadedSingleton = LazyLoadingSingleThreadedSingleton.getInstance();
        lazyLoadingSingleThreadedSingleton.setInstanceName("instance 1");
        System.out.println("First instance has been created and its name is "+lazyLoadingSingleThreadedSingleton.getInstanceName());


        LazyLoadingSingleThreadedSingleton lazyLoadingSingleThreadedSingleton2 = LazyLoadingSingleThreadedSingleton.getInstance();
        System.out.println("Second instance has been created and its name is "+lazyLoadingSingleThreadedSingleton2.getInstanceName());


        /*
        Lazy loading single threaded singleton test - Negative case
        */

        LazyLoadingSingleThreadedSingletonFailureCase lazyLoadingSingleThreadedSingletonFailureCase = LazyLoadingSingleThreadedSingletonFailureCase.getInstance();
        lazyLoadingSingleThreadedSingletonFailureCase.setInstanceName("failure instance 1");
        System.out.println("First failure instance has been created and its name is "+lazyLoadingSingleThreadedSingletonFailureCase.getInstanceName());


        LazyLoadingSingleThreadedSingletonFailureCase lazyLoadingSingleThreadedSingletonFailureCase2 = LazyLoadingSingleThreadedSingletonFailureCase.getInstance();
        System.out.println("Second failure instance has been created and its name is "+lazyLoadingSingleThreadedSingletonFailureCase2.getInstanceName());


    }
}
