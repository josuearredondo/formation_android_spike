package com.josue.spike;

import android.util.Log;

/**
 * Created by Human Booster on 28/09/2016.
 */

public class Palindrome {
    /** Method to discover is a text is Palindrome */
    public boolean isPalindrome(String phrase) {
        boolean bPalindrome = true;
        /** Delete spaces in the start/end text */
        StringBuilder sb = new StringBuilder(phrase);
        while(sb.charAt(0)== ' ') {
            sb.deleteCharAt(0);
        }
        String resultSpacesStart = sb.toString();
        StringBuilder sb2 = new StringBuilder(resultSpacesStart);
        int endPalindrome = resultSpacesStart.length()-1;
        while(sb2.charAt(endPalindrome)== ' ') {
            sb2.deleteCharAt(endPalindrome);
            endPalindrome =- endPalindrome;
        }
        String resultPalindrome = sb.toString();
        int inc = 0;
        int des = resultPalindrome.length()-1;
        while ((inc<des)){
            if (resultPalindrome.charAt(inc)==resultPalindrome.charAt(des)){
                inc++;
                des--;
            } else {
                bPalindrome = false;
            }
        }
        return bPalindrome;
    }
}
