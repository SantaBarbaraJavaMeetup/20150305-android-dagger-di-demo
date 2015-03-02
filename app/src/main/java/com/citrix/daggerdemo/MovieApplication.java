package com.citrix.daggerdemo;

import android.app.Application;

import dagger.ObjectGraph;

public class MovieApplication extends Application {

    private ObjectGraph objectGraph;

    @Override
    public void onCreate() {
        super.onCreate();
        objectGraph = ObjectGraph.create(MovieModule.class);
    }

    public void inject(Object obj) {
        objectGraph.inject(obj);
    }

}
