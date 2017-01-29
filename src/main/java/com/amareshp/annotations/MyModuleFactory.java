package com.amareshp.annotations;

import com.google.inject.Module;
import org.testng.IModuleFactory;
import org.testng.ITestContext;

/**
 * Created by serdar on 29.01.2017.
 */
public class MyModuleFactory implements IModuleFactory {

    @Override
    public Module createModule(ITestContext tc, Class<?> aClass) {
        Object ss = tc.getAttribute("ss");

        return new IntegrationServicesProvider(tc, aClass);
    }
}
