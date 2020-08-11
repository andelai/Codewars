package Kata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Javatlacati on 01/03/2017.
 */
public class FindShortestTest {
    @Test
    public void findShort() throws Exception {
        assertEquals(3, FindShortest.findShort("bitcoin take over the world maybe who knows perhaps"));
        assertEquals(3, FindShortest.findShort("turns out random test cases are easier than writing out basic ones"));
    }

}