package com.amareshp.annotations;

import com.google.inject.Module;
import com.google.inject.Binder;
import org.testng.ITestContext;

/**
 * Created by serdar on 29.01.2017.
 */
public class IntegrationServicesProvider extends GeneralModule implements Module {
    public IntegrationServicesProvider(ITestContext testContext, Class clazz) {
        super(testContext, clazz);
    }

    @Override
    public void configure(Binder binder) {
        Object ss = getCtx().getAttribute("ss");
        System.out.println(">>> " + ss.toString());
    }
}
