package com.example.lenovo.workoutapp;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatDialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.lenovo.workoutapp.R;

import org.w3c.dom.Text;

/**
 * Created by Lenovo on 25/05/2018.
 */

public class Dialog extends AppCompatDialogFragment{
    private EditText s,r,w;
    private Spinner sp;
    private int sets,reps,weight,snum;
    private DialogListener l;
    @Override
    public android.app.Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder b = new AlertDialog.Builder(getActivity());

        LayoutInflater inflater = getActivity().getLayoutInflater();
        View v = inflater.inflate(R.layout.dialogbox,null);
        b.setView(v).setTitle("Add your Workout").setNegativeButton("cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        }).setPositiveButton("ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                 sets = Integer.parseInt(s.getText().toString());
                 reps = Integer.parseInt(r.getText().toString());
                 weight = Integer.parseInt(w.getText().toString());
                 snum= sp.getSelectedItemPosition();


                 if(sets!=0&&reps!=0&&weight!=0)
                 l.getdata(sets,reps,weight,snum);


            }
        });

        s=(EditText)v.findViewById(R.id.Set);
        r=(EditText)v.findViewById(R.id.Rep);
        w=(EditText)v.findViewById(R.id.Weight);
        sp=(Spinner)v.findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(sp.getContext(),
           R.array.moves,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp.setAdapter(adapter);

            return b.create();


    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            l=(DialogListener)context;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public interface DialogListener{
         void getdata(int s,int r,int w,int sp);
    }
}
