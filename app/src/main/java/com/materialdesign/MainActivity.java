package com.materialdesign;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        MyAdapter adapter = new MyAdapter(getData());
        adapter.setOnItemClickListener(new MyAdapter.OnItemClickListener() {
            @Override
            public void OnItemClicked(int position) {
                Intent intent = new Intent();
                if (position == 0) {
                    intent.setClass(MainActivity.this, ToolbatActivity.class);
                } else if (position == 1) {
                    intent.setClass(MainActivity.this, DrawerActivity.class);
                } else if (position == 2) {
                    intent.setClass(MainActivity.this, NavigationActivity.class);
                } else if (position == 3) {
                    intent.setClass(MainActivity.this, FloatingActionActivity.class);
                } else if (position == 4) {
                    intent.setClass(MainActivity.this, CoordinatorActivity.class);
                } else if (position == 5) {
                    intent.setClass(MainActivity.this, AppBarActivity.class);
                } else if (position == 6) {
                    intent.setClass(MainActivity.this, CollapsingToobarActivity.class);
                }
                startActivity(intent);
            }
        });
        recyclerView.setAdapter(adapter);
    }


    private List<String> getData() {
        List<String> data = new ArrayList<String>();
        data.add("FloatAction");
        data.add("DrawerLayout");
        data.add("Navigation");
        data.add("FloatingAction");
        data.add("CoordinatorLayout");
        data.add("AppBarLayout");
        data.add("CollapsingToobar");
        return data;
    }
}
