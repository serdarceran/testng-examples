package com.amareshp.annotations;

import org.testng.annotations.Test;

//@Guice(moduleFactory = MyModuleFactory.class)
public class MyTestNGAnnotationTest extends MyAbstTest {


    @Test (dataProvider = "test1")
    @MyTestNGAnnotation(name="Jack", city="San Francisco", state="California")
    public void testMyAnnotation(String s,Integer i,String t) {
        System.out.println("test2:: "+s+" Integer : "+i+" Hello "+t);
        System.out.println("The metadata from @MyTestNGAnnotation should have already been printed.");
        System.out.println("Starting my test method...");
    }

}
