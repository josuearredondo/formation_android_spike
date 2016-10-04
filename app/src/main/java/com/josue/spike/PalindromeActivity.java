package com.josue.spike;


import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class PalindromeActivity extends AppCompatActivity {
    private CoordinatorLayout coordinatorLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palindrome);

        /** TextView */
        final TextView reverseText = (TextView) findViewById(R.id.output_textView);

        /** Floating Action Button green/red */
        final FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.light_green)));
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v, "FAB is over me now.", Snackbar.LENGTH_LONG)
                        .setActionTextColor(Color.RED)
                        .setAction("Swipe", new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                // Your Action
                            }
                        }).show();
            }
        });

        /** Palindrome UI */
        final EditText editText = (EditText) findViewById(R.id.input_edit_text);
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                Palindrome palindrome = new Palindrome();
                /* Reverse text view*/
                reverseText.setText(new StringBuilder(editText.getText().toString()).reverse().toString());
                /* Changed color FAB if it's Palindrome or not*/
                if (palindrome.isPalindrome(editText.getText().toString())) {
                    fab.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.light_green)));
                    reverseText.setBackgroundDrawable(getResources().getDrawable(R.drawable.text_style));
                }else {
                    fab.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.light_red)));
                    reverseText.setBackgroundDrawable(getResources().getDrawable(R.drawable.text_style_red));
                }
            }
            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
}
