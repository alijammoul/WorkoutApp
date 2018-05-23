package com.example.lenovo.workoutapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button chest,shoulder,back,tri,bi,ab,leg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        chest = (Button) findViewById(R.id.Chest);
        leg = (Button) findViewById(R.id.Leg);
        ab = (Button) findViewById(R.id.Ab);
        bi = (Button) findViewById(R.id.Bicep);
        tri = (Button) findViewById(R.id.Tricep);
        back = (Button) findViewById(R.id.Back);
        shoulder = (Button) findViewById(R.id.Shoulder);

    }
    public void onBtnClicked(View v){

        switch(v.getId()){
            case R.id.Chest:
            case R.id.Back:
            case R.id.Shoulder:
            case R.id.Tricep:
            case R.id.Bicep:
            case R.id.Ab:
            case R.id.Leg:
        }

    }
}
