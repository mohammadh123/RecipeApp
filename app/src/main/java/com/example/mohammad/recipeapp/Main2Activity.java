package com.example.mohammad.recipeapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {

    public static boolean[] checkSelected;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    private void settingsPreference(){
        final ArrayList<String> items = new ArrayList<String>();
        items.add("Halal");
        items.add("Pork");
        items.add("Vegetarian");

        checkSelected = new boolean[items.size()];
        for(int i =0; i<checkSelected.length; i++){
            checkSelected[i] = false;
        }
    }

}
