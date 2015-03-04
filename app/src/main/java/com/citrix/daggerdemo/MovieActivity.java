package com.citrix.daggerdemo;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import com.citrix.movies.MovieProcessor;

import javax.inject.Inject;

public class MovieActivity extends Activity {

    @Inject
    protected MovieProcessor movieProcessor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ((MovieApplication)getApplication()).inject(this);

        setContentView(R.layout.activity_dagger);

        final ListView listView = (ListView)findViewById(R.id.listView);
        listView.setAdapter(getArrayAdapter(""));

        EditText editText = (EditText)findViewById(R.id.editText);

        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {}

            @Override
            public void afterTextChanged(Editable s) {
                listView.setAdapter(getArrayAdapter(s.toString()));
            }
        });
    }

    private ArrayAdapter getArrayAdapter(String search) {
        return new ArrayAdapter<>(MovieActivity.this,
                R.layout.list_item,
                movieProcessor.getMoviesByTitle(search));
    }

}
