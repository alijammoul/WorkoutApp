package com.example.lenovo.workoutapp;

import android.content.Intent;
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
            Intent i = new Intent(MainActivity.this,WorkoutActivity.class);
        switch(v.getId()){
            case R.id.Chest:
                i.putExtra("Mode","chest");
                startActivity(i);
            case R.id.Back:
                i.putExtra("Mode","back");
                startActivity(i);
            case R.id.Shoulder:
                i.putExtra("Mode","shoulder");
                startActivity(i);
            case R.id.Tricep:
                i.putExtra("Mode","tri");
                startActivity(i);
            case R.id.Bicep:
                i.putExtra("Mode","bi");
                startActivity(i);
            case R.id.Ab:
                i.putExtra("Mode","ab");
                startActivity(i);
            case R.id.Leg:
                i.putExtra("Mode","leg");
                startActivity(i);
        }

    }
}
