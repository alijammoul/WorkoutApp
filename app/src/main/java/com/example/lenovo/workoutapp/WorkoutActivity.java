package com.example.lenovo.workoutapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.GridView;
import android.widget.Toast;

import com.google.firebase.firestore.FirebaseFirestore;

import java.util.ArrayList;

public class WorkoutActivity extends AppCompatActivity implements Dialog.DialogListener {
    private FirebaseFirestore rs;
    private ArrayList moveslist;
    private String type;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        GridView gridview = (GridView) findViewById(R.id.moves);
        gridview.setAdapter(new MoveAdapter(this));
        rs=FirebaseFirestore.getInstance();
        type=getIntent().getStringExtra("Mode");










        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialog();
                Snackbar.make(view, "Workout Added", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    private void openDialog() {
        Dialog dialog = new Dialog();
        dialog.show(getSupportFragmentManager(),"Dialog");
    }

    public void getData(){

        moveslist = new ArrayList();


    }

    @Override
    public void getdata(int s, int r, int w,int snum) {
        Toast.makeText(getApplicationContext(),"we have the values " +s,Toast.LENGTH_SHORT).show();
    }
}
