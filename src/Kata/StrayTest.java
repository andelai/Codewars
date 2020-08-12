package Kata;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class StrayTest {
  
  @Test
  public void simpleArray1() {
//    assertEquals(2, getActualFor(1, 1, 2));
    assertEquals(3, getActualFor(17, 17, 3, 17, 17, 17, 17));
  }
  
  private int getActualFor(int... numbers) {
    return Stray.stray(numbers);
  }
}