package com.josue.spike;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    /** First simple unit test for Palindrome */
    @Test
    public void wordIsPalindrome() throws Exception {
        Palindrome palindrome = new Palindrome();
        assertEquals(true, palindrome.isPalindrome("hooh"));
    }
    /** Unit test for Palindrome, with spaces */
    @Test
    public void wordIsPalindromeWithSpaces() throws Exception {
        Palindrome palindrome = new Palindrome();
        assertEquals(true, palindrome.isPalindrome(" ho oh "));
    }
    /** Unit test for Palindrome, with one letter in the middle*/
    @Test
    public void wordIsPalindromeLetterMiddle() throws Exception {
        Palindrome palindrome = new Palindrome();
        assertEquals(true, palindrome.isPalindrome("  h1ouo1h" ));
    }
}