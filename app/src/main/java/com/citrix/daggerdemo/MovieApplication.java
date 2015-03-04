package com.citrix.daggerdemo;

public class MovieApplication extends DaggerApplication {

    @Override
    protected Object[] modules() {
        return new Object[] {MovieModule.class};
    }
}
