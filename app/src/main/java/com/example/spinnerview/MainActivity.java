package com.example.spinnerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Spinner spinner;
    ArrayList<String> arrIds= new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner=findViewById(R.id.spinner);

        //spiner

        arrIds.add("Adhar Card");
        arrIds.add("PAN Card");
        arrIds.add("Voter ID Card");
        arrIds.add("Driving Licence Card");
        arrIds.add("Ration CArd");
        arrIds.add("Xth Score Card");
        arrIds.add("XIIth Score Card");

        ArrayAdapter<String> spinnerAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item,arrIds);
        spinner.setAdapter(spinnerAdapter);
    }
}