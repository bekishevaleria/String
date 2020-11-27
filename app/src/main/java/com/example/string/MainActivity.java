package com.example.string;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String str = "Всё, что нам нужно – это";
    TextView text;
    Button butt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = findViewById(R.id.text);
        butt = findViewById(R.id.butt);
    }

    public void butclick(View view) {

        text.setText(str + Phraser.PhraserGen());
    }
}