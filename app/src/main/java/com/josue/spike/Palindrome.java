package com.josue.spike;

import android.util.Log;

/**
 * Created by Human Booster on 28/09/2016.
 */

public class Palindrome {
    /** Method to discover is a text is Palindrome */
    public boolean isPalindrome(String phrase) {
        boolean value=true;
        int i,ind;
        String cadena2="";
        /** Delete spaces in the start/end text */
        for (int x=0; x < phrase.length(); x++) {
            if (phrase.charAt(x) != ' ')
                cadena2 += phrase.charAt(x);
        }
        /** Asign values again */
        phrase=cadena2;
        ind=phrase.length();
        /** Compare phrase */
        for (i= 0 ;i < (phrase.length()); i++){
            if (phrase.substring(i, i+1).equals(phrase.substring(ind - 1, ind)) == false ) {
                /** If one letter is not corresponded, the phrase is not palindrome and left from the for*/
                value=false;
                break;
            }
            ind--;
        }
        return value;
    }
}
