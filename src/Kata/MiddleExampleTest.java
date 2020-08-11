package Kata;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MiddleExampleTest {
  @Test
  public void evenTests() {
    assertEquals("es", MiddleExample.getMiddle("test"));
    assertEquals("dd", MiddleExample.getMiddle("middle"));
  }
  
  @Test
  public void oddTests() {
    assertEquals("t", MiddleExample.getMiddle("testing"));
    assertEquals("A", MiddleExample.getMiddle("A"));
  }
}

