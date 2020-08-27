package Kata;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

public class Decompose {

	  public String decompose(long n) {
	  
		  List<Integer> list = new ArrayList();
		  long sum = n*n;
		  long next = n-1;
		  
		  boolean found = false;
		  while(sum>0) {
			  
			  
			  if(sum == 0) found = true;
		  }
		  return null;
	  }
	  
	  public static void main(String[]a) {
			Decompose d = new Decompose();
		    long n = 11;
			assertEquals("1 2 4 10",  d.decompose(n));
	  }
}