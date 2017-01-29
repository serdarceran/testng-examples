package com.amareshp.annotations;

import org.testng.annotations.DataProvider;

//@Guice(moduleFactory = MyModuleFactory.class)
public abstract class MyAbstTest {

    @DataProvider(name = "test1")
    public Object[][] createData1() {
        return new Object[][] {
                { "Cedric", new Integer(36),"mytest1"},
                { "Anne", new Integer(37),"mytest2"},
        };
    }
}
