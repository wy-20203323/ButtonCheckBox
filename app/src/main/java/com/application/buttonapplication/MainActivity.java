package com.application.buttonapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener, View.OnClickListener {

    private CheckBox cb_one;
    private CheckBox cb_two;
    private CheckBox cb_three;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cb_one = findViewById(R.id.apple);
        cb_two = findViewById(R.id.watermelon);
        cb_three = findViewById(R.id.banana);
        Button button = findViewById(R.id.submit);

        cb_one.setOnCheckedChangeListener(this);
        cb_two.setOnCheckedChangeListener(this);
        cb_three.setOnCheckedChangeListener(this);
        button.setOnClickListener(this);

    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        if (compoundButton.isChecked()) {
//            Toast.makeText(this,compoundButton.getText().toString(),
//                    Toast.LENGTH_LONG).show();
        }
    }

    @Override
    public void onClick(View view) {
        String choose = "";
        if (cb_one.isChecked())
            choose += cb_one.getText().toString() + "、";
        if (cb_two.isChecked())
            choose += cb_two.getText().toString() + "、";
        if (cb_three.isChecked())
            choose += cb_three.getText().toString() + "、";

        Toast.makeText(this, choose, Toast.LENGTH_LONG).show();

    }
}