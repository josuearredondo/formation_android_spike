package com.josue.spike;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PalindromeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palindrome);

        /** Palindrome UI */
        final EditText editText = (EditText) findViewById(R.id.input_edit_text);
        final TextView textView = (TextView) findViewById(R.id.circle_text);

        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                Palindrome palindrome = new Palindrome();
                if (palindrome.isPalindrome(editText.getText().toString())) {
                    textView.setBackgroundResource(R.drawable.circle_text_green);
                }else {
                    textView.setBackgroundResource(R.drawable.circle_text_red);
                }
            }
            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
}
