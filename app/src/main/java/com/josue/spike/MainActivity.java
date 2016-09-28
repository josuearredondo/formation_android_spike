package com.josue.spike;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /** Buttons menu */
        Button buttonPalindrome = (Button) findViewById(R.id.button1);
        Button buttonParenthesis = (Button) findViewById(R.id.button2);
        Button buttonFibonacci = (Button) findViewById(R.id.button3);
        Button buttonRandomText = (Button) findViewById(R.id.button4);
    }
    /** Called when the user clicks the Palindrome button */
    public void openPalindrome(View view) {
        Intent intent = new Intent(this, PalindromeActivity.class);
        startActivity(intent);
    }
    /** Called when the user clicks the Parenthesis button */
    public void openParenthesis(View view) {
        //Intent intent = new Intent(this, ParenthesisActivity.class);
        //startActivity(intent);
    }
    /** Called when the user clicks the Fibonaci button */
    public void openFibonaci(View view) {
        //Intent intent = new Intent(this, FibonaciActivity.class);
        //startActivity(intent);
    }
    /** Called when the user clicks the RandomText button */
    public void openRandomText(View view) {
        //Intent intent = new Intent(this, RandomTextActivity.class);
        //startActivity(intent);
    }
}
