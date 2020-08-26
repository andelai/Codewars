package Kata;

import static org.junit.Assert.assertEquals;

import java.util.function.Function;

public class GetIterator {
	  public static Function<Integer, Integer> getIterator(Function<Integer, Integer> func, int times) {
		  return x -> { for (int i = 0; i<times; i++) x = func.apply(x); return x; };
	  }
	  
	  public static void main(String[] a) {
	        Function<Integer, Integer> getDouble = x -> x*2;
	        Function<Integer, Integer> custDouble = GetIterator.getIterator(getDouble, 1);
	        assertEquals("getDouble", (int)4, (int)custDouble.apply(2));
	        Function<Integer, Integer> getQuadruple = GetIterator.getIterator(getDouble, 2);
	        assertEquals("getQuadruple", (int)8, (int)getQuadruple.apply(2));
	  }
}
