package com.amareshp.annotations;

import com.google.inject.Binder;
import com.google.inject.Module;
import org.testng.ITestContext;


public abstract class GeneralModule implements Module {
    private ITestContext ctx;
    private Class clazz;

    public GeneralModule(ITestContext ctx, Class clazz) {
        this.ctx = ctx;
        this.clazz = clazz;
    }

    public Class getClazz() {
        return clazz;
    }

    public ITestContext getCtx() {
        return ctx;
    }

    public abstract void configure(Binder binder);
}
