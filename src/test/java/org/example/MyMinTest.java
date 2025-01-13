package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyMinTest {

    @Test
    public void testPositive() {
        int out = MyMin.min(1, 2);
        assertEquals(1, out);
    }

    @Test
    public void testNegative() {
        int out = MyMin.min(-1, -2);
        assertEquals(-2, out);
    }
}