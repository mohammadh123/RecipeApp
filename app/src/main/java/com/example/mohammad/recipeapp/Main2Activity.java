package com.example.mohammad.recipeapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {

    //public static boolean[] checkSelected;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        /*FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        }); */
        //onCheckboxClicked();
    }

    /*
    * Cite: http://developer.android.com/guide/topics/ui/controls/checkbox.html
    * Setting preferences
    * */
    public void onCheckboxClicked(View view){
        boolean checkedSelected = ((CheckBox)view).isChecked();
        switch(view.getId()){
            case R.id.KosherCheckBox:
                if(checkedSelected){
                    Toast.makeText(getBaseContext(), "Kosher is checked", Toast.LENGTH_LONG).show();
                } else{
                    Toast.makeText(getBaseContext(), "Kosher is unchecked", Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.PorkCheckBox:
                if(checkedSelected){
                    Toast.makeText(getBaseContext(), "Pork is checked", Toast.LENGTH_LONG).show();
                } else{
                    Toast.makeText(getBaseContext(), "Pork is unchecked", Toast.LENGTH_LONG).show();
                }
            case R.id.VegetarianCheckBox:
                if(checkedSelected){
                    Toast.makeText(getBaseContext(), "Vegetarian is checked", Toast.LENGTH_LONG).show();
                } else{
                    Toast.makeText(getBaseContext(), "Vegetarian is checked", Toast.LENGTH_LONG).show();
                }
        }
    }

}
