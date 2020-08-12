package Kata;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;


public class FindNextSquareTest {
    @Test
    public void test1() {
        assertEquals(144, NextSquare.findNextSquare(121));
    }
    
    @Test
    public void test2() {
        assertEquals(676, NextSquare.findNextSquare(625));
    }
    
    @Test
    public void test3() {
        assertEquals(-1, NextSquare.findNextSquare(114));
    }
    
    
}