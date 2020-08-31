package Kata;

import static org.junit.Assert.assertArrayEquals;

public class Beggars {
	  public static int[] beggars(int[] values, int n) {
		   int[] ret = new int[n];
		   int c = 0;
		   while(c<values.length) {
		    	for( int k = 0; k<n; k++) {
		    		ret[k]+=values[c];
		    		c++;
		    		if(c==values.length) break;
		    	}
		    }
		    return ret;
		  }
	  
	  public static void main(String [] a) {
		    // Basic tests
	        int[] test = {1, 2, 3, 4, 5};
	        int[] a1 = {15}, a2 = {9, 6}, a3 = {5, 7, 3}, a4 = {1, 2, 3, 4, 5, 0}, a5 = {};
//	        assertArrayEquals(a1, beggars(test, 1));
	        assertArrayEquals(a2, beggars(test, 2));
	        assertArrayEquals(a3, beggars(test, 3));
	        assertArrayEquals(a4, beggars(test, 6));
	        assertArrayEquals(a5, beggars(test, 0));
	  }
}
