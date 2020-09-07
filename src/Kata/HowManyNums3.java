package Kata;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HowManyNums3 {
    public static List<Long> findAll(final int sumDigits, final int numDigits) {
        // Your code here!!
        return null;
    }
    
    public static void main(String[]a) {
        assertEquals(Arrays.asList(8L, 118L, 334L),         findAll(10, 3));
        assertEquals(Arrays.asList(1L, 999L, 999L),         findAll(27, 3));
        assertEquals(new ArrayList<Long>(),                 findAll(84, 4));
        assertEquals(Arrays.asList(123L, 116999L, 566666L), findAll(35, 6));
 
    }
}
