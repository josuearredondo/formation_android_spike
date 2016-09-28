package com.josue.spike;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PalindromeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palindrome);

        /** Palindrome basic UI */
        final EditText editText = (EditText) findViewById(R.id.input_edit_text);
        final TextView textView = (TextView) findViewById(R.id.output_text_view);
        final Button button = (Button) findViewById(R.id.button_ok);
    }
}
