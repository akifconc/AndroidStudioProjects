package com.example.akif.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.*;

public class MainActivity extends AppCompatActivity {

    int n;

    public void guessNum(View view){

        EditText obj = (EditText) findViewById(R.id.TextField1);

        String s;
        assert obj != null;
        s = obj.getText().toString();

        int x = Integer.parseInt(s);

        if(x<n)
            Toast.makeText(getApplicationContext(),"you guessed a small number",Toast.LENGTH_LONG).show();
        if(x>n)
            Toast.makeText(getApplicationContext(),"you guessed a larger number",Toast.LENGTH_LONG).show();
        if(x==n) {
            Toast.makeText(getApplicationContext(), "Correct lets play again", Toast.LENGTH_LONG).show();
            Random r = new Random();
            n= r.nextInt(10);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random r = new Random();

        n = r.nextInt(50);
        System.out.println(n);

    }
}
