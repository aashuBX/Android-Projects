package com.aashukumar.numberapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    class Number{

        int number;

        public boolean isSqueare(){

            double squareRoot = Math.sqrt(number);

            if (squareRoot == Math.floor(squareRoot)){
                return true;
            }
            else {
                return false;
            }
        }

        public boolean isTriangle(){
            int x = 1;
            int triangularNumber = 1;
            while (triangularNumber<number){
                x++;
                triangularNumber = triangularNumber + x;
            }

            if (triangularNumber == number){
                return true;
            }
            else{
                return false;
            }
        }
    }

    public void testNumber(View view){

        Log.i("info", "Button Pressed");


        EditText editText = (EditText) findViewById(R.id.editText);

        String message;
        if (editText.getText().toString().isEmpty()){

            message = "Please enter the number";
        }

        else {

            Number myNumber = new Number();
            myNumber.number = Integer.parseInt(editText.getText().toString());

            message = editText.getText().toString();

            if (myNumber.isSqueare() && myNumber.isTriangle()) {
                message += " is square and triangular";
            } else if (myNumber.isSqueare()) {
                message += " is a square number";
            } else if (myNumber.isTriangle()) {
                message += " is traingular not square";
            } else {
                message += " is neither triangular nor square";
            }

        }
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

}
