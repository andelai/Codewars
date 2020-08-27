package Kata;

import static org.junit.Assert.assertEquals;

import java.util.function.IntUnaryOperator;

public class AdderFactory {

	  public static IntUnaryOperator create(int addTo) {
		  return x -> x+=addTo;
	  }
		 
	  public static void main(String[] a) {

		  assertEquals("Created add 1 function; gave it 4; did not get 5 back",
	              5, AdderFactory.create(1).applyAsInt(4));
  
	  }
}
