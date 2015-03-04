package com.citrix.daggerdemo;

public class TestApplication extends DaggerApplication {

    @Override
    protected Object[] modules() {
        return new Object[] {TestModule.class};
    }

}
