package org.example;

import static org.junit.Assert.*;
import org.junit.Test;

public class PrimeTest {

    @Test
    public void isPrime(){
        Prime p = new Prime();
        assertFalse(p.isPrime(55));
        assertTrue(p.isPrime(7));
        assertFalse(p.isPrime(100));
        assertTrue(p.isPrime(3));
        assertFalse(p.isPrime(0));
    }


}