package com.materialdesign;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.widget.TextView;

/**
 * Created by lty on 2017-7-21.
 */

public class CollapsingToobarActivity extends AppCompatActivity {

    private TextView content = null;
    private CollapsingToolbarLayout collapsingToolbar = null;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collapsingtoolbar);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }


        content = (TextView) findViewById(R.id.content);
        collapsingToolbar = (CollapsingToolbarLayout) findViewById(R.id.collapsingToolbar);

        collapsingToolbar.setTitle("ABCD");

        for (int i = 0; i < 500; i++) {
            content.append("ABCDEFGHIJK");
        }


    }


}
