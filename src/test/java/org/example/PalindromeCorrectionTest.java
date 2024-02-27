package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeCorrectionTest {
     @Test
    public void isPalindromeTest(){
         PalindromeCorrection p = new PalindromeCorrection();
         assertTrue(p.isPalindrome("radar"));
         assertFalse(p.isPalindrome("yazid"));
         assertFalse(p.isPalindrome(null));
     }
}