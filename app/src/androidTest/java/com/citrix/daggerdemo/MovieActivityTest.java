package com.citrix.daggerdemo;

import android.content.Intent;
import android.test.ActivityUnitTestCase;
import android.widget.EditText;
import android.widget.ListView;

import junit.framework.Assert;

public class MovieActivityTest extends ActivityUnitTestCase<MovieActivity> {

    public MovieActivityTest() {
        super(MovieActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        Intent intent = new Intent(getInstrumentation().getTargetContext(), MovieActivity.class);
        TestApplication application = new TestApplication();
        application.onCreate();
        setApplication(application);
        startActivity(intent, null, null);
    }

    public void testCreateActivity() {
        MovieActivity activity = getActivity();
        final EditText editText = (EditText)activity.findViewById(R.id.editText);
        ListView listView = (ListView)activity.findViewById(R.id.listView);

        Assert.assertEquals(TestApplication.class, activity.getApplication().getClass());

        getInstrumentation().runOnMainSync(new Runnable() {
            @Override
            public void run() {
                editText.requestFocus();
            }
        });
        getInstrumentation().waitForIdleSync();
        getInstrumentation().sendStringSync("Some Movie");
        getInstrumentation().waitForIdleSync();

        Assert.assertEquals(1, listView.getAdapter().getCount());
    }

}
