package com.example.akif.layoutdemo;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {



    public void fade(View view){

        ImageView first = (ImageView)findViewById(R.id.imageView);
        ImageView obj = (ImageView)findViewById(R.id.imageView2);


        first.animate()
                .translationXBy(1000f)
                .translationYBy(1000f)
                .rotationXBy(3600f)
                .setDuration(2000);
        //bj.animate().alpha(1f).setDuration(2000);
        //obj.setImageResource(R.drawable.grey);



    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView first = (ImageView)findViewById(R.id.imageView);

        first.setTranslationX(-1000f);
        first.setTranslationY(-1000f);
    }
}
