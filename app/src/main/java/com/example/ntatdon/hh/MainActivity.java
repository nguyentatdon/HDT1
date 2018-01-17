package com.example.ntatdon.hh;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int[] idButton = {R.id.btncham, R.id.btn0, R.id.btn1, R.id.btn2, R.id.btn3, R.id.btncong,
                R.id.btn4, R.id.btn5, R.id.btn6, R.id.btntru, R.id.btn7, R.id.btn8, R.id.btn9,
                R.id.btnnhan, R.id.btnchia, R.id.delete, R.id.btnbang};
        for (int id:idButton){
            View v = (View) findViewById(id);
            v.setOnClickListener(this);
        }
    }

    @Override
    public void onClick(View v) {

    }
}
