package com.jtanuki.go.recyclerview6;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    private TextView a;
    private Bundle extras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

    a = (TextView) findViewById(R.id.a);

        extras = getIntent().getExtras();

        a.setText(extras.getString("b"));

    }

}
