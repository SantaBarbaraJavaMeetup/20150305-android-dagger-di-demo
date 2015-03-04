package com.citrix.daggerdemo;

import android.app.Application;

import dagger.ObjectGraph;

public abstract class DaggerApplication extends Application {

    private ObjectGraph objectGraph;

    @Override
    public void onCreate() {
        super.onCreate();
        objectGraph = ObjectGraph.create(modules());
    }

    public void inject(Object obj) {
        objectGraph.inject(obj);
    }

    protected abstract Object[] modules();

}
