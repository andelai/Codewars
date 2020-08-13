package Kata;

import java.util.stream.IntStream;

public class IsSortedAndHow {
	  
	  public static String isSortedAndHow(int[] array) {
		  
		  boolean asc = IntStream.range(0, array.length - 1).allMatch(i -> array[i] <= array[i + 1]);
		  boolean desc = IntStream.range(0, array.length - 1).allMatch(i -> array[i] >= array[i + 1]);
		  
	      return asc ? "yes, ascending" : desc ? "yes, descending" : "no";
	  }
	  
}
