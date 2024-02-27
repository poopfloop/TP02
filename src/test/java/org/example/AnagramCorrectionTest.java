package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramCorrectionTest {
    AnagramCorrection anagramCorrection = new AnagramCorrection();

    @Test
    public void isAnagram(){

        assertTrue(anagramCorrection.isAnagram("chien","niche"));
        assertFalse(anagramCorrection.isAnagram("chien","yazid"));
        assertTrue(anagramCorrection.isAnagram("yazid","y"));

    }

    @Test(expected = ArithmeticException.class)
    public void testIsAnagramExction() {
        anagramCorrection.isAnagram("yazid",null) ;

    }

    @Test(expected = ArithmeticException.class)
    public void testIsAnagramExction2() {
        anagramCorrection.isAnagram(null,"yazid") ;

    }



}