package com.example.akif.numbershapes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import java.lang.NullPointerException;

public class MainActivity extends AppCompatActivity {

    class number{
        int number;

        public boolean isSquare(){

            double squareroot = Math.sqrt(number);

            return squareroot == Math.floor(squareroot);
        }

        public boolean isTriangular(){
            int x = 1;
            int triangularNumber = 1;
            while(triangularNumber < number){
                x++;
                triangularNumber+=x;
            }
            return triangularNumber == number;
        }
    }


    public void testNumber(View view){
        String message = "";
        EditText obj =(EditText) findViewById(R.id.editText);
            number myNumber = new number();
            myNumber.number = Integer.parseInt(obj.getText().toString());



            if(myNumber.isSquare()){
                if(myNumber.isTriangular()){
                    message = "Number is both square and triangular";
                }
                else{
                    message = "Number is square but not triangular";
                }
            }
            else{
                if(myNumber.isTriangular()){
                    message = "Number is not square but triangular";
                }
                else{
                    message = "Number is neither square nor triangular";
                }

            }

            Toast.makeText(getApplicationContext(),message,Toast.LENGTH_LONG).show();


        }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
