package com.example.string;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String str = "Всё, что нам нужно – это ";
    TextView text;
    TextView res;
    Button butt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = findViewById(R.id.text);
        butt = findViewById(R.id.butt);
        res  = findViewById(R.id.res);
    }

    public void butclick(View view) {

        text.setText(str + Phraser.PhraserGen());
        String s = text.getText().toString();
        String left = s.substring(0,s.indexOf("– это")-1);
        String right = s.substring(s.indexOf("– это")+7);
        res.setText(Character.toUpperCase(s.charAt(s.indexOf("– это")+6))  + (right+" - это "+left+".").toLowerCase());
    }

}