package com.vadella.myintentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class MoveForResultActivity extends AppCompatActivity
implements View.OnClickListener{
        private Button btnChoose;
        private RadioGroup rgNumber;
        public static String EXTRA_SELECTED_VALUE = "extra_selected_value";
        public static int RESULT_CODE = 110;
        @Override
protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_for_result);
        btnChoose = (Button)findViewById(R.id.btn_choose);
        btnChoose.setOnClickListener(this);
        rgNumber = (RadioGroup)findViewById(R.id.rg_number);
        }
        @Override
public void onClick(View v) {
        if (v.getId() == R.id.btn_choose){
        if (rgNumber.getCheckedRadioButtonId() != 0){
        int value = 0;
        switch (rgNumber.getCheckedRadioButtonId()){
        case R.id.rb_1:
        value = 1;
            break;
            case R.id.rb_2:
                value = 2;
                break;
            case R.id.rb_3:
                value = 3;
                break;
            case R.id.rb_4:
                value = 4;
                break;
            }
            Intent resultIntent = new Intent();
            resultIntent.putExtra(EXTRA_SELECTED_VALUE, value);
            setResult(RESULT_CODE, resultIntent);
            finish();
            }
            }
            }
}