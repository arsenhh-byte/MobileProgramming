package com.example.lab1;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3 extends AppCompatActivity {

    TextView textView;
    String[] items = {"Milk", "Watch", "Pen", "Bread"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        textView = findViewById(R.id.textView);
        StringBuffer stringBuffer = new StringBuffer();
        for (String item : items) {
            stringBuffer.append(item).append("\n");
        }
        textView.setText(stringBuffer.toString());
    }
}
